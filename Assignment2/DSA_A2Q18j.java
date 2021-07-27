package com.company;

import java.util.Arrays;

public class DSA_A2Q18j {
    public static void main(String[] args) {

        int [] prices = {8, 4, 6, 2, 3};

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(prices));

    }
}
