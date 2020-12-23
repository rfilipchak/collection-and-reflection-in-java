package ua.mainacademy.model;

import static ua.mainacademy.model.AreaComparator.areaComparator;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public int compareTo(Object o) {
        return areaComparator(this, o);
    }
}
