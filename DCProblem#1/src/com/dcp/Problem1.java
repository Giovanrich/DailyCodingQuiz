/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 */
package com.dcp;

import java.util.List;

/**
 * @Created on Nov 19, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public class Problem1 {

    public static void main(String[] args) {        
       
        System.out.println(exist(new int[]{10,15,3,9},17));
    }

    private static boolean exist(int[] list, int num) {
        int temp=0;
        boolean result=false;
        for (int i = 0; i < list.length; i++) {
            temp=list[i];
            System.out.println("temp=: "+i);
            for(int j=i+1;j<list.length;j++){
                System.out.println("Test :"+temp+" + " +list[j] +" ="+(temp+list[j]));
                if(num==(temp+list[j])){
                    result=true;
                }
            }
        }
        return result;
    }
}

//Out put aoccording to my program
//=================================
//temp=: 0
//Test :10 + 15 =25
//Test :10 + 3 =13
//Test :10 + 7 =17
//temp=: 1
//Test :15 + 3 =18
//Test :15 + 7 =22
//temp=: 2
//Test :3 + 7 =10
//temp=: 3
//true