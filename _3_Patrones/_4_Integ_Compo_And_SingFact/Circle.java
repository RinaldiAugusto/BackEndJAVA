package _3_Patrones._4_Integ_Compo_And_SingFact;

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
