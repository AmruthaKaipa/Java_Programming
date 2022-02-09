package com.company;

import java.util.Arrays;

public class Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = High_Altitude(gain);
        System.out.println(ans);

    }
    static int High_Altitude(int[] gain){
        int[] alti = new int[gain.length+1];
        alti[0]=0;
        for(int i=0;i<gain.length;i++){
            alti[i+1] = alti[i]+gain[i];
        }
        System.out.println(Arrays.toString(alti));
        int max = Integer.MIN_VALUE;
        for(int i=0;i<alti.length;i++){
            if(alti[i]>max){
                max=alti[i];
            }
        }
        return max;
    }
}
