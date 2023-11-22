package com.minicurso.api.minicurso.repository;

import com.minicurso.api.minicurso.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Integer> {

}
