package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg*secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("This figure is right triangle, its area is " + getArea());

    }
}
