package pl.yameo.internship.assignment;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
	String getName();
	List<Double> listDimensions();
	Double calculateArea();
	Double calculatePerimeter();
	static void nonZeroValues() {
		System.out.println("Values can not be negative or zero!");
	}
}
