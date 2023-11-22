package com.minicurso.api.minicurso.service;

import com.minicurso.api.minicurso.model.TarefaModel;
import com.minicurso.api.minicurso.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;
    public List<TarefaModel> listar(){return tarefaRepository.findAll();}

    public TarefaModel salvar(TarefaModel tarefa){return  tarefaRepository.save(tarefa);}

    public TarefaModel atualizar(Integer id, TarefaModel tarefaAtualizada) {
        Optional<TarefaModel> tarefaExistente = tarefaRepository.findById(id);
        if (tarefaExistente.isPresent()) {
            TarefaModel tarefa = tarefaExistente.get();

            tarefa.atualizar(tarefaAtualizada);
            return tarefaRepository.save(tarefa);
        }
        else {
            return null;
        }
    }
    public void excluir(Integer id){tarefaRepository.deleteById(id);}
}
