package com.company;
import java.util.Scanner;

public class DSA_A3Q7 {
    public static void main(String[] args) {
//        int [] arr = {1, 3, 1, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int [] arr = new int [n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=arr.length-k; i++){
            int max=arr[i];
            for(int j=i+1; j< k + i; j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}

