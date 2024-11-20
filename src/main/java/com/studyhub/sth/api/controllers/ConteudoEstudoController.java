package com.studyhub.sth.api.controllers;

import com.studyhub.sth.application.dtos.conteudoEstudo.ConteudoEstudoDto;
import com.studyhub.sth.application.dtos.conteudoEstudo.ConteudoEstudoUpdateDto;
import com.studyhub.sth.application.services.ConteudoEstudoService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import com.studyhub.sth.application.dtos.conteudoEstudo.ConteudoEstudoCreateDto;

@RestController
@RequestMapping("/api/conteudos-estudo")
@Tag(name = "Conteudos de Estudo Controller")
public class ConteudoEstudoController {
    @Autowired
    private ConteudoEstudoService conteudoEstudoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConteudoEstudoCreateDto criarConteudoEstudo(@RequestBody ConteudoEstudoCreateDto dto) {
        return conteudoEstudoService.criarConteudoEstudo(dto);
    }

    @GetMapping
    public List<ConteudoEstudoCreateDto> listarConteudosEstudo() {
        return conteudoEstudoService.listarConteudosEstudo();
    }

    @GetMapping("/{id}")
    public ConteudoEstudoDto obterConteudoEstudoPorId(@PathVariable UUID id) {
        return conteudoEstudoService.obterConteudoEstudoPorId(id);
    }

    @PutMapping("/{id}")
    public ConteudoEstudoDto atualizarConteudoEstudo(@PathVariable UUID id, @RequestBody ConteudoEstudoUpdateDto dto) {
        return conteudoEstudoService.atualizarConteudoEstudo(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarConteudoEstudo(@PathVariable UUID id) {
        conteudoEstudoService.deletarConteudoEstudo(id);
    }
}
