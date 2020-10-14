package com.company;

public class Task08 {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int M = centimetre/100;
        return M;
    }
}
