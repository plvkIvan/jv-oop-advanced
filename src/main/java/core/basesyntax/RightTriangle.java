package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    @Override
    public double getArea() {
        return (firstLeg*secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("This figure is right triangle, its area is " + getArea());

    }
}
