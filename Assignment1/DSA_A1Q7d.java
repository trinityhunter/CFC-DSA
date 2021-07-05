package com.company;

public class DSA_A1Q7d {
    public static void main(String[] args) {
        int id = 1;
        int row = 5;
        int nst = 1;
        int nsp = row - 1;
        while(id<=row){
            int csp = 1;
            while(csp<=nsp) {
                System.out.print(" ");
                csp++;
            }

            int cst = 1;
            while(cst<=(nst)/2){
                System.out.print(cst+id-1);
                cst++;
            }
            while(cst>0){
                System.out.print(cst+id-1);
                cst--;
            }

            System.out.println();
            nsp = nsp - 1;
            nst = nst + 2;
            id++;
        }

    }

}