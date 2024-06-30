package com.lelmcoding.devsuperior_desafio2.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    @ManyToOne
    private Categoria categoria;
    @ManyToMany
    @JoinTable(name = "tb_participante_atividade"
            ,joinColumns = @JoinColumn(name="atividade_id")
            ,inverseJoinColumns = @JoinColumn(name = "participante_id"))
    private List<Participante> participante;
}
