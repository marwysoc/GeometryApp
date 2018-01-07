package pl.yameo.internship.assignment;

import java.util.Scanner;

// Class ShapeCreator contains methods used to create new shape.

public class ShapeCreator {

    public static Ellipse createNewEllipse(Scanner scanner) {
        Double[] dimens = DataValidator.validateEllipse(scanner);
        return new Ellipse(dimens[0], dimens[1]);
    }

    public static Rectangle createNewRectangle(Scanner scanner) {
        Double[] dimens = DataValidator.validateRectangle(scanner);
        return new Rectangle(dimens[0], dimens[1]);
    }

    public static Circle createNewCircle(Scanner scanner) {
        return new Circle(DataValidator.validateCircle(scanner));
    }

    public static Square createNewSquare(Scanner scanner) {
        return new Square(DataValidator.validateSquare(scanner));
    }

    public static Triangle createNewTriangle(Scanner scanner) {
        Double[] dimens = DataValidator.validateTriangle(scanner);
        return new Triangle(dimens[0],dimens[1],dimens[2]);
    }

    public static Hexagon createNewHexagon(Scanner scanner) {
        return new Hexagon(DataValidator.validateHexagon(scanner));
    }

    public static Pentagon createNewPentagon(Scanner scanner) {
        return new Pentagon(DataValidator.validatePentagon(scanner));
    }
}
