package com.company;

import java.util.Scanner;

public class DSA_A2Q6 {
    public static void gcd(int a, int b){
        for (int i = Math.min(a, b) ; i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("The GCD is: "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        gcd(a,b);
    }

}
