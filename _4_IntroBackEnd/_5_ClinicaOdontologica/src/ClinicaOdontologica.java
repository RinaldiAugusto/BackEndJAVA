package _4_IntroBackEnd._5_ClinicaOdontologica.src;

import java.sql.*;
import java.util.logging.Logger;

public class ClinicaOdontologica {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS DENTIST; CREATE TABLE DENTIST " +
                                                    "(ID INT PRIMARY KEY," +
                                                    " REGISTRATION INT NOT NULL," +
                                                    " NAME varchar(100) NOT NULL," +
                                                    " LASTNAME varchar(100) NOT NULL)";

    private static final String SQL_INSERT = "INSERT INTO DENTIST (ID, REGISTRATION, NAME, LASTNAME)" +
                                            " VALUES(?,?,?,?)";

    private static final String SQL_SELECT = "SELECT * FROM DENTIST";

    private static final String SQL_UPDATE = "UPDATE DENTIST SET NAME=? WHERE ID=?";

    private static final String SQL_SELECT_ID= "SELECT * FROM DENTIST WHERE ID=?";

    private static final String SQL_DELETE= "DELETE FROM DENTIST WHERE ID=?";

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ClinicaOdontologica.class));


    public static void main(String[] args) throws SQLException {

        Dentist dentist1 = new Dentist(1, 123, "Augusto", "Rinaldi");
        Dentist dentist2 = new Dentist(2, 1234, "Tomas", "Curet");

        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setInt(1, dentist1.getId());
            preparedStatement.setInt(2, dentist1.getRegistration());
            preparedStatement.setString(3, dentist1.getName());
            preparedStatement.setString(4, dentist1.getLastName());
            preparedStatement.execute();

            preparedStatement.setInt(1, dentist2.getId());
            preparedStatement.setInt(2, dentist2.getRegistration());
            preparedStatement.setString(3, dentist2.getName());
            preparedStatement.setString(4, dentist2.getLastName());
            preparedStatement.execute();

            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            System.out.println("Los valores insertados en la tabla son los siguientes: ");
            while (resultSet.next()){
                System.out.println(
                                    "ID: " + resultSet.getInt(1) +
                                    " |Matricula: " + resultSet.getInt(2) +
                                    " |Nombre: " + resultSet.getString(3) +
                                    " |Apellido: " + resultSet.getString(4));
                LOGGER.info("ID: " + resultSet.getInt(1) +
                        " |Matricula: " + resultSet.getInt(2) +
                        " |Nombre: " + resultSet.getString(3) +
                        " |Apellido: " + resultSet.getString(4));
            }


            connection.setAutoCommit(false);

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(SQL_UPDATE);
            String update = "Marcelo Augusto";
            preparedStatementUpdate.setString(1, update);
            preparedStatementUpdate.setInt(2, dentist1.getId());
            preparedStatementUpdate.execute();

            connection.commit();
            LOGGER.warning("Se actualizo el registro correspondiente al id: " + dentist1.getId());
            connection.setAutoCommit(true);


            //BORRAR UN REGISTRO DE LA BD
            //TRANSACCION
            connection.setAutoCommit(false);

            PreparedStatement psDelete = connection.prepareStatement(SQL_DELETE);
            psDelete.setInt(1, dentist2.getId());
            psDelete.execute();

            connection.commit();
            LOGGER.warning("AVISO: Se elimino el registro con id=2");
            connection.setAutoCommit(true);


        } catch (Exception e){
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }

        // IMPRIMIR POR CONSOLA EL VALOR QUE MODIFICAMOS
        try {
            connection = getConnection();

            int id = 2;

            PreparedStatement preparedStatement1 = connection.prepareStatement(SQL_SELECT_ID);
            preparedStatement1.setInt(1, id);

            ResultSet resultSet1 = preparedStatement1.executeQuery();
            while (resultSet1.next()){
                System.out.println("Los datos actualizados: " +
                        "ID: " + resultSet1.getInt(1) +
                        " |Matricula: " + resultSet1.getInt(2) +
                        " |Nombre: " + resultSet1.getString(3) +
                        " |Apellido: " + resultSet1.getString(4));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }

        //CHECKEAR QUE SE BORRO EL REGISTRO QUE SELECCIONAMOS
        try {
            connection = getConnection();

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(SQL_SELECT);
            System.out.println("Resultado de DELETE...");
            while (rs.next()){
                System.out.println("ID: " + rs.getInt(1) +
                        " |Matricula: " + rs.getInt(2) +
                        " |Nombre: " + rs.getString(3) +
                        " |Apellido: " + rs.getString(4));
            }



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }


    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/ClinicaOdontologica");
    }
}
