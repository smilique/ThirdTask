package com.epam.training.tasks.third.entities;

import java.util.Objects;

public class Cube {

    private double x;
    private double y;
    private double z;
    private double sideLength;


    public Cube(double x, double y, double z, double sideLength) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.sideLength = sideLength;
    }

    public Cube(Point point, double sideLength) {
        this.x = point.getX();
        this.y = point.getY();
        this.z = point.getZ();
        this.sideLength = sideLength;
    }

    public Cube(double[] data) {
        this.x = data[0];
        this.y = data[1];
        this.z = data[2];
        this.sideLength = data[3];
    }

    public void setParams(double x, double y, double z, double sideLength) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.sideLength = sideLength;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", sideLength=" + sideLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.x, x) == 0 && Double.compare(cube.y, y)
                == 0 && Double.compare(cube.z, z)
                    == 0 && Double.compare(cube.sideLength, sideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, sideLength);
    }
}
