package com.company;
import com.company.labs.Lab2.src.com.company.Point2d;
import java.util.Objects;

public class Point3d extends Point2d{

    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x,y);
        zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean compareVal(Point3d obj) {
        if ((super.getX() == obj.getX()) && (super.getY() == obj.getY()) && (this.getZ() == obj.getZ()))
            return true;
        else
            return false;
    }

    public double distanceTo(Point3d obj) {
        return Double.parseDouble(String.format("%.2f", Math.sqrt((Math.pow(obj.getX() - super.getX(), 2) + Math.pow(obj.getY() - super.getY(), 2) + Math.pow(obj.getZ() - this.getZ(), 2)))).replace(',', '.'));
    }
}