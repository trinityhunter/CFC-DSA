package com.company;
import java.util.Scanner;

public class DSA_A2Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
            else{
                count--;
            }
        }
        if(count==n-1){
            System.out.println("The array is Sorted.");
        }
        else{
            System.out.println("The array is Not Sorted.");
        }
    }
}

