package com.company;

public class DSA_A2Q18c {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};

        int good = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    good++;
                }
            }
        }
        System.out.println(good);
    }
}
