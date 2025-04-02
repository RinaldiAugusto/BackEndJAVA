import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        AverageList averageListGreaterThan5 = null;
        AverageList averageListGreaterThan10 = null;
        AverageList averageListEmpty = null;

        try {
            averageListGreaterThan5 = new AverageList(Arrays.asList(1, 2, 3, 4, 5));
            averageListGreaterThan10 = new AverageList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            averageListEmpty = new AverageList(new ArrayList<>());
        } catch (Exception e) {
            logger.error("La lista está vacía " + e);
        }
    }
}
