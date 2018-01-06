package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Square implements Shape {
	private Double edge = 0.0;

	public Square(Double edge) {
		this.edge = edge;
	}

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public List<Double> listDimensions() { return Arrays.asList(edge); }

	@Override
	public Double calculateArea() {
		return edge*edge;
	}

	@Override
	public Double calculatePerimeter() {
		return 4*edge;
	}

	public static void askForParams(){
		System.out.println("Please provide the edge length:");
	}

	public void setEdge(Double edge){
		this.edge = edge;
	}

}
