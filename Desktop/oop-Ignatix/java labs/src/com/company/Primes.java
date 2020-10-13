package com.company;
import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите N: ");
    int n = sc.nextInt();
       for (int j=2;j<=n;j++)
       {
           if (isPrime(j)==true)
           {
               System.out.println(j);
           };
       }
    }
    public static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
