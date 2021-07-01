package com.company;
import java.util.Scanner;


public class DSA_Rotating {

    public static int numberOfDigits(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
/*
        int a = 43729;
        int b = 5;

 */

        int k = b % numberOfDigits(a) ;

        int x = numberOfDigits(a) - k;
        int y = numberOfDigits(a) + k;

        System.out.println("The new Rotated number is: ");

        if(k<=numberOfDigits(a) && k>=0){
            System.out.println(a % (int) Math.pow(10, k) * (int) Math.pow(10, x) + a / (int) (Math.pow(10, k)));
        }
        else if(k<0){
            System.out.println(a % (int) Math.pow(10, y) * (int) Math.pow(10, -k) + a / (int) Math.pow(10, y));
        }
    }
}
