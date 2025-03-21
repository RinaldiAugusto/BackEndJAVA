package _3_Patrones._4_Integ_Compo_And_SingFact;

public class GeometricFigureFactory {
    private static GeometricFigureFactory instance;

    private GeometricFigureFactory() {
    }

    public static GeometricFigureFactory getInstance(){
        if (instance == null){
            instance = new GeometricFigureFactory();
        }
        return instance;
    }

    public GeometricFigure createFigure(String code){
        switch (code){
            case "Circle":
                return new Circle(2.0);

            case "Rectangle":
                return new Rectangle(5.0, 6.0);

                case "Square":
            return new Rectangle(3.0, 3.0);

            case "Triangle":
                return new Triangle(10.0, 4.0);
        }
        return null;
    }

}
