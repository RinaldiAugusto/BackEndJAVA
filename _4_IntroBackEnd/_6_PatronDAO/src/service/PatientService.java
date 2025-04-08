package _4_IntroBackEnd._6_PatronDAO.src.service;

import _4_IntroBackEnd._6_PatronDAO.src.dao.IDao;
import _4_IntroBackEnd._6_PatronDAO.src.model.Patient;

import java.util.List;

public class PatientService {
    private IDao<Patient> patientIDao;

    public PatientService(IDao<Patient> patientIDao) {
        this.patientIDao = patientIDao;
    }

    public Patient save(Patient patient){
        return patientIDao.save(patient);
    }

    public Patient findById(Integer id){
        return patientIDao.findById(id);
    }

    public void update(Patient patient){
        patientIDao.update(patient);
    }

    public void delete(Integer id){
        patientIDao.delete(id);
    }

    public List<Patient> findAll(){
        return patientIDao.findAll();
    }
}
