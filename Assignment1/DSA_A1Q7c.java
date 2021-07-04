package com.company;

public class DSA_A1Q7c {
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
            while(cst<=nst){
                if(cst<=(nst+1)/2){
                    System.out.print(cst);
                }
                else {
                    System.out.print(nst-cst+1);
                }
                cst++;
            }

            System.out.println();
            nsp = nsp - 1;
            nst = nst + 2;
            id++;
        }

    }

}