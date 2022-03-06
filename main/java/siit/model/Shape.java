package siit.model;

public abstract class Shape implements Comparable<Shape> {
    private String name;
    private int perimeter;

    protected Shape(String name) {
        this.name = name;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public abstract void calculatePerimeter();

    @Override
    public int compareTo(Shape o) {
        if (this.getPerimeter() < o.getPerimeter()) {
            return -1;
        } else if (this.getPerimeter() > o.getPerimeter()){
            return 1;
        } else {
            return 0;
        }

    }
}
