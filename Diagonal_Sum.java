package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] mat = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                mat[i][j] = input.nextInt();
            }
        }
        for (int [] row : mat){
            System.out.println(Arrays.toString(row));
        }
        int ans = Sum(m,n,mat);
        System.out.println(ans);
    }
    static int Sum(int m,int n,int[][] mat){
        int sum =0;
        for(int i=0;i<m;i++){
            int j = m - 1-i;
            if(i != j){
                sum = sum + mat[i][j];
            }
            sum+=mat[i][i];
        }
        return sum;
    }
}
