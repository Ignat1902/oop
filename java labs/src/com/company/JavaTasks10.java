package com.company;
import java.util.Scanner;
public class JavaTasks10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = sc.nextInt();
        System.out.print("Введите B: ");
        int b = sc.nextInt();
        System.out.print("Введите C: ");
        int c = sc.nextInt();
        adcmatch(a,b,c);

    }
    public static void adcmatch(int a, int b, int c)
    {
        for (int i = 0;i<b;i++)
        {
            a = a+a;
        }
        if (a%c==0)
        {
            boolean z = true;
            System.out.println(z);
        }
        else {
             boolean z = false;
            System.out.println(z);
        }
    }
}