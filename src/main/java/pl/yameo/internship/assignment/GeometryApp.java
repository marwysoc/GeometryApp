package pl.yameo.internship.assignment;

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
		System.out.println("6) Hexagon");
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
		} else if (option == 6) {
			return createNewHexagon();
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
			modifyEllipse(activeShape);
		} else if (activeShape instanceof Circle) {
			modifyCircle(activeShape);
		} else if (activeShape instanceof Square) {
			modifySquare(activeShape);
		} else if (activeShape instanceof Rectangle) {
			modifyRectangle(activeShape);
		} else if (activeShape instanceof Triangle) {
			modifyTriangle(activeShape);
		} else if (activeShape instanceof Hexagon){
			modifyHexagon(activeShape);
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

	private void modifyHexagon(Shape activeShape) {
		Hexagon.askForParams();
		getOneValue();
		while (a <= 0) {
			Shape.nonZeroValues();
			Hexagon.askForParams();
			getOneValue();
			continue;
		}
		((Hexagon) activeShape).setEdge(a);
	}

	private void modifyTriangle(Shape activeShape) {
		Triangle.askForParams();
		getThreeValues();
		while (a <= 0 || b <= 0 || c <= 0) {
			Shape.nonZeroValues();
			Triangle.askForParams();
			getThreeValues();
			continue;
		}
		while (Triangle.checkTriangle(a,b,c)){
			getThreeValues();
			continue;
		}
		((Triangle) activeShape).setEdgeA(a);
		((Triangle) activeShape).setEdgeB(b);
		((Triangle) activeShape).setEdgeC(c);
	}

	private void modifyRectangle(Shape activeShape) {
		Rectangle.askForParams();
		getTwoValues();
		while (a <= 0 || b <= 0) {
			Shape.nonZeroValues();
			Rectangle.askForParams();
			getTwoValues();
			continue;
		}
		((Rectangle) activeShape).setHeight(a);
		((Rectangle) activeShape).setWidth(b);
	}

	private void modifySquare(Shape activeShape) {
		Square.askForParams();
		getOneValue();
		while (a <= 0) {
			Shape.nonZeroValues();
			Square.askForParams();
			getOneValue();
			continue;
		}
		((Square) activeShape).setEdge(a);
	}

	private void modifyCircle(Shape activeShape) {
		Circle.askForParams();
		getOneValue();
		while (a <= 0) {
			Shape.nonZeroValues();
			Circle.askForParams();
			getOneValue();
			continue;
		}
		((Circle) activeShape).setRadius(a);
	}

	private void modifyEllipse(Shape activeShape) {
		Ellipse.askForParams();
		getTwoValues();
		while (a <= 0 || b <= 0) {
			Shape.nonZeroValues();
			Ellipse.askForParams();
			getTwoValues();
			continue;
		}
		((Ellipse) activeShape).setSemiMajorAxis(a);
		((Ellipse) activeShape).setSemiMinorAxis(b);
	}


	private Ellipse createNewEllipse() {
		Ellipse.askForParams();
		getTwoValues();
		while (a <= 0 || b <= 0) {
			Shape.nonZeroValues();
			Ellipse.askForParams();
			getTwoValues();
			continue;
		}
		return new Ellipse(a, b);
	}

	private Rectangle createNewRectangle() {
		Rectangle.askForParams();
		getTwoValues();
		while (a <= 0 || b <= 0) {
			Shape.nonZeroValues();
			Rectangle.askForParams();
			getTwoValues();
			continue;
		}
		return new Rectangle(a, b);
	}

	private Circle createNewCircle() {
		Circle.askForParams();
		getOneValue();
		while (a <= 0) {
			Shape.nonZeroValues();
			Circle.askForParams();
			getOneValue();
			continue;
		}
		return new Circle(a);
	}

	private Square createNewSquare() {
		Square.askForParams();
		getOneValue();
		while (a <= 0) {
			Shape.nonZeroValues();
			Square.askForParams();
			getOneValue();
			continue;
		}
		return new Square(a);
	}

	private Triangle createNewTriangle() {
		Triangle.askForParams();
		getThreeValues();
		while (a <= 0 || b <= 0 || c <= 0) {
			Shape.nonZeroValues();
			Triangle.askForParams();
			getThreeValues();
			continue;
		}
		while (Triangle.checkTriangle(a,b,c)){
			getThreeValues();
			continue;
		}
		return new Triangle(a,b,c);
	}

	private Hexagon createNewHexagon() {
		Hexagon.askForParams();
		getOneValue();
		while (a <= 0) {
			Shape.nonZeroValues();
			Hexagon.askForParams();
			getOneValue();
			continue;
		}
		return new Hexagon(a);
	}


	private void getOneValue(){
		a = readDouble();
	}

	private void getTwoValues(){
		a = readDouble();
		b = readDouble();
	}

	private void getThreeValues(){
		a = readDouble();
		b = readDouble();
		c = readDouble();
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
