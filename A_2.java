package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();
        int [] num = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0;i<n;i++){
            num[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int[] ans = new int[2*n];
        for (int i=0;i<ans.length;i++){
            ans[i] = num[i%n];
        }
        System.out.println(Arrays.toString(ans));

    }

}
