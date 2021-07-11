package com.company;
import java.util.Scanner;

public class DSA_A2Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1  = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Char");
        char ch = sc.next().charAt(0);

        int solution = 0;
        if(ch=='*'){
            solution += n1 * n2;
        }
        else if(ch=='/'){
            solution += n1 / n2;
        }
        else if(ch=='%') {
            solution += n1 % n2;
        }
        else if(ch=='+'){
            solution += n1 + n2;
        } 
        else if (ch == '-') {
            solution += n1 - n2;
        }

        System.out.println("The solution is: " + solution);


    }
}
