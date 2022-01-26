package com.company;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int p = input.nextInt();
        System.out.println("Enter time in months");
        int t = input.nextInt();
        System.out.println("enter the rate of interest");
        int r = input.nextInt();
        float i = (p*t*r)/100f;
        System.out.println("Simple interest is " + i);
    }
}
