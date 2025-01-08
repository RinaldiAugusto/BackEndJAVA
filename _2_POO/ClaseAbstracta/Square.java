package _2_POO.ClaseAbstracta;

public class Square extends GeometricFigure{
    private Double sideLength;

    public Square(Integer sides, Double sideLength) {
        super();
        this.sideLength = sideLength;
    }

    @Override
    public Double calculateArea() {
        return sideLength * sideLength;
    }
}
