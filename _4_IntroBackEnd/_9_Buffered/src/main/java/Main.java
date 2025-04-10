import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Augusto", "Rinaldi", 12, 2000.0));
        employeeList.add(new Employee("Tomas", "Curet", 23, 2000.0));
        employeeList.add(new Employee("Ignacio", "Jauregui", 34, 2000.0));
        employeeList.add(new Employee("Santino", "Moreno", 45, 2000.0));
        employeeList.add(new Employee("Santiago", "Faya", 56, 2000.0));

        File.saveEmployeedSpecialFormat(employeeList);
    }
}
