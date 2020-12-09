package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Modul_3 {
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
    public static void Tasks1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициенты для уравнения");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        System.out.println(Z1(a,b,c));
    }
    public static int Z1(float a,float b, float c){
        int k = 0;
        float d = b * b - 4 * a * c;
        if (d < 0){
            return k = 0;
        }
        else if (d ==0){
            return k = 1;
        }
        else if (d > 0){
            return k = 2;
        }
        return 0;
    }
    public static void Tasks2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String l = sc.nextLine();
        char [] str = l.toCharArray();
        System.out.println("Позиция второго вхождения: " + Z2(l));
    }
    public static int Z2(String l){
        for (int i=0; i<l.length(); i++){
            int first = l.indexOf("zip");
            int second = 0;
            second = l.indexOf("zip", first + 1);
            if (second!=0) return second;
        }
        return -1;
    }
    public static void Tasks3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();
        System.out.println("Ответ: " + Z3(num));
    }
    public static boolean Z3(int num) {
        int sum =0;
        boolean answer=false;
        for(int i=1;i<num;i++){
            if(num%i==0)
            {
                sum = sum+i;
            }
        }
        if (sum==num){
            answer = true;
        }
        return answer;
    }
    public static void Tasks4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println("Строка с заменой символов: " + Z4(s));
    }
    public static String Z4(String s) {
        if (s.length()<2) s= "несовместимо";
        if (s.charAt(0) == s.charAt(s.length()-1)) s = "два-это пара.";
        int n= s.length();
        char[] c = s.toCharArray();
        char t = c[0];
        c[0]=c[n-1];
        c[n-1]=t;
        String s1 = new String(c);

        return s1;
    }
    public static void Tasks5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println("Ответ: " + Z5(s));
    }
    public static boolean Z5(String s) {
        return s.matches("#[0-9a-fA-F]+");
    }
    
    public static void Tasks6() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первый массив");
        String s = sc.nextLine();
        System.out.println("Введите второй массив");
        String s1 = sc1.nextLine();
        System.out.println("Ответ: " + Z6(s,s1));
    }
    public static boolean Z6(String s, String s1) {
        int d1,d2;
        char[] c1 = s.toCharArray();
        char[] c2 = s1.toCharArray();
        ArrayList<Integer> Arr1 = new ArrayList<>();
        ArrayList<Integer> Arr2 = new ArrayList<>();
        for(int i:c1){
            if (!Arr1.contains(i)) Arr1.add(i);
        }
        for(int j:c2){
            if (!Arr2.contains(j)) Arr2.add(j);
        }
        if (Arr1.size()==1){
            d1 = 0;
        } else {
            d1= Arr1.size();
        }
        if (Arr2.size()==1){
            d2 = 0;
        } else {
            d2= Arr2.size();
        }
        return  d2==d1;
    }
    public static void Tasks7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        System.out.println("Ответ: " + Z7(n));
    }
    public static boolean Z7(int n) {
        if (n == 1)
            return true;
        int nn = n*n;
        int i=0;
        while (nn!=0){
            i++;
            nn /= 10;
        }
        nn=n*n;
        for (int j=1;j<i;j++)
        {
            int h = (int) Math.pow(10,j);
            int sum = nn/h + nn%h;
            if (sum==n) return true;
        }
        return false;
    }
    public static void Tasks8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println("Ответ: " + Z8(s));
    }
    public static String Z8(String s) {
        int max=0;
        int g = 0;
        for (int i = 0 ; i< s.length();i++) {
            if (s.charAt(i) == '0') {
                g++;
                if (g > max) {
                    max = g;
                }
            } else {
                g = 0;
            }
        }
        StringBuilder s1 = new StringBuilder("");
        for (int i = 0; i<max;i++){
            s1.insert(i,'0');
        }
        return new String(s1);
    }
    public static void Tasks9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int s = sc.nextInt();
        System.out.println("Ответ: " + Z9(s));
    }
    public static int Z9(int s) {
        boolean c=true;
        for (int i = 2; i < s; i++) {
            if (s % i == 0) {
                c = false;
                break;
            }
        }
        if (c==true){
            return s;
        }
        while (c!=true){
            s++;
            c=true;
            for (int j=2;j<s;j++){
                if (s%j==0){
                    c=false;
                    break;
                }
            }
        }
        return s;
    }
    public static void Tasks10() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc1.nextInt();
        System.out.println("Введите z");
        int z = sc2.nextInt();
        System.out.println("Ответ: " + Z10(x,y,z));
    }
    public static boolean Z10(int x, int y, int z) {
        return x * x + y * y == z * z || x * x + z * z == y * y || y * y + z * z == x * x;
    }
}
