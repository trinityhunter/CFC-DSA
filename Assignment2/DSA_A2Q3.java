package com.company;
import java.util.Scanner;

public class DSA_A2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<= 'Z'){
            System.out.println("UpperCase");
        }
        else if(ch> 'a' && ch<= 'z'){
            System.out.println("LowerCase");
        }

    }
}
