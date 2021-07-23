package com.company;

import java.util.ArrayList;
import java.util.List;

public class DSA_A2Q18b {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        candies = new int[]{2, 3, 5, 1, 3};
        extraCandies = 3;

        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);

        int max = candies[0];

        for(int i=1; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int j=0; j<candies.length; j++){
            if(candies[j] + extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }return result;
    }

    public static void main(String[] args) {


        
    }
}
