package _3_Patrones._6_Integ_Compo_And_SingFact;

public class Main {
    public static void main(String[] args) throws GeometricFigureFactoryException {
        GeometricFigureComposite geometricFigureComposite = new GeometricFigureComposite();

        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure(GeometricFigureFactory.CODE_CIRCLE));
        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure(GeometricFigureFactory.CODE_RECTANGLE));
        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure(GeometricFigureFactory.CODE_SQUARE));
        geometricFigureComposite.addGeometricFigure(GeometricFigureFactory.getInstance().createFigure(GeometricFigureFactory.CODE_TRIANGLE));

        System.out.println(geometricFigureComposite.calculateArea());
    }
}
