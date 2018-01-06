package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Circle implements Shape {
	private Double radius = 0.0;

	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public List<Double> listDimensions() { return Arrays.asList(radius); }

	@Override
	public Double calculateArea() { return Math.PI * radius * radius; }

	@Override
	public Double calculatePerimeter() { return 2 * Math.PI * radius; }

	public static void askForParams(){
		System.out.println("Please provide the radius for the circle:");
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

}
