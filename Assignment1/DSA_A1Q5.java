package com.company;
import java.util.Scanner;

public class DSA_A1Q5 {
    public static int numberOfDigits(int a){
        int count = 0;
        while(a>0){
            a = a / 10;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        System.out.println(numberOfDigits(a));
    }
}

