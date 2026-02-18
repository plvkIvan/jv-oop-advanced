package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double base1;
    private double base2;
    private double height;

    @Override
    public double getArea() {
        return base1*base2*height;
    }

    @Override
    public void draw() {
        System.out.println("This figure is isosceles trapezoid, its area is " + getArea());
    }
}
