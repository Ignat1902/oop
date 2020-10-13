package com.company;
import java.util.Scanner;
public class Modul_2 {
    public static void main(String[] args) {
    Tasks1();
    Tasks2();
    Tasks3();
    Tasks4();
        Tasks5();
        Tasks6();
        Tasks7();
        Tasks8();
        Tasks9();
        Tasks10();

    }

    public static void Tasks1(){
        System.out.println("TASKS_1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String l = sc.nextLine();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        char [] str = l.toCharArray();
        System.out.print("Result: ");
        for (int i = 0; i<l.length();i++)
        {
            for (int j = 0;j<n;j++){
                System.out.print(str[i]);
            }
        }
    }

    public static void Tasks2(){
        System.out.println("TASKS_2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array: ");
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Result: ");
        int max = 1;
        int min = 1;
        for (int i = 0; i<N;i++)
        {
            if (arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max-min);
    }

    public static void Tasks3(){
        System.out.println("TASKS_3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array: ");
        int sum = 0;
        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<N;i++){
            sum = sum + arr[i];
        }
        double cr = 1.0*sum/N;
        System.out.print("Result: ");
        if (cr % 2==0){
            System.out.print(true);
        }
        else  {
            System.out.print(false);
        }
    }

    public static void Tasks4(){
        System.out.println("TASKS_4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array: ");
        int sum = 0;
        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1;i<N;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.print("Result: ");
        for (int i = 0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Tasks5(){
        System.out.println("TASKS_5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String l = sc.nextLine();
        char [] str = l.toCharArray();
        System.out.print("Result: ");
        int c = 0;
        for (int i = l.length()-1; i>=0;i--)
        {
            if (str[i]=='.') {
                System.out.print(c);
                c=0;
                i=-1;
            }
            else {
                c += 1;
            }
        }
        if (c!=0) {
            System.out.print(0);
        }
    }

    public static void Tasks6(){
        System.out.println("TASKS_6");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        int f=1;
        int y=0;
        int s=0;
        for (int i=1;i<x;i++){
           s=f;
           f=y+f;
           y=s;
        }
        if (x==0){
            System.out.print("Result " + 0);
        }
        else{
            System.out.print("Result " + f);
        }
    }

    public static void Tasks7(){
        System.out.println("TASKS_7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String l = sc.nextLine();
        System.out.print("Result: ");
        try {
            double num = Double.parseDouble(l);
        } catch (NumberFormatException e) {
            System.out.print(false);;
        }

        if (l.length()<=5){
            System.out.println(true);
        }
    }

    public static void Tasks8(){
        System.out.println("TASKS_8");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String l = sc.nextLine();
        System.out.print("Enter next a line: ");
        String s = sc.nextLine();
        char [] str1 = l.toCharArray();
        char [] str2 = s.toCharArray();
        if ((str1[0]==str2[s.length()-1])&&(str1[l.length()-1]==str2[0])){
            System.out.print("Result: "+ true);
        }
        else{
            System.out.print("Result: "+ false);
        }
    }

    public static void Tasks9(){
        System.out.println("TASKS_9");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String l = sc.nextLine();
        System.out.print("Enter next a line: ");
        String s = sc.nextLine();
        System.out.println("isPrefix");
        isPrefix(l,s);
        System.out.println("isSuffix");
        isSuffix(l,s);
    }

    public static boolean isPrefix(String str1, String str2) {
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static boolean isSuffix(String str1, String str2) {
        int h = 1;
        for (int i = str1.length() - str2.length() + 1; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(h))
                return false;
            h++;
        }
        return true;
    }

    public static void Tasks10(){
        System.out.println("TASKS_10");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                n += 3;
            }
            else
                n -= 1;
        }
        System.out.print(n);
    }
}
