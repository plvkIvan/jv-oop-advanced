package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("This figure is circle, its area is " + getArea());
    }
}
