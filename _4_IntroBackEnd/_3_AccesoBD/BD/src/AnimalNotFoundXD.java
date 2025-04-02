import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AnimalNotFoundXD {
    // Crear una aplicacion que tenga acceso a una tabla animales
    // Los animales deben tener nombre y tipo
    // Obligatorio -> ID

    public static void main(String[] args) {

        // 1. Conectarnos a la base de datos
        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();

            // Orden a la BD
            statement.execute("DROP TABLE IF EXISTS ANIMALES; CREATE" +
                    " TABLE ANIMALES (ID INT PRIMARY KEY," +
                    " NOMBRE VARCHAR(100) NOT NULL," +
                    " TIPO VARCHAR(100) NOT NULL)");

            statement.execute("INSERT INTO ANIMALES VALUES (1, 'Molly', 'gato')," +
                    " (2, 'India', 'perro'), (3, 'Sofi', 'perro'), (4, 'Rocky', 'tortuga')");

            // Checkear que se hayan cargado los datos en java, ES UNA CONSULTA

            ResultSet rs = statement.executeQuery("SELECT * FROM ANIMALES");

            // Imprimir por consola
            while (rs.next()){
                System.out.println("Nombre: " + rs.getString(2) + " - "
                + "Tipo: " + rs.getString(3));
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/BD", "sa", "sa");
    }

}
