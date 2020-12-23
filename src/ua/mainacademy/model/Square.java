package ua.mainacademy.model;

import static ua.mainacademy.service.AreaCompareService.areaComparator;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public int compareTo(Object o) {
        return areaComparator(this, o);
    }
}
