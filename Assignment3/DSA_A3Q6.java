package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class DSA_A3Q6 {
    public static int numberOfDigits(int C){
        int count=0;
        while(C>0){
            C = C/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements of the array 1: ");
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        int [] b = new int[m];
        System.out.println("Enter the elements of the array 2: ");
        for(int i=0; i<n; i++){
            b[i]=sc.nextInt();
        }
        int A = 0;
        int B = 0;

        for(int i=0; i<a.length; i++){
            A = A +  a[i] * (int) Math.pow(10, n-1);
            B = B + b[i] * (int) Math.pow(10, m-1);
            n--;
            m--;
        }

        int C = A + B;
        int c = numberOfDigits(C);
        int [] sol = new int [c];
        int abra;

        for(int i=c, index=0; i>0; i--, index++){
            abra = (C % (int) Math.pow(10,i) - C % (int) Math.pow(10, i-1));
            sol[index] = abra / (int) Math.pow(10, i-1);;
        }
        System.out.println(Arrays.toString(sol));
    }
}
