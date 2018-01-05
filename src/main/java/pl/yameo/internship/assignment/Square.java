package pl.yameo.internship.assignment;

public class Square extends Rectangle {
	public Square(Double dimension) {
		super(dimension, dimension);
	}

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public void setHeight(Double height) {
		setDimension(height);
	}

	@Override
	public void setWidth(Double width) {
		setDimension(width);
	}

	public void setDimension(Double dimension) {
		super.setHeight(dimension);
		super.setWidth(dimension);
	}
}
