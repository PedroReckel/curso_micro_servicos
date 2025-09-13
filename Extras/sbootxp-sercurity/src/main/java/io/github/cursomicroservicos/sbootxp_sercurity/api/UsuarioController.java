package io.github.cursomicroservicos.sbootxp_sercurity.api;

import io.github.cursomicroservicos.sbootxp_sercurity.api.dto.CadastroUsuarioDTO;
import io.github.cursomicroservicos.sbootxp_sercurity.domain.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody CadastroUsuarioDTO body) {

    }

}
