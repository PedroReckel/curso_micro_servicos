package io.github.cursomicroservicos.sbootxp_sercurity.domain.service;

import io.github.cursomicroservicos.sbootxp_sercurity.domain.entity.Usuario;
import io.github.cursomicroservicos.sbootxp_sercurity.domain.repository.GrupoRepository;
import io.github.cursomicroservicos.sbootxp_sercurity.domain.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final GrupoRepository grupoRepository;

    public Usuario salvar(Usuario usuario, List<String> grupos) {
        repository.save(usuario);
        grupos.stream().map(nomeGrupo -> {
            grupoRepository.findByNome(permissao);
        })
    }

}
