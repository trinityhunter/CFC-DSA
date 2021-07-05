package com.company;

public class DSA_A1Q7f {
    public static void main(String[] args) {
        int id = 1;
        int row = 5;
        int nst = 1;
        int nsp = row - 1;

        while(id<=(2*row)-1){

            int csp = 1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cst = 1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }

            System.out.println();

            if(id<row){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }

            id++;
        }
    }
}
