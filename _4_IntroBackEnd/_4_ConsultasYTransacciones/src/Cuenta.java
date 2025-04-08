package _4_IntroBackEnd._4_ConsultasYTransacciones.src;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Cuenta {

    // 1) VAMOS A CREAR UNA TABLA CUENTA CON 4 COLUMNAS (ID, NRO CUENTA, TITULAR, SALDO)
    private static final String SQL_TABLE_CREATE = ("DROP TABLE IF EXISTS CUENTAS; CREATE TABLE CUENTAS" +
            " (ID INT PRIMARY KEY," +
            " NUMERO_CUENTA INT NOT NULL," +
            " TITULAR VARCHAR(100) NOT NULL," +
            " SALDO NUMERIC(10, 2) NOT NULL)");

    //NUMERIC(10, 2) EJ -> 1234567891,91

    // 2) INSERTAR VALORES A LA TABLA
    private static final String SQL_INSERT = ("INSERT INTO CUENTAS VALUES (?,?,?,?)");

    private static final String SQL_SELECT = ("SELECT * FROM CUENTAS");

    private static final String SQL_UPDATE = ("UPDATE CUENTAS SET SALDO=? WHERE ID=?");

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = getConnection();

            // 1) VAMOS A CREAR UNA TABLA CUENTA CON 4 COLUMNAS (ID, NRO CUENTA, TITULAR, SALDO)
            Statement statement = connection.createStatement();
            statement.execute(SQL_TABLE_CREATE);

            // 2) INSERTAR VALORES A LA TABLA
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setInt(1, 1);
            preparedStatement.setInt(2, 401036);
            preparedStatement.setString(3, "Augusto");
            preparedStatement.setDouble(4, 2459.00);

            //EJECUTAR PARA CARGAR VALORES
            preparedStatement.execute();

            //GUARDAR EN UN OBJETO JAVA PARA PODER CONSULTAR
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);

            //IMPRIMIR POR PANTALLA
            while (resultSet.next()){
                System.out.println("Los datos de la cuenta y el saldo:" +
                        " ID: " + resultSet.getInt(1) +
                        " - Nro cuenta: " + resultSet.getInt(2) +
                        " - Nombre: " + resultSet.getString(3) +
                        " - Saldo: " + resultSet.getDouble(4));
            }

            //VAMOS A GENERAR UNA TRANSACCION
            connection.setAutoCommit(false); // para poder manejar el momento en el que vamos hacer commit

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(SQL_UPDATE);

            preparedStatementUpdate.setDouble(1, 3450.00);
            preparedStatementUpdate.setInt(2, 1);

            preparedStatementUpdate.execute();

            // Forzar excepcion
            int exception = 4/0;

            connection.commit();

            // BUENA PRACTICA...
            connection.setAutoCommit(true);

            ResultSet resultSet1 = statement.executeQuery(SQL_SELECT);

            while (resultSet1.next()){
                System.out.println("El saldo actualizado es:" +
                        " ID: " + resultSet1.getInt(1) +
                        " - Nro cuenta: " + resultSet1.getInt(2) +
                        " - Nombre: " + resultSet1.getString(3) +
                        " - Saldo: " + resultSet1.getDouble(4));
            }


        }catch (Exception e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet2 = statement.executeQuery(SQL_SELECT);

            while (resultSet2.next()){
                System.out.println("El saldo actualizado es:" +
                        " ID: " + resultSet2.getInt(1) +
                        " - Nro cuenta: " + resultSet2.getInt(2) +
                        " - Nombre: " + resultSet2.getString(3) +
                        " - Saldo: " + resultSet2.getDouble(4));
            }


        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/ConsultasYTransacciones", "sa", "sa");
    }
}
