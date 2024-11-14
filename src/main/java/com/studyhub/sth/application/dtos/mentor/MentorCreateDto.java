package com.studyhub.sth.application.dtos.mentor;

import com.studyhub.sth.application.dtos.users.UsuarioCreateDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MentorCreateDto {
    @Valid
    UsuarioCreateDto usuarioDto;
}