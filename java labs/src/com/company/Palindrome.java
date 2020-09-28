package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s=sc.next();
        isPalindrome(s);

    }
    public static String reverseString(String s) {
        String rez = "";
        for (int i = s.length() - 1; i >= 0; i--)
        rez = rez + s.charAt(i);
        return rez;
    }

    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }
        else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));

    }
}
