package io.github.cursomicroservicos.sbootxp_sercurity.api.dto;

import io.github.cursomicroservicos.sbootxp_sercurity.domain.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class CadastroUsuarioDTO {

    private Usuario usuario;
    private List<String> permissoes;

}
