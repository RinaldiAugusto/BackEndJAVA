package dao.impl;

import _4_IntroBackEndd._6_PatronDAO.src.dao.IDao;
import _4_IntroBackEndd._6_PatronDAO.src.model.Patient;

import java.util.List;

public class PatientDaoH2 implements IDao<Patient> {
    @Override
    public Patient save(Patient patient) {
        return null;
    }

    @Override
    public Patient findById(Integer id) {
        return null;
    }

    @Override
    public void update(Patient patient) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Patient> findAll() {
        return List.of();
    }
}
