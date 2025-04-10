package _2_POO.zPatrones._6_Integ_Compo_And_SingFact;

import java.util.ArrayList;
import java.util.List;

public class GeometricFigureComposite implements GeometricFigure{
    private List<GeometricFigure> figureList;

    public GeometricFigureComposite() {
        figureList = new ArrayList<>();
    }

    public void addGeometricFigure(GeometricFigure geometricFigure){
        figureList.add(geometricFigure);
    }


    @Override
    public Double calculateArea() {
        Double totalArea = 0.0;
        for (GeometricFigure geometricFigure : figureList) {
            totalArea += geometricFigure.calculateArea();
        }
        return totalArea;

    }
}
