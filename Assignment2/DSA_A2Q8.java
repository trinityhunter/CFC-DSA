package com.company;
import java.util.Scanner;

public class DSA_A2Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]%5==0){
                count++;
            }
        }
        System.out.println("The total number of multiples of 5 in the given array is: " + count);
    }
}
