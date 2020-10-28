package com.company;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double z3 = sc.nextDouble();
        Point3d x = new Point3d(x1, y1, z1);
        Point3d y = new Point3d(x2, y2, z2);
        Point3d z = new Point3d(x3, y3, z3);
        if (x.Equals(y) == false && y.Equals(z) == false && z.Equals(x) == false) {
            System.out.println("Площадь треугольника по точкам: " + computeArea(x, y, z));
        } else {
            System.out.println("Две или три точки треугольника имеют одинаковые координаты");
        }
    }
    public static double computeArea(Point3d object1, Point3d object2, Point3d object3) {
        double a = object1.distanceTo(object2);
        double b = object2.distanceTo(object3);
        double c = object3.distanceTo(object1);
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
