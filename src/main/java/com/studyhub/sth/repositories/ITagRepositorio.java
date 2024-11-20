package com.studyhub.sth.repositories;

import com.studyhub.sth.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ITagRepositorio extends JpaRepository<Tag, UUID> {
    Optional<Tag> findByNome(String nome);
}
