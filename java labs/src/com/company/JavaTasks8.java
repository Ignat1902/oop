package com.company;
import java.util.Scanner;
public class JavaTasks8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение первого ребра треугольника: ");
        int a = sc.nextInt();
        System.out.println("Введите значение второго ребра треугольника: ");
        int b = sc.nextInt();
        System.out.println(nextEdge(a,b));
    }
    public static int nextEdge(int a,int b)
    {
        int z = a+b-1;
        return z;
    }
}
