package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int[] ans = shuffle(nums, n/2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int c = 0;
        for (int i=0; i < n; i++){
            res[c] = nums[i];
            res[c+1] = nums[i+n];
            c = c+2;
        }
        return res;
    }
}
