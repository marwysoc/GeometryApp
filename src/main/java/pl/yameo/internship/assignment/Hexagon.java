package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Hexagon implements Shape {
    private Double side = 0.0;

    public Hexagon(Double side) {
        setSide(side);
    }

    @Override
    public String getName() { return "Hexagon"; }

    @Override
    public List<Double> listDimensions() { return Arrays.asList(side); }

    @Override
    public Double calculateArea() {
        return (3*side*side*Math.sqrt(3))/2;
    }

    @Override
    public Double calculatePerimeter() { return 6*side; }

    public void setSide(Double side){
        this.side = side;
    }
}
