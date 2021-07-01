package com.company;

public class DSA_ReverseNumber {
    public static void main(String[] args) {
        int a = 12345;
        int reverse = 0;
        while(a != 0){
            reverse = (reverse * 10) + (a % 10);
            a = a/10;

        }
        System.out.println(reverse);


    }
}
