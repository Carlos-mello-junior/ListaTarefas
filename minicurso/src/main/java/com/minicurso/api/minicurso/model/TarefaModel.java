package com.minicurso.api.minicurso.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "tb_tarefas")
public class TarefaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    public TarefaModel(){
    }
    public TarefaModel(String nome){this.nome =  nome;}
    public void atualizar(TarefaModel tarefaAtualizada){
        if (tarefaAtualizada.getNome () != null){
            this.nome = tarefaAtualizada.getNome();
        }
    }
    public Integer getpId(){return id;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
