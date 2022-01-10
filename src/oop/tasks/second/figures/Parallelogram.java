package oop.tasks.second.figures;

public class Parallelogram implements Figure{
    Point a;
    Point b;
    Point c;
    Point d;

    public Parallelogram(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    @Override
    public String getType() {
        return "Parallelogram";
    }

    @Override
    public Double getLength() {
        Line one = new Line(a, b);
        Line two = new Line(b, c);
        Line thee = new Line(c, d);
        Line four = new Line(d, a);

        return one.getLength() + two.getLength() + thee.getLength() + four.getLength();
    }

    @Override
    public Double getArea() {
        Triangle abc = new Triangle(a, b ,c);
        Triangle acd = new Triangle(a, c, d);
        return abc.getArea() + acd.getArea();
    }
}
