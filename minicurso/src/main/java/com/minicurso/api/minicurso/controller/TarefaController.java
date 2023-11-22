package com.minicurso.api.minicurso.controller;

import com.minicurso.api.minicurso.model.TarefaModel;
import com.minicurso.api.minicurso.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;
    @GetMapping
    public List<TarefaModel> listar(){return tarefaService.listar();}
    @PostMapping
    public TarefaModel cadastrar(@RequestBody TarefaModel tarefa){return tarefaService.salvar(tarefa);}
    @PutMapping("/{id}")
    public TarefaModel atualizar(@PathVariable Integer id, @RequestBody TarefaModel tarefa) {
        if (!id.equals(tarefa.getId())){
            return null;
        }
        return tarefaService.atualizar(id, tarefa);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id){
        tarefaService.excluir(id);
    }

}
