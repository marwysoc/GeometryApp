package pl.yameo.internship.assignment;

import java.util.Scanner;

// Class DataReader contains method used to read data from user.

public class DataReader {

    public static Integer readInteger(Scanner scanner) {
        Integer value = null;
        while (value == null) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                scanner.next();
            }
        }

        return value;
    }

    public static Double readDouble(Scanner scanner) {
        Double value = null;
        while (value == null) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
            } else {
                scanner.next();
            }
        }

        return value;
    }

}
