/**
 * This problem was asked by Stripe.
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 * You can modify the input array in-place
 * int[] array = new int[]{1, 1, -5, -3, 3, 4, 2, 8};
 */
package com.tel.dcproblem3;

import java.util.Arrays;

/**
 * @Created on Nov 21, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public class DCProblem3 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 0};
        System.out.println("First Smallest Missing Int: " + getFirstMissingPosIn(array));
    }

    private static int getFirstMissingPosIn(int[] array) {
        int lowestPositiveInt = -10;
        int firstPositiveValue = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstPositiveValue = array[i];
                break;
            }
        }
        if (firstPositiveValue != 1) {
            lowestPositiveInt = 1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    if (i != array.length - 1) {//if not end of array
                        if (array[i] == array[i + 1]) {
                            //duplicates screened here
                        } else {
                            if ((array[i] + 1) != array[i + 1]) {
                                lowestPositiveInt = (array[i] + 1);
                                break;
                            }
                        }
                    } else if (i == array.length - 1) {
                        lowestPositiveInt = array[array.length - 1] + 1;
                    }
                }
            }//end of for-loop
        }
        return lowestPositiveInt;
    }
}
