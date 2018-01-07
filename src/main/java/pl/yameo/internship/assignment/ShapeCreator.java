package pl.yameo.internship.assignment;

import java.util.Scanner;

// Class ShapeCreator contains methods used to create new shape.

public class ShapeCreator {

    public static Ellipse createNewEllipse(Scanner scanner) {
        Double a,b;
        Ellipse.askForParams();
        a = DataReader.readDouble(scanner);
        b = DataReader.readDouble(scanner);
        while (a <= 0 || b <= 0) {
            Shape.nonZeroValues();
            Ellipse.askForParams();
            a = DataReader.readDouble(scanner);
            b = DataReader.readDouble(scanner);
            continue;
        }
        return new Ellipse(a, b);
    }

    public static Rectangle createNewRectangle(Scanner scanner) {
        Double a,b;
        Rectangle.askForParams();
        a = DataReader.readDouble(scanner);
        b = DataReader.readDouble(scanner);
        while (a <= 0 || b <= 0) {
            Shape.nonZeroValues();
            Rectangle.askForParams();
            a = DataReader.readDouble(scanner);
            b = DataReader.readDouble(scanner);
            continue;
        }
        return new Rectangle(a, b);
    }

    public static Circle createNewCircle(Scanner scanner) {
        Double a;
        Circle.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Circle.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        return new Circle(a);
    }

    public static Square createNewSquare(Scanner scanner) {
        Double a;
        Square.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Square.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        return new Square(a);
    }

    public static Triangle createNewTriangle(Scanner scanner) {
        Double a,b,c;
        Triangle.askForParams();
        a = DataReader.readDouble(scanner);
        b = DataReader.readDouble(scanner);
        c = DataReader.readDouble(scanner);
        while (a <= 0 || b <= 0 || c <= 0) {
            Shape.nonZeroValues();
            Triangle.askForParams();
            a = DataReader.readDouble(scanner);
            b = DataReader.readDouble(scanner);
            c = DataReader.readDouble(scanner);
            continue;
        }
        while (Triangle.checkTriangle(a,b,c)){
            a = DataReader.readDouble(scanner);
            b = DataReader.readDouble(scanner);
            c = DataReader.readDouble(scanner);
            continue;
        }
        return new Triangle(a,b,c);
    }

    public static Hexagon createNewHexagon(Scanner scanner) {
        Double a;
        Hexagon.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Hexagon.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        return new Hexagon(a);
    }
}
