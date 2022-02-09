package com.company;

import java.util.Arrays;

public class Greatest_Candies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extracandies = 10;
        boolean[] ans = Kidswithcandies(candies,extracandies);
        System.out.println(Arrays.toString(ans));
    }
    static boolean[] Kidswithcandies(int[] candies,int extracandies){
        boolean[] ans = new boolean[candies.length];
        int max = candies[0]+extracandies;
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extracandies >= max){
                ans[i] = true;
            }
            else{
                ans[i] = false;
            }
        }
        return ans;
    }
}
