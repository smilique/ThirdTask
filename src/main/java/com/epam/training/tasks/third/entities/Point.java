package com.epam.training.tasks.third.entities;

import java.util.Objects;

public class Point {

    private final double x;
    private final double y;
    private final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(double[] data) {
        this.x = data[0];
        this.y = data[1];
        this.z = data[2];
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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return (Double.compare(point.x, x) == 0
                && Double.compare(point.y, y) == 0
                    && Double.compare(point.z, z) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
