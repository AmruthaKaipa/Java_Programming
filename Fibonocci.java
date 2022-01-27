package com.company;

import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of series to be printed");
        int n = input.nextInt();
        int x1 = 0;
        int x2 = 1;
        System.out.println(x1);
        System.out.println(x2);
        int i=3;
        int x3;
        while(i<=n){
            x3 = x1 + x2;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;
            i++;
        }
    }
}
