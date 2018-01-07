package pl.yameo.internship.assignment;

// Class ShapeModificator contains methods used to modify existing shape.

import java.util.Scanner;

public class ShapeModificator {

    public static void modifyEllipse(Shape activeShape, Scanner scanner) {
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
        ((Ellipse) activeShape).setSemiMajorAxis(a);
        ((Ellipse) activeShape).setSemiMinorAxis(b);
    }

    public static void modifyCircle(Shape activeShape, Scanner scanner) {
        Double a;
        Circle.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Circle.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        ((Circle) activeShape).setRadius(a);
    }

    public static void modifySquare(Shape activeShape,Scanner scanner) {
        Double a;
        Square.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Square.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        ((Square) activeShape).setEdge(a);
    }

    public static void modifyRectangle(Shape activeShape, Scanner scanner) {
        Double a,b,c;
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
        ((Rectangle) activeShape).setHeight(a);
        ((Rectangle) activeShape).setWidth(b);
    }


    public static void modifyTriangle(Shape activeShape, Scanner scanner) {
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
        ((Triangle) activeShape).setEdgeA(a);
        ((Triangle) activeShape).setEdgeB(b);
        ((Triangle) activeShape).setEdgeC(c);
    }

    public static void modifyHexagon(Shape activeShape, Scanner scanner) {
        Double a;
        Hexagon.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Hexagon.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        ((Hexagon) activeShape).setEdge(a);
    }
}
