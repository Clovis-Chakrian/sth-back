package com.studyhub.sth.application.dtos.alunos;

import com.studyhub.sth.application.dtos.users.UsuarioCreateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoCreateDto {
    private UsuarioCreateDto novoUsuarioDto;
    private int periodo;
    private String curso;
    private UUID instituicaoEnsinoId;
}