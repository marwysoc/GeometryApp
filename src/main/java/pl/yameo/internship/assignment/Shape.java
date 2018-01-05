package pl.yameo.internship.assignment;

import java.util.List;

public interface Shape {
	String getName();
	List<Double> listDimensions();
	Double calculateArea();
	Double calculatePerimeter();
}
