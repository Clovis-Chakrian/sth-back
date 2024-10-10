package com.studyhub.sth.dtos.rooms;

import com.studyhub.sth.dtos.conteudoEstudo.ConteudoEstudoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomAtualizadaDto {
    ConteudoEstudoDto conteudosRecomendados;
    //UUID cicloId;
   // UUID formularioId;
}
