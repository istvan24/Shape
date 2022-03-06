package siit.model;

import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super("Rectangle");
        this.width = width;
        this.height = height;

        calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * (this.width + this.height);
        super.setPerimeter(perimeter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + width +
                ", side2=" + height +
                ", perimeter=" + getPerimeter() +
                '}';
    }


}
