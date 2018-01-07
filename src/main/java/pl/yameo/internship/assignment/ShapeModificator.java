package pl.yameo.internship.assignment;

// Class ShapeModificator contains methods used to modify existing shape.

import java.util.Scanner;

public class ShapeModificator {

    public static void modifyEllipse(Shape activeShape, Scanner scanner) {
        Double[] dimens = DataValidator.validateEllipse(scanner);
        ((Ellipse) activeShape).setSemiMajorAxis(dimens[0]);
        ((Ellipse) activeShape).setSemiMinorAxis(dimens[1]);
    }

    public static void modifyCircle(Shape activeShape, Scanner scanner) {
        ((Circle) activeShape).setRadius(DataValidator.validateCircle(scanner));
    }

    public static void modifySquare(Shape activeShape,Scanner scanner) {
        ((Square) activeShape).setEdge(DataValidator.validateSquare(scanner));
    }

    public static void modifyRectangle(Shape activeShape, Scanner scanner) {
        Double[] dimens = DataValidator.validateRectangle(scanner);
        ((Rectangle) activeShape).setHeight(dimens[0]);
        ((Rectangle) activeShape).setWidth(dimens[1]);
    }

    public static void modifyTriangle(Shape activeShape, Scanner scanner) {
        Double[] dimens = DataValidator.validateTriangle(scanner);
        ((Triangle) activeShape).setEdgeA(dimens[0]);
        ((Triangle) activeShape).setEdgeB(dimens[1]);
        ((Triangle) activeShape).setEdgeC(dimens[2]);
    }

    public static void modifyHexagon(Shape activeShape, Scanner scanner) {
        ((Hexagon) activeShape).setEdge(DataValidator.validateHexagon(scanner));
    }

    public static void modifyPentagon(Shape activeShape, Scanner scanner) {
        ((Pentagon) activeShape).setEdge(DataValidator.validatePentagon(scanner));
    }
}
