package siit.sevices;


import siit.model.Rectangle;
import siit.model.Shape;
import siit.model.Square;
import siit.model.Triangle;

import java.util.Set;
import java.util.TreeSet;

public class ShapeService {
    Set<Shape> shapeSet = new TreeSet<>();

    public void populateShapeSet() {

        addElement2Set(shapeSet, new Triangle(10, 15, 20));
//        addElement2Set(shapeSet, new Triangle(10, 15, 20));

        addElement2Set(shapeSet, new Rectangle(15, 10));
        addElement2Set(shapeSet, new Square(30));

        int totalPerimeter = 0;
        for (Shape shape : shapeSet) {
            totalPerimeter += shape.getPerimeter();
        }

        printSet(shapeSet);

        System.out.println("Total perimeter is " + totalPerimeter);
    }

    //just 4 fun
    public <E> void printSet(Set<E> set) {
        System.out.println("Elementele listei sunt:");
        for (E element : set) {
            System.out.println(element.toString());
        }

    }

    public <E> void addElement2Set(Set<E> eSet, E element) {
        if (eSet.contains(element)) {
            throw new RuntimeException("Ooops! Elementul " + element + " already exists in the set");
        } else {
            eSet.add(element);
        }
    }
}

