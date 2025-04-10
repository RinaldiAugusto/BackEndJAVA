import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

public class File {

    public static void saveEmployeedSpecialFormat(List<Employee> employeeList) {
        //Vamos a guardar -> flujo de salida

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("empleados.txt");

            //Necesitamos guardar, vamos a usar un buffer
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            for (Employee employee: employeeList){
                String employeeds = employee.toString() + "\n";
                bos.write(employeeds.getBytes());
            }

            bos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
