package com.company;
import java.util.Scanner;

public class DSA_A1Q4 {
    public static void evenNum(int n){
        int even=2;
        for(int i=1; i<=n; i++){
            System.out.print(even+" ");
            even+=4*i;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n=sc.nextInt();
        evenNum(n);
    }
}
