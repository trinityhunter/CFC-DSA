package com.company;

public class DSA_A1Q7g {
    public static void main(String[] args) {
        int n = 9;
        int nst1=1;
        int nst2=1;
        int nsp=n-1;
        int row=1;
        while(row<=n) {
            int cst1=1;
            while(cst1<=nst1) {
                System.out.print(" * ");
                cst1++;
            }
            int csp=1;
            while(csp<=nsp) {
                System.out.print("   ");
                csp++;
            }
            int cst2=1;
            while(cst2<=nst2) {
                System.out.print(" * ");
                cst2++;
            }
            if( row<=n/2) {
                nst1++;
                nst2++;
                nsp-=2;
            }else {
                nst1--;
                nst2--;
                nsp+=2;
            }
            System.out.println();
            row++;


        }


    }
}
