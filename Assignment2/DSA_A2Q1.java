package com.company;
import java.util.Scanner;

public class DSA_A2Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        int octa = 0;
        int count = 1;

            while(num > 0){
                octa = (octa)+ num % 8 * count;
                count = count *10;
                num = num / 8;
            }

        System.out.println("The Octal Format is " + octa);

    }
}
