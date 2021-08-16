package com.company;

public class DSA_A3Q14j {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};

        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i -1] = temp;
        }

        System.out.println(s);
    }
}
