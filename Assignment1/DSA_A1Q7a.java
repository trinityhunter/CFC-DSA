package com.company;

public class DSA_A1Q7a {
    public static void main(String[] args) {
        int id = 1;
        int row = 5;
        int nst = 1;
        while(id<=row){
            int cst = 1;
            while(cst<=nst){
                System.out.print("*   ");
                cst++;;
                id++;
            }
        }
    }

}