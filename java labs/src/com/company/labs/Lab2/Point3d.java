package com.company;
import java.util.Objects;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    Point3d() {
        xCoord = 0.0;
        yCoord = 0.0;
        zCoord = 0.0;
    }

    public void getX() {
        System.out.println("x = " + xCoord);
    }

    public void getY() {
        System.out.println("y = " + yCoord);
    }

    public void getZ() {
        System.out.println("z = " + zCoord);
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void sety(double val) {
        yCoord = val;
    }

    public void setz(double val) {
        zCoord = val;
    }
    public void modify (Double x, Double y, Double z) {
        if (x != null) {
            xCoord = x;
        }
        if (y != null) {
            yCoord = y;
        }
        if (z != null) {
            zCoord = z;
        }
    }
    public boolean Equals(Point3d object) {
        return Objects.equals(this.xCoord, object.xCoord) && Objects.equals(this.yCoord, object.yCoord) && Objects.equals(this.zCoord, object.zCoord);
    }
    public Double distanceTo(Point3d object) {
        return Math.floor(Math.sqrt(Math.pow(object.xCoord - this.xCoord, 2) + Math.pow(object.yCoord - this.yCoord, 2) + Math.pow(object.zCoord - this.zCoord, 2)) * 100)/100;
    }
}