package com.company;

public class DSA_A1Q7i {
    public static void main(String[] args) {
        int n = 9;
        int nst1=1;
        int nst2=1;
        int nsp=n-2;
        int row=1;
        int val=0;
        for(int i=0;i<n;i++ ) {
            System.out.print((n/2)+1+" ");
        }
        System.out.println();
        while(row<=n-2) {
            val=n/2+1;
            int cst1=1;
            while(cst1<=nst1) {
                System.out.print(val+" ");
                cst1++;
                val--;
            }

            int csp=1;
            while(csp<=nsp) {
                System.out.print(val+" ");
                csp++;
            }
            val++;
            int cst2=1;
            while(cst2<=nst2) {
                System.out.print(val+" ");
                cst2++;
                val++;
            }
            if( row<=(n-2)/2) {
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
        for(int i=0;i<n;i++ ) {
            System.out.print((n/2)+1+ " ");
        }
    }
}
