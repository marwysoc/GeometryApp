package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements Shape {
	private Double height = 0.0;
	private Double width = 0.0;

	public Rectangle(Double height, Double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(height, width);
	}

	@Override
	public final Double calculateArea() {
		return height * width;
	}

	@Override
	public final Double calculatePerimeter() {
		return 2 * (height + width);
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
}
