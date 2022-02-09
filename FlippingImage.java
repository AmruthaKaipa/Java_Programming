package com.company;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans = Flip(image);
        for(int[]row:ans){
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] Flip(int[][] arr){
            int[][] res = new int[arr.length][arr.length];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    res[i][j]=arr[i][arr[i].length-1-j];
                    if(res[i][j] == 0){
                        res[i][j] = 1;
                    }
                    else{
                        res[i][j] = 0;
                    }
                }
            }
            return res;
    }
}
