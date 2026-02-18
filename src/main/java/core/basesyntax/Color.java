package core.basesyntax;

public abstract class Color implements Drawable, Figure {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
