package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DSA_A2Q18i {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        ArrayList<Integer>arr = new ArrayList<Integer>(nums.length);
        int [] ans = new int [nums.length];

        for(int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            ans[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
