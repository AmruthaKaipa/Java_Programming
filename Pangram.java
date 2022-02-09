package com.company;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownoxoxjumpsoverthelazydog";
        boolean b = pangarm(sentence);
        System.out.println(b);
    }
    static boolean pangarm(String sentence){
        int len = sentence.length();
        if(len<26){
            return false;
        }
        int[] num = new int[sentence.length()];
        int count=0;
        for(int i=0;i<sentence.length();i++){
            int temp = sentence.charAt(i)-97;
            if(num[temp]!=1){
                count++;
                num[temp]=1;
            }
            if(count == 26){
                return true;
            }
        }
        return false;
        }
}
