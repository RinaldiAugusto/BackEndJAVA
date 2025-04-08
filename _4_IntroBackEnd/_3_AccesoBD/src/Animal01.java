package _4_IntroBackEnd._3_AccesoBD.src;

import org.apache.log4j.Logger;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Animal01 {
     //CREAR UNA APLICACION QUE TENGA CCESO A UNA TABLA ANIMALES
    // LOS ANIMALES DEBEN TENER NOMBRE Y TIPO
    // OBLIGATORIA -> ID

    //GENERAR CONSTANTES
    //CONECCION CON LA BASE DE DATOS Y CREACION DE TABLA
    private static final String SQL_DROP_CREATE = ("DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES" +
            " (ID INT PRIMARY KEY, " +
            " NOMBRE VARCHAR(100) NOT NULL, " +
            " TIPO VARCHAR(100) NOT NULL)");

    //AGREGO VALORES A MIS TABLAS
    private static final String SQL_INSERT = ("INSERT INTO ANIMALES VALUES" +
            " (1, 'India', 'Perro')," +
            " (2, 'Napoleon', 'Perro')," +
            " (3, 'Melba', 'Gato')," +
            " (4, 'Rocky', 'Tortuga')");

    //CONSULTAR SI SE HAN CREADO LOS DATOS
    private static final String SQL_SELECT = ("SELECT * FROM ANIMALES");

    //BORRAR VALOR DE LA BASE DE DATOS
    private static final String SQL_DELETE = ("DELETE FROM ANIMALES WHERE ID = 4");

    private static final Logger logger = Logger.getLogger(Animal01.class);


    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();

            //CONECCION CON LA BASE DE DATOS Y CREACION DE TABLA
            statement.execute(SQL_DROP_CREATE);

            //AGREGO VALORES A MIS TABLAS
            statement.execute(SQL_INSERT);

            //CONSULTAR SI SE HAN CREADO LOS DATOS
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            //IMPRIMIR LA CONSULTA
            while (resultSet.next()){
                System.out.println("Nombre: " + resultSet.getString(2) + " - " + "Tipo: " + resultSet.getString(3));
                logger.info("Nombre: " + resultSet.getString(2) + " - " + "Tipo: " + resultSet.getString(3));
            }

            //BORRAR UN VALOR DE LA BASE DE DATOS
            statement.execute(SQL_DELETE);
            logger.warn("ADVERTENCIA: Se borro un animal de la tabla con ID = 4");

            //GUARDAR EN JAVA LA NUEVA CONSULTA
            resultSet = statement.executeQuery(SQL_SELECT);

            //IMPRIMIR LA CONSULTA
            System.out.println("-------------------------------------------");
            while (resultSet.next()){
                System.out.println("Nombre: " + resultSet.getString(2) + " - " + "Tipo: " + resultSet.getString(3));
                logger.info("Nombre: " + resultSet.getString(2) + " - " + "Tipo: " + resultSet.getString(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            //CERRAR LA CONEXION A LA BASE DE DATOS
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/AccesoBD","sa","sa");
    }
}
