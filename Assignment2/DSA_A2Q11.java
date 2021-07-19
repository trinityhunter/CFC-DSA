package com.company;

import java.util.Arrays;

public class DSA_A2Q11 {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,1,0,0,0,1,0,0,1,1};

        int i, j, key;

        for(j=1; j<arr.length; j++){
            key = arr[j];

            i = j - 1;
            while(i>=0 && key<arr[i]){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
