package com.studyhub.sth.services.alunos;

import com.studyhub.sth.dtos.alunos.AlunoUpdateDto;
import com.studyhub.sth.dtos.alunos.AlunoDto;
import com.studyhub.sth.dtos.alunos.AlunoCreateDto;
import com.studyhub.sth.exceptions.ElementoNaoEncontradoExcecao;

import java.util.List;
import java.util.UUID;

public interface IAlunoService {
    public AlunoDto criar(AlunoCreateDto novoAlunoDto) throws ElementoNaoEncontradoExcecao;
    public AlunoDto atualizar(UUID alunoId, AlunoUpdateDto alunoAtualizadoDto) throws ElementoNaoEncontradoExcecao;
    public AlunoDto detalhar(UUID alunoId) throws ElementoNaoEncontradoExcecao;
    public List<AlunoDto> listarTodos();
    public List<AlunoDto> listarPorPeriodo(int periodo);
}
