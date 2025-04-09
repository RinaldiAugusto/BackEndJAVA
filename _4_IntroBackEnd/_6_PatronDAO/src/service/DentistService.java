package service;

import _4_IntroBackEndd._6_PatronDAO.src.dao.IDao;
import _4_IntroBackEndd._6_PatronDAO.src.model.Dentist;

import java.util.List;

public class DentistService {

    private IDao<Dentist> dentistIDao;

    public DentistService(IDao<Dentist> dentistIDao){
        this.dentistIDao = dentistIDao;
    }

    public Dentist save(Dentist dentist){
        return dentistIDao.save(dentist);
    }

    public Dentist findById(Integer id){
        return dentistIDao.findById(id);
    }

    public void update(Dentist dentist){
        dentistIDao.update(dentist);
    }

    public void delete(Integer id){
        dentistIDao.delete(id);
    }

    public List<Dentist> findAll(){
        return dentistIDao.findAll();
    }

}
