package oop.tasks.second.figures;

public class Circle implements Figure {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public Double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.pow((Math.PI * radius), 2);
    }
}
