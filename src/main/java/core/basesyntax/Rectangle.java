package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println("This figure is triangle, its area is " + getArea());

    }
}
