package com.company;
import java.util.Scanner;

public class DSA_A3Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int [] ans = new int[arr.length];

        for(int i=0; i< arr.length - k + 1; i++){
            int max = arr[i];
            int min = arr[i+1];
            for(int j=i; j < k+i; j++){
                if(max<arr[j]){
                    max = arr[j];
                }
                if(arr[j]<min){
                    min = arr[j];
                }
                ans[i] = min + max;
            }

        }
        int sum = 0;
        for(int i=0; i< ans.length; i++){
            sum += ans[i];
        }
        System.out.println(sum);
    }
}
