package com.example.foyerhoussainbentarjem.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Bloc")

public class Bloc {
    @Id
    @Column(name = "idBloc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomBloc;
    private long capaciteBloc;

}
