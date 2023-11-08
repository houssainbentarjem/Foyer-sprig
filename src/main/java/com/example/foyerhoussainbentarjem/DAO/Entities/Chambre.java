package com.example.foyerhoussainbentarjem.DAO.Entities;

import jakarta.persistence.*;


@Entity
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column(name = "idChmabre")
    private long id;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeCh;

}
