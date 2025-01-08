package _2_POO.ClaseAbstracta;

public class Circle extends GeometricFigure{
    private Double diameter;

    public Circle(Double diameter) {
        super();
        this.diameter = diameter;
    }

    @Override
    public Double calculateArea() {
        return (diameter/2)*(Math.PI);
    }
}
