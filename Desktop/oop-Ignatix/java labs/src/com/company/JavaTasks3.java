package com.company;
import java.util.Scanner;
public class JavaTasks3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество куриц: ");
        int x = sc.nextInt();
        System.out.println("Введите количество коров: ");
        int y = sc.nextInt();
        System.out.println("Введите количество свиней: ");
        int z = sc.nextInt();
        System.out.println("Общее количество ног животных: ");
        System.out.println(animals(x,y,z));
    }
    public static int animals(int chickens, int cows, int pigs)
    {
        int ch = 2 * chickens;
        int cow = 4 * cows;
        int pig = 4 * pigs;
        int sum = ch + cow + pig;
        return sum;
    }

}
