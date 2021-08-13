package com.company;

public class DSA_A3Q14a {
    public static void main(String[] args) {
        int [][] accounts = {{1 ,2, 3}, {1, 2, 3}};

        int max = 0;
        for(int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[0].length; j++){
                wealth += accounts[i][j];

                if(wealth>max){
                    max = wealth;
                }
            }
        }
        System.out.println(max);;
    }
}
