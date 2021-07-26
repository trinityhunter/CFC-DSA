package com.company;

import java.util.Arrays;

public class DSA_A2Q18f {
    public static void main(String[] args) {
        int [] arr = {-4,-1,0,3,10};
        int [] arr2 = new int [arr.length];

        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i] * arr[i];
        }

        int i, j, key;

        for(j=1; j<arr2.length; j++){
            key = arr2[j];

            i = j - 1;
            while(i>=0 && key<arr2[i]){
                arr2[i+1] = arr2[i];
                i--;
            }
            arr2[i+1] = key;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
