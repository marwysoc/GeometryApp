package pl.yameo.internship.assignment;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometryApp {
	private Scanner scanner;
	private List<Shape> shapes = new ArrayList<>();
	private Double a,b,c;

	public GeometryApp(Scanner scanner) {
		this.scanner = scanner;
	}

	public void start() {
		boolean run = true;
		while (run) {
			run = run();
		}
	}

	private boolean run() {
		System.out.println("Choose action:");
		System.out.println("1) Create new shape");
		System.out.println("2) List existing shapes");
		System.out.println("3) Modify one of the shapes from the list");
		System.out.println("0) Exit");

		int option = DataReader.readInteger(scanner);
		if (option == 0) {
			return false;
		} else if (option == 1) {
			Shape newShape = createNewShape();
			if (newShape != null) {
				shapes.add(newShape);
			}
		} else if (option == 2) {
			listShapes();
		} else if (option == 3) {
			if (shapes.isEmpty()) {
				System.out.println("Shape list is empty!");
			} else modifyShape();
		}

		return true;
	}

	private Shape createNewShape() {
		System.out.println("Choose shape to create:");
		System.out.println("1) Ellipse");
		System.out.println("2) Rectangle");
		System.out.println("3) Circle");
		System.out.println("4) Square");
		System.out.println("5) Triangle");
		System.out.println("6) Hexagon");
		System.out.println("0) Back");
		int option = DataReader.readInteger(scanner);

	 	if (option == 1) {
			return ShapeCreator.createNewEllipse(scanner);
		} else if (option == 2) {
			return ShapeCreator.createNewRectangle(scanner);
		} else if (option == 3) {
			return ShapeCreator.createNewCircle(scanner);
		} else if (option == 4) {
			return ShapeCreator.createNewSquare(scanner);
		} else if (option == 5) {
			return ShapeCreator.createNewTriangle(scanner);
		} else if (option == 6) {
			return ShapeCreator.createNewHexagon(scanner);
		} else {
	 		return null;
		}
	}

	private void listShapes() {
		System.out.println("====== LIST OF SHAPES ======");
		int i = 1;
		//shapes.forEach(shape -> {
		for (Shape shape : shapes) {
			if (shapes.size() != 0) {
				System.out.print(i + ") " + shape.getName() + " with dimensions: ");
				System.out.print(shape.listDimensions() + "; ");
				System.out.print("Area: " + shape.calculateArea() + "; ");
				System.out.println("Perimeter: " + shape.calculatePerimeter());
				i += 1;
			} else {
				i = 1;
			}
		}
		//});
		System.out.println("============================");
	}

	private void modifyShape() {
		listShapes();
		System.out.println("Please choose the index of the shape you want to modify (1-" + shapes.size() + "): ");
		int index = DataReader.readInteger(scanner);
		Shape activeShape = shapes.get(index - 1);
		List<Double> oldDimensions = activeShape.listDimensions();
		Double oldPerimeter = activeShape.calculatePerimeter();
		Double oldArea = activeShape.calculateArea();

		System.out.print(activeShape.getName() + " with dimensions: ");
		System.out.print(oldDimensions + "; ");
		System.out.print("Area: " + oldArea + "; ");
		System.out.println("Perimeter: " + oldPerimeter);

		if (activeShape instanceof Ellipse) {
			ShapeModificator.modifyEllipse(activeShape, scanner);
		} else if (activeShape instanceof Circle) {
			ShapeModificator.modifyCircle(activeShape, scanner);
		} else if (activeShape instanceof Square) {
			ShapeModificator.modifySquare(activeShape, scanner);
		} else if (activeShape instanceof Rectangle) {
			ShapeModificator.modifyRectangle(activeShape, scanner);
		} else if (activeShape instanceof Triangle) {
			ShapeModificator.modifyTriangle(activeShape, scanner);
		} else if (activeShape instanceof Hexagon){
			ShapeModificator.modifyHexagon(activeShape, scanner);
		}

		System.out.println("Old shape: ");
		System.out.print(activeShape.getName() + " with dimensions: ");
		System.out.print(oldDimensions + "; ");
		System.out.print("Area: " + oldArea + "; ");
		System.out.println("Perimeter: " + oldPerimeter);
		System.out.println("============================");
		System.out.println("New shape: ");
		System.out.print(activeShape.getName() + " with dimensions: ");
		System.out.print(activeShape.listDimensions() + "; ");
		System.out.print("Area: " + activeShape.calculateArea() + "; ");
		System.out.println("Perimeter: " + activeShape.calculatePerimeter());
		System.out.println("============================");

	}

}
