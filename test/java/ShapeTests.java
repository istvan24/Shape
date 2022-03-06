import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import siit.model.Rectangle;
import siit.model.Shape;
import siit.model.Square;
import siit.model.Triangle;
import siit.sevices.ShapeService;

import java.util.Set;
import java.util.TreeSet;

@DisplayName("Shape Tests")
public class ShapeTests {
    @ParameterizedTest
    @CsvSource(value = {"10, 20, 15", "15, 25, 35"})
    @DisplayName("Test calcul perimetru pentru triunghi")
    public void testCalculTrianglePerimeter(int side1, int side2, int side3){
        Shape triangle = new Triangle(side1, side2, side3);
        Assertions.assertEquals(45, 75,triangle.getPerimeter());
    }

    @ParameterizedTest
    @CsvSource(value={"10, 15", "15, 20"})
    @DisplayName("Test calcul perimetru pentru dreptunghi")
    public void testCalculRectanglePerimeter(int side1, int side2){
        Shape rectangle = new Rectangle(side1, side2);
        Assertions.assertEquals(50, 70, rectangle.getPerimeter());
    }

    @ParameterizedTest
    @CsvSource(value = {"15", "20"})
    @DisplayName("Test calcul perimetru pentru patrat")
    public void testCalculSquarePerimeter(int side){
        Shape square = new Square(side);
        Assertions.assertEquals(60, 80,square.getPerimeter());
    }

    @ParameterizedTest
    @CsvSource(value = {"10", "15"})
    @DisplayName("Test metoda adaugare shape in set")
    public void testAddShapeToSet(int side){
        ShapeService shapeService = new ShapeService();
        Set<Shape> shapeSet = new TreeSet<>();
        Shape square1 = new Square(10);
        shapeService.addElement2Set(shapeSet, square1);

        Assertions.assertThrows(RuntimeException.class, () -> shapeService.addElement2Set(shapeSet, new Square(side)));
    }
}
