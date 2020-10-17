package com.company;
import java.util.Scanner;

    public class Modul_1 {
        public static void main(String[] args) {
            Task01();
            Task02();
            Task03();
            Task04();
            Task05();
            Task06();
            Task07();
            Task08();
            Task09();
            Task10();
        }
        public static void Task01(){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Mod(a,b));
        }
        public static int Mod(int a,int b){
            return a%b;
        }
        public static void Task02(){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int h = sc.nextInt();
            System.out.println(area(a,h));
        }
        public static  int area(int a, int h){
            int S;
            S= (a*h)/2;
            return S;
        }
        public static void Task03(){
            Scanner sc = new Scanner(System.in);
            int chickens = sc.nextInt();
            int cows = sc.nextInt();
            int pigs = sc.nextInt();
            System.out.println(Legs(chickens,cows,pigs));
        }
        public static int Legs(int chickens, int cows, int pigs){
            int sum =chickens*2+cows*4+pigs*4;
            return sum;
        }
        public static void Task04(){
            Scanner sc = new Scanner(System.in);
            double prob = sc.nextDouble();
            int prize = sc.nextInt();
            int pay = sc.nextInt();
            System.out.println(Cond(prob, prize, pay));
        }
        public static boolean Cond(double prob,int prize, int pay){
            boolean c;
            if (prob * prize > pay){
                c = true;
            }
            else {
                c = false;
            }
            return c;
        }
        public static void Task05(){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            op(N, a, b);
        }
        public static void op(int N,int a, int b) {
            if (a + b == N)
                System.out.println("сложение");
            else if (a - b == N)
                System.out.println("вычитание");
            else if (a * b == N)
                System.out.println("умножение");
            else if (a / b == N)
                System.out.println("деление");
        }
        public static void Task06(){
            Scanner sc = new Scanner(System.in);
            char x = sc.next().charAt(0);
            System.out.println(kod(x));
        }
        public static int kod(char a){
            return a;
        }
        public static void Task07(){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(addUpTo(x));
        }
        public static int addUpTo(int x){
            int sum=0;
            for(int i=0; i<=x; i++){
                sum=sum+i;
            }
            return sum;
        }
        public static void Task08(){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(max(a,b));
        }
        public static int max(int a,int b){
            int c;
            c= a + b -1;
            return c;
        }
        public static void Task09(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(sumOfCubes(a,n));
        }
        public static double sumOfCubes(int[] arr,int n){
            double sum=0;
            for(int i=0; i< n; i++){
                sum= sum+ Math.pow(arr[i],3);
            }
            return sum;
        }
        public static void Task10(){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            ABCmath(a,b,c);
        }
        public static void ABCmath(int a,int b,int c) {
            for (int i = 0; i < b; i++) {
                a = a + a;
            }
            if (a % c == 0) {
                boolean z = true;
                System.out.println(z);
            } else {
                boolean z = false;
                System.out.println(z);
            }

        }
    }
