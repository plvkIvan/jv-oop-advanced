package core.basesyntax;

public class Square extends AbstractFigure{
    private double base;

    @Override
    public double getArea() {
        return base*base;
    }

    @Override
    public void draw() {
        System.out.println("This figure is square, its area is " + getArea());

    }
}
