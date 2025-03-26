package _3_Patrones._6_Integ_Compo_And_SingFact;

import java.util.ArrayList;
import java.util.List;

public class CompleteObjet {
    private List<GeometricFigure> geometricFigureList;

    public CompleteObjet() {
        geometricFigureList = new ArrayList<>();
    }

    public void addGeometricFigure(String code){
        try {
            GeometricFigure geometricFigure = GeometricFigureFactory.getInstance().createFigure(code);
            geometricFigureList.add(geometricFigure);
        }catch (GeometricFigureFactoryException e){
            System.out.println(e.getMessage());
        }

    }

    public Double calculateTotalArea(){
        Double totalArea = 0.0;
        for (GeometricFigure geometricFigure : geometricFigureList) {
            totalArea += geometricFigure.calculateArea();
        }
        return totalArea;
    }

}
