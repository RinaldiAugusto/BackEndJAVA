package _3_Patrones._6_Integ_Compo_And_SingFact;

public class Triangle implements GeometricFigure{
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public Double calculateArea() {
        return (base*height) / 2;
    }
}
