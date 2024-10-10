package com.studyhub.sth.entities;

import com.studyhub.sth.Enum.TipoSquad;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "squads")
@Table(name = "squads")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "squadId")
public class Squad {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID squadId;

    @Column(nullable = false, length = 255)
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoSquad tipo;

    //@ManyToOne
    //@JoinColumn(name = "mentor_id")
    //private Mentor mentor;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToMany(mappedBy = "squad")
    private List<Representante> representantes;

    //@OneToMany(mappedBy = "squad")
    //private List<Aluno> alunos;


}