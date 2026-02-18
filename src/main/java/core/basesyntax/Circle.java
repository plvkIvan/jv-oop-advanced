package core.basesyntax;

import java.awt.*;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("This figure is circle, its area is " + getArea());
    }
}
