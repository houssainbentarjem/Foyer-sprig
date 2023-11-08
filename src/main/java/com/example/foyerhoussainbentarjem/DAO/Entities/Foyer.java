package com.example.foyerhoussainbentarjem.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Foyer")

public class Foyer {
    @Id
    @Column(name = "idFoyer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomFoyer;
    private long capaciteFoyer;
}
