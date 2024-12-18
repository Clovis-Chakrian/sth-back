package com.studyhub.sth.domain.services;

import com.studyhub.sth.application.dtos.discussao.DiscussaoDto;
import com.studyhub.sth.application.dtos.discussao.NewDiscussaoDto;
import com.studyhub.sth.application.dtos.discussao.UpdatedDiscussaoDto;
import com.studyhub.sth.domain.entities.Discussao;
import com.studyhub.sth.domain.entities.Usuario;
import com.studyhub.sth.domain.exceptions.ElementoNaoEncontradoExcecao;

import java.util.List;
import java.util.UUID;

public interface IDiscussaoService {
    DiscussaoDto create(NewDiscussaoDto discussao, Usuario usuarioAtual);
    DiscussaoDto createChild(NewDiscussaoDto discussao, UUID discussaoId, Usuario usuarioAtual) throws ElementoNaoEncontradoExcecao;
    List<DiscussaoDto> findAll();
    List<DiscussaoDto> findAllChild(UUID discussaoId) throws ElementoNaoEncontradoExcecao;
    DiscussaoDto update(UUID discussaoId, UpdatedDiscussaoDto discussao, Usuario usuarioAtual) throws Exception;
}
