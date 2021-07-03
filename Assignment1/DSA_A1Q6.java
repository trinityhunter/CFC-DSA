package com.company;
import java.util.Scanner;

public class DSA_A1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int reverse = 0;
        while(a != 0){
            reverse = (reverse * 10) + (a % 10);
            a = a/10;
        }
        System.out.println("The reverse order is: " + reverse);
    }
}
