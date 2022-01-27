package com.company;

import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.println(a + " is greater than "+ b);
        }
        else if (b>a){
            System.out.println(b + " is greater than "+ a);
        }
        else{
            System.out.println(a + "equals to" + b);
        }

    }

}
