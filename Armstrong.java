package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int p = input.nextInt();
        int q = input.nextInt();
        int i;
        for(i=p;i<=q;i++){
            int n = i;
            int k = n;
            int s = 0;
            int a;
            while(n>=1){
                a = n % 10;
                s = s + (a*a*a);
                n = n / 10;
            }
            if(k == s){
                System.out.println(k + " is an Armstrong Number");
            }
        }
    }
}
