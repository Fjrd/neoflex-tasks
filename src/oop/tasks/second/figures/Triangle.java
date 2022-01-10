package oop.tasks.second.figures;

import oop.tasks.second.figures.Figure;
import oop.tasks.second.figures.Line;
import oop.tasks.second.figures.Point;

public class Triangle implements Figure {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public Double getLength() {
        Line one = new Line(a, b);
        Line two = new Line(b, c);
        Line three = new Line(c, a);
        return one.getLength() + two.getLength() + three.getLength();
    }

    @Override
    public Double getArea() {
        Line one = new Line(a, b);
        Line two = new Line(b, c);
        Line three = new Line(c, a);
        Double perimeter = getLength();
        return Math.sqrt(perimeter * (perimeter - one.getLength()) * (perimeter - two.getLength()) * (perimeter - three.getLength()));
    }
}
