package com.studyhub.sth.entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "instituicao_ensino")
@Table(name = "instituicao_ensino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "instituicaoEnsinoId")
public class InstituicaoEnsino {
    
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID instituicaoEnsinoId;

    private String nome;
    private String endereco;
    private String coordenador;

    @OneToMany()
    private List<Aluno> alunos = new ArrayList<>();
    
    //@OneToMany(mappedBy = "instituicaoEnsino")
    //private List<Squad> squads;

}
