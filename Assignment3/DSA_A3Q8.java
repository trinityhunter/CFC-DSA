package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class DSA_A3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array1: ");
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            arr1.add(sc.nextInt());
        }

        System.out.println("Enter the elements of array2: ");
        ArrayList<Integer> arr2 = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            arr2.add(sc.nextInt());
        }

        ArrayList <Integer> arr = new ArrayList<>();

        for(int i=0; i<arr1.size(); i++){
            for(int j=0; j<arr2.size(); j++){
                if (arr1.get(i).equals(arr2.get(j))) {
                    arr.add(arr1.get(i));
                    arr2.remove(arr2.get(j));
                    break;
                }
            }
        }
        System.out.println(arr);
    }
}
