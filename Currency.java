package com.company;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Currency in rupees");
        double r = input.nextDouble();
        double USD = r / (74.575);
        System.out.println(r + " in rupees = " + USD + " in USD");
    }
}
