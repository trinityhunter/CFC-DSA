package com.company;
import java.util.ArrayList;

public class DSA_A3Q14k {
    public static int maxPower(String s) {
        char arr[]=s.toCharArray();
        ArrayList<Integer> ls= new ArrayList<Integer>();
        int count=1,max=1;
        for(int i=0;i<arr.length;i++)
        {
            if((i+1!=arr.length) && (arr[i]==arr[i+1])){
                count++;
            }
            else{
                if(max<count){
                    max=count;
                }
                ls.add(count);
                count=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "cc";
        System.out.println(maxPower(s));
    }
}
