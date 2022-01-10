package oop.tasks.second.figures;

public class Line implements Figure{

    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String getType() {
        return "Line";
    }

    @Override
    public Double getLength() {
        return Math.sqrt(Math.pow((endPoint.x - startPoint.x), 2) + Math.pow((endPoint.y - startPoint.y), 2));
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
