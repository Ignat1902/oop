package com.company;
import java.util.Scanner;
public class JavaTasks7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(addUpTo(a));
    }
     public static int addUpTo(int x)
     {
         int sum = 0;
         for (int i=1;i<=x;i++)
         {
             sum= sum+i;
         }
         return sum;
     }
}
