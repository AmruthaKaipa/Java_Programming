package com.company;

public class Good_pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = count(nums);
        System.out.println(ans);
    }
    static int count(int[] nums){
        int c=0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c=c+1;
                }
            }
        }
        return c;
    }
}
