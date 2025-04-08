package _4_IntroBackEnd._6_PatronDAO.src;

import _4_IntroBackEnd._6_PatronDAO.src.dao.BD;
import _4_IntroBackEnd._6_PatronDAO.src.dao.impl.DentistDaoH2;
import _4_IntroBackEnd._6_PatronDAO.src.model.Dentist;
import _4_IntroBackEnd._6_PatronDAO.src.service.DentistService;

public class Main {
    public static void main(String[] args) {
        DentistService dentistService = new DentistService(new DentistDaoH2());

        //Creamos las tablas
        BD.createTables();

        //Crear objetos
        Dentist dentist1 = new Dentist(1234, "Augusto", "Rinaldi");
        Dentist dentist2 = new Dentist(5678, "Tomas", "Curet");
        Dentist dentist3 = new Dentist(9101, "Ignacio", "Jauregui");
        Dentist dentist4 = new Dentist(1213, "Manuel", "Linzoain");
        Dentist dentist5 = new Dentist(1415, "Agustin", "Alegre");

        dentistService.save(dentist1);
        dentistService.save(dentist2);
        dentistService.save(dentist3);
        dentistService.save(dentist4);
        dentistService.save(dentist5);

        //Consultar odontologo por id
        int id = 2;
        dentistService.findById(id);

        //Actualizar alguno de los atributos de un odontologo
        String update = "Andres";
        dentist1.setName(update);
        dentistService.update(dentist1);
        System.out.println("El nombre actualizado es: " + dentist1.getName());

        //Borrar alguno de los registros de la tabla
        int idDelete = 4;
        dentistService.delete(idDelete);

        //Consultar los registros restantes de la tabla
        dentistService.findAll();

    }
}
