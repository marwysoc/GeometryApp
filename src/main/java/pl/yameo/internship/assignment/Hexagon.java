package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Hexagon implements Shape {
    private Double edge = 0.0;

    public Hexagon(Double edge) {
        setEdge(edge);
    }

    @Override
    public String getName() { return "Hexagon"; }

    @Override
    public List<Double> listDimensions() { return Arrays.asList(edge); }

    @Override
    public Double calculateArea() {
        return (3* edge * edge *Math.sqrt(3))/2;
    }

    @Override
    public Double calculatePerimeter() { return 6* edge; }

    public static void askForParams() {
        System.out.println("Please provide the edge length:");
    }

    public void setEdge(Double edge){
        this.edge = edge;
    }
}
