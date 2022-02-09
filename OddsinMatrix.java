package com.company;

import java.util.Arrays;

public class OddsinMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] indices = {
                {1, 1},
                {0, 0}
        };
        int ans = odds(m,n,indices);
        System.out.println(ans);
    }
    static int odds(int m, int n, int[][] indices){
        int [][] ini = new int[m][n];
        for(int i =0; i<m; i++){
            for(int j = 0; j<n;j++){
                ini[i][j] =0;
            }
        }
        for(int i=0;i< indices.length;i++){
            for(int j=0;j<indices[i].length;j++){
                if(j%2==0){
                    int r = indices[i][j];
                    for(int k=0;k<ini[r].length;k++){
                        ini[r][k]=ini[r][k]+1;
                    }
                }
                else{
                    int c = indices[i][j];
                    for(int k =0; k<ini.length;k++){
                        ini[k][c] = ini[k][c]+1;
                    }
                }
            }
        }
        //to print the initial matrix
        for(int[] row : ini){
            System.out.println(Arrays.toString(row));
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ini[i][j]%2!=0){
                    c=c+1;
                }
            }
        }
        return c;
    }
}
