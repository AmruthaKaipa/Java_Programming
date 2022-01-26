package com.company;

import java.util.Scanner;

public class Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        float a = input.nextInt();
        float b = input.nextInt();
        float res=0;
        System.out.println("Enter the operator(+,-,*,/)");
        String s = input.next();
        if(s.equals("+")){
            res = (float)(a+b);
        }
        else if(s.equals("-")){
            res = (float)(a-b);
        }
        else if(s.equals("*")){
            res = (float)(a*b);
        }
        else if(s.equals("/")){
            res = (float)(a/b);
        }
        System.out.println("Result is " + res);
    }
}
