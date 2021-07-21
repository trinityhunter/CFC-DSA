package com.company;

public class DSA_A2Q14 {
    public static void main(String[] args) {
        int [] arr = {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6};
        int target = 8;

        for(int i = 0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
