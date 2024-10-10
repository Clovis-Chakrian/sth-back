package com.studyhub.sth.controllers;

import com.studyhub.sth.dtos.alunos.AlunoAtualizadoDto;
import com.studyhub.sth.dtos.alunos.AlunoDto;
import com.studyhub.sth.dtos.alunos.NovoAlunoDto;
import com.studyhub.sth.dtos.users.NovoUsuarioDto;
import com.studyhub.sth.dtos.users.UsuarioAtualizadoDto;
import com.studyhub.sth.dtos.users.UsuarioDto;
import com.studyhub.sth.entities.Aluno;
import com.studyhub.sth.exceptions.ElementoNaoEncontradoExcecao;
import com.studyhub.sth.services.alunos.IAlunoService;
import com.studyhub.sth.services.usuarios.IUsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/alunos")
@Tag(name = "Alunos Controller")
public class AlunosController {
    @Autowired
    private IAlunoService alunoService;

    @PostMapping()
    public ResponseEntity<AlunoDto> criar(@RequestBody NovoAlunoDto novoAlunoDto) throws ElementoNaoEncontradoExcecao {
        return new ResponseEntity<>(this.alunoService.criar(novoAlunoDto), HttpStatus.CREATED);
    }

    @PutMapping("{alunoId}")
    public ResponseEntity<AlunoDto> atualizar(@PathVariable UUID alunoId, @RequestBody AlunoAtualizadoDto alunoAtualizadoDto) throws ElementoNaoEncontradoExcecao {
        return new ResponseEntity<>(this.alunoService.atualizar(alunoId, alunoAtualizadoDto), HttpStatus.OK);
    }

    @GetMapping("{usuarioId}")
    public ResponseEntity<AlunoDto> detalhar(@PathVariable UUID usuarioId) throws ElementoNaoEncontradoExcecao {
        return new ResponseEntity<>(this.alunoService.detalhar(usuarioId), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<AlunoDto>> listarTodos() throws ElementoNaoEncontradoExcecao {
        return new ResponseEntity<>(this.alunoService.listarTodos(), HttpStatus.OK);
    }
}
