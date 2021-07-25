package com.company;

import java.util.Arrays;

// LeetCode 905
public class DSA_A2Q18e {
    public static void main(String[] args) {

        int [] arr1 = {3, 1, 2, 4};

        int [] arr2= new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            for(int j= 0; j< arr2.length; j++){
                if(arr1[i]%2==0){
                    arr2[j]=arr1[i];
                }
            }
        }
         System.out.println(Arrays.toString(arr2));

    }
}
