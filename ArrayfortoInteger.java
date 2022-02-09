package com.company;

import java.util.Arrays;

public class ArrayfortoInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k=34;
        int[] ans = Add(num,k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Add(int[] num,int k){
        int s =0;
        for(int i=0;i<num.length;i++){
            s = s * 10 + num[i];
        }
        s = s+k;
        for(int i=num.length-1;i>=0;i--){
            int a = s%10;
            num[i] = a;
            s = s/10;
        }
        return num;
    }
}
