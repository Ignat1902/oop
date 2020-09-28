package com.company;
import java.util.Scanner;

public class JavaTasks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите основание треугольника: ");
        int x = sc.nextInt();
        System.out.println("Введите высоту треугольника: ");
        int y = sc.nextInt();
        System.out.println(area(x,y));
    }
    public static int area (int a, int h)
    {
        int s = (a*h)/2;
        return s;
    }
}
