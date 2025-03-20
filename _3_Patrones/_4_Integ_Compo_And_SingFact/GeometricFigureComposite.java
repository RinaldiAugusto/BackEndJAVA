package _3_Patrones._4_Integ_Compo_And_SingFact;

import com.sun.source.tree.BreakTree;

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
