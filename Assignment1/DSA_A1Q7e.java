package com.company;

public class DSA_A1Q7e {
    public static int ncr(int n, int r) {

        int ans=1;

        for(int i=1;i<=r;i++) {
            ans= ans*(n-i+1)/i;
        }
        return ans;

    }

    public static void main(String[] args) {

            int nst=1;
            int row=1;
            System.out.println("1");
            while(row<=5) {
                int cst=0;
                while(cst<=nst) {
                    System.out.print(ncr(row,cst)+"  ");
                    cst++;
                }
                nst++;
                System.out.println();
                row++;
            }
    }
}
