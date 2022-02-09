package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0;i<n;i++){
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int[] arr = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            int s = 0;
            for (int j = 0;j<=i;j++){
                s = s + nums[j];
            }
            arr[i] = s;
        }
        System.out.println(Arrays.toString(arr));



    }
}
