package com.company;

public class DSA_A1Q7h {
    public static void main(String[] args) {
        int n = 9;
        int nst1= n/2;
        int nst2=n/2;
        int nsp=1;
        int row=1;
        for(int i=0;i<n;i++) {
            System.out.print(" * ");
        }
        System.out.println();
        while(row<=(n-2)){

            int cst1=1;
            int cst2=1;
            int csp=1;
            while(cst1<=nst1) {
                System.out.print(" * ");
                cst1++;
            }
            while(csp<=nsp) {
                System.out.print("   ");
                csp++;
            }
            while(cst2<=nst2) {
                System.out.print(" * ");
                cst2++;
            }

            if(row<n/2) {
                nst1--;
                nst2--;
                nsp+=2;
            }else {
                nst1++;
                nst2++;
                nsp-=2;
            }
            row++;
            System.out.println();
        }
        for(int i=0;i<n;i++) {
            System.out.print(" * ");
        }
    }
}
