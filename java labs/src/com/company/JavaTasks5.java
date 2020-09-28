package com.company;
import java.util.Scanner;
public class JavaTasks5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = sc.nextInt();
        System.out.println("Введите a: ");
        int a = sc.nextInt();
        System.out.println("Введите b: ");
        int b = sc.nextInt();
        operation(N,a,b);
    }
    public static void operation(int N,int a, int b)
    {
        if (a+b==N)
            System.out.println("сложение");
        else if (a-b==N)
            System.out.println("вычитание");
        else if (a*b==N)
            System.out.println("умножение");
        else if (a/b==N)
            System.out.println("деление");
    }
}
