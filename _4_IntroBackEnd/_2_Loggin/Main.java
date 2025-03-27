package _4_IntroBackEnd._2_Loggin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        AvarageList avarageListGreaterThan5 = null;
        AvarageList avarageListGreaterThan10 = null;
        AvarageList avarageListEmpty = null;

        avarageListGreaterThan5 = new AvarageList(Arrays.asList(1, 2, 3, 4, 5, 6));
        avarageListGreaterThan10 = new AvarageList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        avarageListEmpty = new AvarageList(new ArrayList<>());
    }
}
