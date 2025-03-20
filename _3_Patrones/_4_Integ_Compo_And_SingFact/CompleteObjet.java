package _3_Patrones._4_Integ_Compo_And_SingFact;

import java.util.ArrayList;
import java.util.List;

public class CompleteObjet {
    private List<GeometricFigure> geometricFigureList;

    public CompleteObjet() {
        geometricFigureList = new ArrayList<>();
    }

    public void addGeometricFigure(String code){
        geometricFigureList.add(GeometricFigureFactory.getInstance().createFigure(code));
    }

    public Double calculateTotalArea(){
        Double totalArea = 0.0;
        for (GeometricFigure geometricFigure : geometricFigureList) {
            totalArea += geometricFigure.calculateArea();
        }
        return totalArea;
    }

}
