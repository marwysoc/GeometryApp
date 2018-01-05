package pl.yameo.internship.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometryApp {
	private Scanner scanner;
	private List<Shape> shapes = new ArrayList<>();

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

		int option = readInteger();
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
			modifyShape();
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
		System.out.println("0) Back");
		int option = readInteger();

	 	if (option == 1) {
			return createNewEllipse();
		} else if (option == 2) {
			return createNewRectangle();
		} else if (option == 3) {
			return createNewCircle();
		} else if (option == 4) {
			return createNewSquare();
		} else if (option == 5) {
			return createNewTriangle();
		} else {
	 		return null;
		}
	}

	private void listShapes() {
		System.out.println("====== LIST OF SHAPES ======");
		shapes.forEach(shape -> {
			System.out.print(shape.getName() + " with dimensions: ");
			System.out.print(shape.listDimensions() + "; ");
			System.out.print("Area: " + shape.calculateArea() + "; ");
			System.out.println("Perimeter: " + shape.calculatePerimeter());
		});
		System.out.println("============================");
	}

	private void modifyShape() {
		listShapes();
		System.out.println("Please choose the index of the shape you want to modify (1-" + shapes.size() + "): ");
		int index = readInteger();
		Shape activeShape = shapes.get(index - 1);
		List<Double> oldDimensions = activeShape.listDimensions();
		Double oldPerimeter = activeShape.calculatePerimeter();
		Double oldArea = activeShape.calculateArea();

		System.out.print(activeShape.getName() + " with dimensions: ");
		System.out.print(oldDimensions + "; ");
		System.out.print("Area: " + oldArea + "; ");
		System.out.println("Perimeter: " + oldPerimeter);

		if (activeShape instanceof Ellipse) {
			System.out.println("Please provide two semi-axis lengths (major, minor):");
			((Ellipse) activeShape).setSemiMajorAxis(readDouble());
			((Ellipse) activeShape).setSemiMinorAxis(readDouble());
		} else if (activeShape instanceof Circle) {
			System.out.println("Please provide the radius for the circle:");
			((Circle) activeShape).setRadius(readDouble());
		} else if (activeShape instanceof Square) {
			System.out.println("Please provide the edge length:");
			((Square) activeShape).setDimension(readDouble());
		} else if (activeShape instanceof Rectangle) {
			System.out.println("Please provide two edge lengths (height, width):");
			((Rectangle) activeShape).setHeight(readDouble());
			((Rectangle) activeShape).setWidth(readDouble());
		} else if (activeShape instanceof Triangle) {
			System.out.println("Please provide three edge lengths:");
			((Triangle) activeShape).setEdgeA(readDouble());
			((Triangle) activeShape).setEdgeB(readDouble());
			((Triangle) activeShape).setEdgeC(readDouble());
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

	private Ellipse createNewEllipse() {
		System.out.println("Please provide two semi-axis lengths (major, minor):");
		return new Ellipse(readDouble(), readDouble());
	}

	private Rectangle createNewRectangle() {
		System.out.println("Please provide two edge lengths (height, width):");
		return new Rectangle(readDouble(), readDouble());
	}

	private Circle createNewCircle() {
		System.out.println("Please provide the radius for the circle:");
		return new Circle(readDouble());
	}

	private Square createNewSquare() {
		System.out.println("Please provide the edge length:");
		return new Square(readDouble());
	}

	private Triangle createNewTriangle() {
		System.out.println("Please provide three edge lengths:");
		return new Triangle(readDouble(), readDouble(), readDouble());
	}

	private Integer readInteger() {
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

	private Double readDouble() {
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
