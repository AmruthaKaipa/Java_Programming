package com.company;

import java.util.Scanner;

public class greetingmsg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Hello "+name+",Welcome to java bootcamp");
    }
}
