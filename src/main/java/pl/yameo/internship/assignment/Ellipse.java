package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Ellipse implements Shape {
	private Double semiMajorAxis = 0.0;
	private Double semiMinorAxis = 0.0;

	public Ellipse(Double semiMajorAxis, Double semiMinorAxis) {
		this.semiMajorAxis = semiMajorAxis;
		this.semiMinorAxis = semiMinorAxis;
	}

	@Override
	public String getName() {
		return "Ellipse";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(semiMajorAxis, semiMinorAxis);
	}

	@Override
	public final Double calculateArea() {
		return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) / 2 - Math.sqrt(semiMajorAxis * semiMinorAxis));
	}

	@Override
	public final Double calculatePerimeter() {
		return Math.PI * semiMajorAxis * semiMinorAxis;
	}

	public void setSemiMajorAxis(Double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}

	public void setSemiMinorAxis(Double semiMinorAxis) {
		this.semiMinorAxis = semiMinorAxis;
	}
}
