package com.company;

public class Task09 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = (number%10);
        number = number /10;
        for (int i=0;i<2;i++)
        {
            sum = sum+(number % 10);
            number = number /10;
        }
        return sum;
    }

}
