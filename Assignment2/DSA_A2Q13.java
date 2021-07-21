package com.company;
import java.util.Arrays;

public class DSA_A2Q13 {
    public static void main(String[] args) {
        int [] arr = {12, 23, 34, 43, 54, 32, 21};
        int [] array = new int [arr.length];

        for(int i=0; i<arr.length; i++){
            array[i] = arr[arr.length - i -1];
        }
        System.out.println(Arrays.toString(array));
    }
}
