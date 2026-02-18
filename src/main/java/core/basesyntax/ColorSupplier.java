package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int num = RANDOM.nextInt(5);
        return switch (num) {
            case 0 -> "yellow";
            case 1 -> "black";
            case 2 -> "red";
            case 3 -> "blue";
            default -> "white";
        };
    }
}
