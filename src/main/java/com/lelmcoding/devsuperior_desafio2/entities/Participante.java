package com.lelmcoding.devsuperior_desafio2.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    @ManyToMany
    private List<Atividade> atividade;
}
