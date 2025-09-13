package io.github.cursomicroservicos.sbootxp_sercurity.domain.repository;

import io.github.cursomicroservicos.sbootxp_sercurity.domain.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GrupoRepository extends JpaRepository<Grupo, String> {

    Optional<Grupo> findByNome(String nome);

}
