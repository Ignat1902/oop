package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Modul_4 {
    public static void main(String[] args) {
       // Tasks1();
        //Tasks2();
        //Tasks3();
        //Tasks4();
        //Tasks5();
        //Tasks6();
       // Tasks7();
       // Tasks8();
        Tasks9();
        Tasks10();
    }
    public static void Tasks1() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите кол-во слов");
        int n = sc.nextInt();
        System.out.println("Введите кол-во символов");
        int k = sc1.nextInt();
        System.out.println("Введите строку");
        String s = sc2.nextLine();
        System.out.println(Z1(n,k,s));
    }
    public static String Z1(int n, int k , String s){
        String[] t = s.split(" "); // Засовывает слова в массив строк ориентируясь на пробелы
        s="";
        String f="";
        for (int i = 0; i < n; i++) {
            if (s.length() + t[i].length() > k) {
                f = f.trim() + "\r\n" + t[i] + " ";
                s = t[i];
            } else {
                f += t[i] + " ";
                s += t[i];
            }
        }
        return f.trim(); //Удаляет пробелы в начале и в конце строки
    }
    public static void Tasks2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println("Ответ: " + Z2(s));
    }
    public static String Z2(String s){
        String resS = "";
        ArrayList<String> l = new ArrayList<String>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                counter++;
            else
                counter--;
            resS += s.charAt(i);
            if (counter == 0) {
                l.add(resS);
                resS = "";
            }
        }
        return l.toString();
    }
    public static void Tasks3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println("SnakeCase:" + Z31(s));
        System.out.println("CamelCase:" + Z32(s));
    }
    public static String Z31(String s) {
        return s.replaceAll("([A-Z])", "_$0").toLowerCase();
    }
    public static String Z32(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '_')
                s = s.substring(0, i) + s.substring(i + 1, i + 2).toUpperCase() + s.substring(i + 2, s.length());
        }
        return s;
    }
    public static void Tasks4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные");
        double[] w = new double[4] ;
        for (int i=0;i<4;i++){
                    w[i]=sc.nextDouble();
        }

        System.out.println("Заработано: " + Z4(w));
    }
    public static String Z4(double[] w) {
        double sum = 0;
        if (17 - w[0] >= 0)
            sum += (17 - w[0]) * w[2];
        if (w[1] - 17 >= 0)
            sum += (w[1] - 17) * w[2] * w[3];
        return ('$' + String.valueOf(sum)); //Преобразовывает в дабл
    }
    public static void Tasks5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String c= sc.nextLine();
        String[] s = c.split(" ");
        System.out.println("Ответ: " + Z5(s));
    }
    public static String Z5(String[] s) {
        double ves = Double.parseDouble(s[0].split(" ")[0]);
        double rost = Double.parseDouble(s[2].split(" ")[0]);
        String o = " ";
        if (s[1].contains("pounds")) // Содержит ли слово?
            ves = ves * 0.45;
        if (s[3].contains("inches"))
            rost *= 0.0254;
        double b = Math.round((ves / (rost * rost)) * 10.0) / 10.0;
        if (b < 18.5)
            o = Math.round(b) + " Underweight";
        if (b >= 18.5 && b <= 24.9)
            o = Math.round(b)  + " Normal weight";
        if (b > 25)
            o = Math.round(b) + " Overweight";
        return o;
    }
    public static void Tasks6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        System.out.println("Ответ: " + Z6(n));
    }
    public static int Z6(int n) {
        int c = 0;
        while (n > 9) {
            int ch = 1;
            while (n > 0) {
                ch *= n % 10;
                n /= 10;
            }
            n = ch;
            c++;
        }
        return c;
    }
    public static void Tasks7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
       System.out.println("Ответ: " + Z7(s));
    }
    public static String Z7(String s) {
        int count = 1;
        char l = s.charAt(0);
        String newStr = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != l) {
                if (count != 1)
                    newStr += l + "*" + count;
                else
                    newStr += l;
                l = s.charAt(i);
                count = 1;
            } else
                count++;
        }
        if (count != 1)
            newStr += l + "*" + count;
        else
            newStr += l;
        return newStr;
    }
    
    public static void Tasks8() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s = sc.nextLine();
        System.out.println("Введите вторую строку");
        String s1 = sc.nextLine();
        System.out.println("Ответ: " + Z8(s,s1));
    }
    public static boolean Z8(String s1,String s2) {
        s1 = s1.substring(s1.lastIndexOf(" ") + 1);
        s2 = s2.substring(s2.lastIndexOf(" ") + 1);
        String let = "aeiouyAEIOUY";
        String res1 = "", res2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (let.indexOf(s1.charAt(i)) != -1)
                res1 += s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (let.indexOf(s2.charAt(i)) != -1)
                res2 += s2.charAt(i);
        }
        if (res1.toLowerCase().equals(res2.toLowerCase())) return true;
        else
            return false;
    }
    public static void Tasks9() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        long a = sc.nextLong();
        System.out.println("Введите второе число");
        long b = sc1.nextLong();
        System.out.println("Ответ: " + Z9(a,b));
    }
    public static boolean Z9(long a,long b) {
        String aa = Long.toString(a);
        String bb = Long.toString(b);
        int num = 0;
        for (int i = 2 ; i < aa.length(); i++) {
            if (aa.charAt(i) == aa.charAt(i -1) && aa.charAt(i) == aa.charAt(i -2))
                num = aa.charAt(i);
        }
        for (int i = 0 ; i < bb.length(); i++){
            if (bb.charAt(i)==num && bb.charAt(i+1) == num)
                return true;
        }
        return false;
    }
    public static void Tasks10() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s = sc.nextLine();
        System.out.println("Введите вторую строку");
        String c = sc1.nextLine();
        System.out.println("Ответ: " + Z10(s,c));
    }
    public static int Z10(String s, String c) {
        String new_s = "";
        int counter = 0;
        int index = 0;
        for (int i = 0; i<s.length(); i++)
            if (s.charAt(i) == c.charAt(0))
                counter++;
        for (int i = 0; i<counter/2; i++) {
            index = s.indexOf(c, index);
            int nextIndex = s.indexOf(c, index + 1);
            new_s += s.substring(index+1, nextIndex); 
            index = s.indexOf(c, nextIndex + 1);
        }
        counter = 0;
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < new_s.length(); i++) {
            isItThere[new_s.charAt(i)] = true;
        }
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i]){
                counter++;
            }
        }
        return counter;

    }
}