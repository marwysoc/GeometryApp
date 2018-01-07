package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Pentagon implements Shape {
    private Double edge = 0.0;

    public Pentagon(Double edge) {
        this.edge = edge;
    }

    @Override
    public String getName() {
        return "Pentagon";
    }

    @Override
    public List<Double> listDimensions() {
        return Arrays.asList(edge);
    }

    @Override
    public Double calculateArea() {
        return ((edge*edge)/4)*Math.sqrt(25 + 10*Math.sqrt(5));
    }

    @Override
    public Double calculatePerimeter() {
        return 5*edge;
    }

    public static void askForParams() {
        System.out.println("Please provide the edge length:");
    }

    public void setEdge(Double edge){
        this.edge = edge;
    }
}
