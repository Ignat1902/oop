package com.company;
import java.util.Scanner;

public class JavaTasks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Mod(a,b));
    }
    public static int Mod(int x, int y)
    {
        int z;
        z=x%y;
        return z;
    }
}
