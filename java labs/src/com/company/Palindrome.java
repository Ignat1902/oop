package com.company;

public class Palindrome {
    public static void main(String[] args){
        for (int i=0;i<args.length; i++) {
            String s = args[i];
            System.out.print(isPalindrome(s)+"\n");
        }
    }
    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i>=0;i--){
            r= r + s.charAt(i);
        }
        return r;
    }
    public static boolean isPalindrome(String s){
        String r = reverseString(s);
        if (s.equals(r)) {
            return true;
        }
        else {
            return false;
        }
    }
}