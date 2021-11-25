package oop.tasks.second.figures;

public class Point implements Figure{

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getType() {
        return "Point";
    }

    @Override
    public Double getLength() {
        return 0.0;
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
