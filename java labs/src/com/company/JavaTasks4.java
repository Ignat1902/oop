package com.company;
import java.util.Scanner;
public class JavaTasks4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение prob: ");
        double x = sc.nextDouble();
        System.out.println("Введите значение prize: ");
        double y = sc.nextDouble();
        System.out.println("Введите значение pay: ");
        double z = sc.nextDouble();
        System.out.println(profitableGamble(x,y,z));
    }
    public static boolean profitableGamble(double prob,double prize, double pay)
    {
        boolean z;
        if (prob*prize>pay) {
            z=true;
        }
        else {
            z=false;
        }
        return z;
    }
}
