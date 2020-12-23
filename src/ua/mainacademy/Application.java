package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Shape;
import ua.mainacademy.model.Square;
import ua.mainacademy.model.Triangle;

import java.util.Set;
import java.util.TreeSet;

import static ua.mainacademy.model.AreaComparator.getMinAndMaxShapesArea;

public class Application {
    public static void main(String[] args) {

        Set<Shape> shapes = new TreeSet<>();
            shapes.add(new Circle(10));
            shapes.add(new Circle(11));
            shapes.add(new Circle(12));
            shapes.add(new Circle(13));
            shapes.add(new Square(10));
            shapes.add(new Square(11));
            shapes.add(new Square(12));
            shapes.add(new Square(20));
            shapes.add(new Triangle(10, 10));
            shapes.add(new Triangle(10, 11));
            shapes.add(new Triangle(10, 12));
            shapes.add(new Triangle(10, 13));

        getMinAndMaxShapesArea(shapes);
    }
}
