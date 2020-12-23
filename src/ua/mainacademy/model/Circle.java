package ua.mainacademy.model;

import static ua.mainacademy.model.AreaComparator.areaComparator;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public int compareTo(Object o) {
        return areaComparator(this, o);
    }
}
