package oop.tasks.second;

import oop.tasks.second.figures.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 3);
        Point point3 = new Point(4, 4);
        Point point4 = new Point(3, 2);
        Line line = new Line(point1, point2);
        Circle circle = new Circle(14.0);
        Triangle triangle = new Triangle(point1, point2, point3);
        Parallelogram parallelogram = new Parallelogram(point1, point2, point3, point4);

        Stream.of(point1, line, circle, triangle, parallelogram)
                .forEach(figures::add);

        figures.forEach(figure -> System.out.println(
                        "type = " + figure.getType() +
                        ", length = " + figure.getLength() +
                        ", area = " + figure.getArea()));
    }
}
