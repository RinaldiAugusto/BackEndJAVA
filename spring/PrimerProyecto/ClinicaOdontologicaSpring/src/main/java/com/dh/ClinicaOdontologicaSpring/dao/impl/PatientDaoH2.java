package com.dh.ClinicaOdontologicaSpring.dao.impl;


import com.dh.ClinicaOdontologicaSpring.dao.IDao;
import com.dh.ClinicaOdontologicaSpring.model.Patient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
