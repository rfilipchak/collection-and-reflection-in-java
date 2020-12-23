package ua.mainacademy.service;

import ua.mainacademy.model.Shape;

import java.util.Set;

public class AreaCompareService {

    public static int areaComparator(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        if (shape1.getArea() < shape2.getArea()) {
            return -1;
        } else if (shape1.getArea() > shape2.getArea()) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void getMinAndMaxShapesArea(Set<Shape> s) {
        Shape[] shapes = s.toArray(new Shape[s.size()]);
        System.out.println("Minimum area is " + shapes[0].getArea() + " gets from class " + shapes[0].getClass().getSimpleName());
        System.out.println("Maximum area is " + shapes[shapes.length - 1].getArea() + " gets from class " + shapes[shapes.length - 1].getClass().getSimpleName());
    }
}
