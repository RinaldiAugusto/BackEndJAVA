package _3_Patrones._4_Integ_Compo_And_SingFact;

public class Main {
    public static void main(String[] args){
        GeometricFigureComposite geometricFigureComposite = new GeometricFigureComposite();

        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure("Circle"));
        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure("Rectangle"));
        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure("Square"));
        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure("Triangle"));

        System.out.println(geometricFigureComposite.calculateArea());
    }
}
