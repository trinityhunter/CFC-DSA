package com.company;

import java.util.Arrays;

public class DSA_A3Q14b {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};

        int [][] arr = new int[image.length][image[0].length];

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                arr[i][j] = image[i][image[j].length - j - 1];
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
