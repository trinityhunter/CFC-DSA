package com.company;
import java.util.Scanner;

public class DSA_A1Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the credits: ");
        int credits = sc.nextInt();

        if(credits >= 7500){
            System.out.println("Tera Leader");
        }
        else if(credits >= 6000 && credits < 7500){
            System.out.println("Gega Leader");
        }
        else if(credits >= 4500 && credits <6000){
            System.out.println("Mega Leader");
        }
        else{
            System.out.println("Rising Star");
        }


    }
}
