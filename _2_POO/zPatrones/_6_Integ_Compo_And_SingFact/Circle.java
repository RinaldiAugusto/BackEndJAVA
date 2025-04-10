package _2_POO.zPatrones._6_Integ_Compo_And_SingFact;

public class Circle implements GeometricFigure{
    private Double radio;

    public Circle(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radio * radio;
    }
}
