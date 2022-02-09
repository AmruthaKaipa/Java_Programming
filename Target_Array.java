package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_Array {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = TargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] TargetArray(int[] nums, int[] index){
        ArrayList <Integer> res = new ArrayList<>(10);
        for(int i = 0; i<nums.length; i++) {
            res.add(index[i], nums[i]);
        }
        int[] target = new int[res.size()];
        for(int i = 0; i<res.size(); i++) {
            target[i] = res.get(i);
        }
        return target;
    }
}
