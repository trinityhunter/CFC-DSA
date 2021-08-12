package com.company;
import java.util.Scanner;

public class DSA_A3Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String S: ");
        String str = sc.next();
        StringBuilder builder = new StringBuilder(str);
        int [] arr = new int [str.length()];
        int [] arr1 = new int [str.length()-1];

        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }

        for(int i=0, j=1; i<str.length()-1; i++, j+=2){
            arr1[i] = arr[i+1] - arr[i];
            builder.insert(j, arr1[i]);

        }
        System.out.println(builder);
    }
}
