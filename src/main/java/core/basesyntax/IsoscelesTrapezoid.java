package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double height, double base2, double base1) {
        super(color);
        this.height = height;
        this.base2 = base2;
        this.base1 = base1;
    }

    @Override
    public double getArea() {
        return base1*base2*height;
    }

    @Override
    public void draw() {
        System.out.println("This figure is isosceles trapezoid, its area is " + getArea());
    }
}
