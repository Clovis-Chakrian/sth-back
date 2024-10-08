package com.studyhub.sth.dtos.users;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NovoUsuarioDto {
    String nome;
    String email;
    String senha;
    Date dataNascimento;
}