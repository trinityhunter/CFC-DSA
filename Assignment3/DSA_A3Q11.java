package com.company;
import java.util.Scanner;

public class DSA_A3Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String S: ");
        String str = sc.next();
        char[] ans = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                ans[i] = Character.toUpperCase(str.charAt(i));
            }
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                ans[i] = Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
