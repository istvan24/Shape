package siit;

import siit.sevices.ShapeService;

public class Main {

//    You need to design an application that allows the possibility to calculate the perimeter for multiple types of shape: rectangle, square and triangle.
//
//    The tool should allow the possibility to add multiple shapes and calculate the total sum for perimeter.
//    Also, the application should make sure that 2 similar shapes couldn’t be added to the drawing tool.
//    In case 2 similar shapes are added, an appropriate exception must be thrown.
//
//    Since you want to be sure that you provide a high quality implementation,
//    JUNIT tests are needed to prove the main functionalities described above, work correctly.

    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();
        shapeService.populateShapeSet();
    }
}
