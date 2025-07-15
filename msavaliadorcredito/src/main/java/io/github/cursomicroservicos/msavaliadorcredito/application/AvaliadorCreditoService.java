package io.github.cursomicroservicos.msavaliadorcredito.application;

import io.github.cursomicroservicos.msavaliadorcredito.domain.model.SituacaoCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    public SituacaoCliente obterSituacaoCliente(String cpf) {
        // obterDadosCliente - MSCLIENTES
        // obter cartoes do cliente - MSCARTOES
    }

}
