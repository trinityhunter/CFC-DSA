package com.company;
import java.util.Scanner;

public class DSA_A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount: ");
        int p = sc.nextInt();
        System.out.println("Enter the Rate: ");
        int r = sc.nextInt();
        System.out.println("Enter the Time: ");
        int t = sc.nextInt();

        int simpleInterest = (p*r*t) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}
