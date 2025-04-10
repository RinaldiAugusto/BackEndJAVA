package dao.impl;

import dao.BD;
import dao.IDao;
import model.Dentist;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DentistDaoH2 implements IDao<Dentist> {

    private static final Logger LOGGER = Logger.getLogger(DentistDaoH2.class);

    private static final String SQL_INSERT = "INSERT INTO DENTIST(REGISTRATION, NAME, LASTNAME) VALUES(?,?,?)";

    private static final String SQL_SELECT = "SELECT * FROM DENTIST WHERE ID=?";

    private static final String SQL_UPDATE = "UPDATE DENTIST SET REGISTRATION=?, NAME=?, LASTNAME=? WHERE ID=?";

    private static final String SQL_DELETE = "DELETE FROM DENTIST WHERE ID=?";

    private static final String SQL_SELECT_ALL = "SELECT * FROM DENTIST";

    @Override
    public Dentist save(Dentist dentist) {
        Connection connection = null;
        try {
            LOGGER.info("Se inicio una operacion de guardado de odontologo.");

            //Conectarnos a la BD
            connection = BD.getConnection();

            //Insertamos valores -> guardar en la tabla
            PreparedStatement ps = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dentist.getRegistration());
            ps.setString(2, dentist.getName());
            ps.setString(3, dentist.getLastName());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()){
                dentist.setId(rs.getInt(1));
                LOGGER.info("Este es el odontologo que se guardo: " + dentist);
            }

        }catch (Exception e){
            LOGGER.error("ERROR: " + e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dentist;
    }

    @Override
    public Dentist findById(Integer id) {
        Connection connection = null;
        LOGGER.info("Iniciando la busqueda de un odontologo.");
        Dentist dentist = null;

        try {
            connection = BD.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_SELECT);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                dentist = new Dentist(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                LOGGER.info("Buscamos el odontologo con ID= " + dentist.getId() +
                             " es: " + dentist);
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("ERROR: " + e.getMessage());
            }
        }
        return dentist;
    }

    @Override
    public void update(Dentist dentist) {
        LOGGER.info("Se esta iniciando la actualizacion de un odontologo");
        Connection connection = null;

        try {
            connection = BD.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_UPDATE);
            ps.setInt(1, dentist.getRegistration());
            ps.setString(2, dentist.getName());
            ps.setString(3, dentist.getLastName());
            ps.setInt(4, dentist.getId());
            ps.execute();


        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("ERROR: " + e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("ERROR: " + e.getMessage());
            }
        }


    }

    @Override
    public void delete(Integer id) {
        Connection connection = null;

        try {
            connection = BD.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            ps.execute();
            LOGGER.warn("Se elimino el odontologo con id: " + id);

        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("ERROR: " + e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("ERROR: " + e.getMessage());
            }
        }
    }

    @Override
    public List<Dentist> findAll() {
        Connection connection = null;
        LOGGER.info("Se esta iniciando la busqueda de todos los odontologos.");
        List<Dentist> dentistList = new ArrayList<>();
        Dentist dentist = null;

        try {
            connection = BD.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_SELECT_ALL);
            //Guardamos en un resulset la consulta a la BD
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                //Guardar la consulta proveniente del Resulset en un objeto en java
                dentist = new Dentist(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));

                //Guardar los odontologos en la lista
                dentistList.add(dentist);
                LOGGER.info("Se encontraron los odontologos con id: " + dentist.getId());
            }

        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("ERROR: " + e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("ERROR: " + e.getMessage());
            }
        }

        return dentistList;
    }
}
