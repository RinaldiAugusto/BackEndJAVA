package _4_IntroBackEnd._2_Loggin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AvarageList {
    private static final Logger logger = Logger.getLogger(String.valueOf(AvarageList.class));
    private List<Integer> integerList = new ArrayList<>();

    public AvarageList(List<Integer> integers) throws Exception {
        this.integerList = integers;

        if (integers.size() > 5){
            logger.info("La longitud de la lista es mayor a 5 y el promedio es: " + avarage());
        }
        if (integers.size() > 10){
            logger.info("La longitud de la lista es mayor a 10 y el promedio es:" + avarage());
        }
        if (integers.size() == 0){
            throw new Exception();
        }
    }

    public int avarage(){
        int addition = 0;
        for (Integer number : integerList) {
            addition += number;
        }
        int result = addition / integerList.size();
        return result;
    }
}
