package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int num = RANDOM.nextInt(5);
        double side1 = RANDOM.nextInt(50) + 1;
        double side2 = RANDOM.nextInt(50) + 1;
        double side3 = RANDOM.nextInt(50) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        return switch (num) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), side1);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), side1, side2);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(), side1, side2);
            case 3 -> new Square(colorSupplier.getRandomColor(), side1);
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), side1, side2, side3);
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
