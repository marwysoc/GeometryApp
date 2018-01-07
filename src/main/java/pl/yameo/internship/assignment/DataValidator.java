package pl.yameo.internship.assignment;

import java.util.Scanner;

public class DataValidator {

    public static Double[] validateEllipse(Scanner scanner){
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
        return new Double[]{a,b};
    }

    public static Double[] validateRectangle(Scanner scanner){
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
        return new Double[]{a,b};
    }

    public static Double validateSquare(Scanner scanner){
        Double a;
        Square.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Square.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        return a;
    }

    public static Double validateCircle(Scanner scanner){
        Double a;
        Circle.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Circle.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        return a;
    }

    public static Double[] validateTriangle(Scanner scanner){
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
        while (checkTriangle(a,b,c)){
            a = DataReader.readDouble(scanner);
            b = DataReader.readDouble(scanner);
            c = DataReader.readDouble(scanner);
            continue;
        }
        return new Double[]{a,b,c};
    }

    public static Double validateHexagon(Scanner scanner){
        Double a;
        Hexagon.askForParams();
        a = DataReader.readDouble(scanner);
        while (a <= 0) {
            Shape.nonZeroValues();
            Hexagon.askForParams();
            a = DataReader.readDouble(scanner);
            continue;
        }
        return a;
    }

    public static boolean checkTriangle(Double edgeA, Double edgeB, Double edgeC) {
        if (edgeA + edgeB <= edgeC || edgeA + edgeC <= edgeB || edgeB + edgeC <= edgeA)
        {
            System.out.println("You can not create a triangle from given dimensions.");
            Triangle.askForParams();
            return true;
        } else {
            return false;
        }
    }
}
