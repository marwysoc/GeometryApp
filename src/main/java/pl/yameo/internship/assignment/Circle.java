package pl.yameo.internship.assignment;

public class Circle extends Ellipse {
	public Circle(Double radius) {
		super(radius, radius);
	}

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public void setSemiMajorAxis(Double semiMajorAxis) {
		setRadius(semiMajorAxis);
	}

	@Override
	public void setSemiMinorAxis(Double semiMinorAxis) {
		setRadius(semiMinorAxis);
	}

	public void setRadius(Double radius) {
		super.setSemiMajorAxis(radius);
		super.setSemiMinorAxis(radius);
	}
}
