package com.company;
import java.util.Scanner;

public class DSA_A2Q7 {
    public static void lcm(int a, int b){
        for (int i = Math.min(a, b) ; i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("The LCM is: "+ (a*b)/i);
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
        lcm(a,b);
    }
}
