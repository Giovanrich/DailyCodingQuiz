/**
 *This problem was asked by Uber.
 * Given an array of integers, return a new array such that each element
 * at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 */
package com.dcp;

/**
 * @Created on Nov 19, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public class DCProblem2 {

    public static void main(String[] args) {
        int[] arr = getArray(new int[]{1, 2, 3, 4, 5});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] getArray(int[] array) {
        int[] ar = new int[array.length];

        for (int i = 0; i < array.length; i++) {
           int mult = 1;
            for (int j = 0; j < array.length; j++) {                
                if (i != j) {                    
                    //System.out.println("i="+i + " = " + mult +" * " +array[j]+" j= "+j+"   mult ="+(mult*array[j]));
                    mult = mult * array[j];
                    //System.out.println("Mult:"+mult);  
                    ar[i]=mult;
                }   
            }
                    
        }

//        
//        int mult = 1;
//
//        for (int i = 0; i < array.length; i++) {
//            mult=mult*array[i];
//        }
//        
//        for(int j=0;j<ar.length;j++){
//           ar[j]=mult/ar[j]; 
//        }
        return ar;
    }
}
