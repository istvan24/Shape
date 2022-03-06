package siit.model;

import java.util.Objects;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        super("Square");
        this.side = side;
        calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 4 * side;
        super.setPerimeter(perimeter);
    }

    @Override
    public String toString(){
        return "Square{" +
                "side=" + side + "," +
                "perimeter=" + getPerimeter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
