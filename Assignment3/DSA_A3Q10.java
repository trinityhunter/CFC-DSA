package com.company;
import java.util.Scanner;

public class DSA_A3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String S: ");
        String str = sc.next();
        int [] arr = new int [str.length()];
        char[] ans = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
            if((i+1)%2==0){
                arr[i]--;
            }
            else{
                arr[i]++;
            }
            ans[i] = (char) arr[i];
        }
        System.out.println(ans);
    }
}
