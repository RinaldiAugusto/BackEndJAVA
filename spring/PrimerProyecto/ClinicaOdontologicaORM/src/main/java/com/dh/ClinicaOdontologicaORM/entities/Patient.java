package com.dh.ClinicaOdontologicaORM.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastName;
    private String cardIdentity;
    private LocalDate admisionOfDate;

}
