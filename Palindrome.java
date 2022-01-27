package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.next();
        int j = s.length()-1;
        int i = 0;
        int f = 0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                f=1;
            }
            i++;
            j--;
        }
        if(f == 0){
            System.out.println(s + " is a Palindrome String");
        }
        else{
            System.out.println(s + " is not a Palindrome String");
        }
    }
}
