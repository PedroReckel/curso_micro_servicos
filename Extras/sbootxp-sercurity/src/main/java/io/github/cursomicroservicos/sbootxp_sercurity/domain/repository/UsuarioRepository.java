package io.github.cursomicroservicos.sbootxp_sercurity.domain.repository;

import io.github.cursomicroservicos.sbootxp_sercurity.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
