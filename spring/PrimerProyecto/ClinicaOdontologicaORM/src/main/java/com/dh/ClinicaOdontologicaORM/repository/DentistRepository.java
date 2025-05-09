package com.dh.ClinicaOdontologicaORM.repository;

import com.dh.ClinicaOdontologicaORM.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository <Dentist, Integer> {
}
