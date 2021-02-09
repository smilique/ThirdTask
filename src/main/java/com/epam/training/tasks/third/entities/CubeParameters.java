package com.epam.training.tasks.third.entities;

import java.util.Objects;

public class CubeParameters {

    public double area;
    public double volume;

    public CubeParameters(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CubeParameters that = (CubeParameters) object;
        return Double.compare(that.area, area)
                == 0 && Double.compare(
                        that.volume, volume) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(area, volume);
    }

    @Override
    public String toString() {
        return "{" +
                "area=" + area +
                ", volume=" + volume +
                '}';
    }
}
