package core.basesyntax;

public class Square extends AbstractFigure{
    private final double base;

    public Square(String color, double base) {
        super(color);
        this.base = base;
    }

    @Override
    public double getArea() {
        return base*base;
    }

    @Override
    public void draw() {
        System.out.println("This figure is square, its area is " + getArea());

    }
}
