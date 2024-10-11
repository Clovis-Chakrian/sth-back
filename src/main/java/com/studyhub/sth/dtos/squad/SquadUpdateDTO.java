package com.studyhub.sth.dtos.squad;

import com.studyhub.sth.Enum.TipoSquad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SquadUpdateDTO {
    private String nome;
    private TipoSquad tipo;
    private UUID mentorId;
    private UUID empresaId;
}
