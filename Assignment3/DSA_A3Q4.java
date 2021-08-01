package com.company;
import java.util.Scanner;

public class DSA_A3Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = scan.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = scan.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

//        int [][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};

        int tle = arr.length * arr[0].length;
        int sr=0, sc=0;
        int er=arr.length - 1, ec=arr[0].length - 1;
        int dir = -1;

        while(tle !=0){
            dir = (dir + 1) % 4;

            if(dir==0){
                for(int i=sr; i<=er; i++){
                    System.out.print(arr[i][sc] + " ");
                    tle--;
                }
                sc++;
            }
            else if(dir==1){
                for(int i=sc; i<=ec; i++){
                    System.out.print(arr[er][i] + " ");
                    tle--;
                }
                er--;
            }
            else if(dir==2){
                for(int i=er; i>=sr; i--){
                    System.out.print(arr[i][ec] + " ");
                    tle--;
                }
                ec--;
            }
            else{
                for(int i=ec; i>=sc; i--){
                    System.out.print(arr[sr][i] + " ");
                    tle--;
                }
                sr++;
            }
        }


    }
}













