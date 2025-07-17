package io.github.cursomicroservicos.msavaliadorcredito.application;

import io.github.cursomicroservicos.msavaliadorcredito.domain.model.CartaoCliente;
import io.github.cursomicroservicos.msavaliadorcredito.domain.model.DadosCliente;
import io.github.cursomicroservicos.msavaliadorcredito.domain.model.SituacaoCliente;
import io.github.cursomicroservicos.msavaliadorcredito.infra.clients.CartoesResourceClient;
import io.github.cursomicroservicos.msavaliadorcredito.infra.clients.ClienteResourceClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clientesClient;

    private final CartoesResourceClient cartoesClient;

    public SituacaoCliente obterSituacaoCliente(String cpf) {
        // obterDadosCliente - MSCLIENTES
        // obter cartoes do cliente - MSCARTOES

        ResponseEntity<DadosCliente> dadosClienteResponse = clientesClient.dadosCliente(cpf);
        ResponseEntity<List<CartaoCliente>> cartoesResponse = cartoesClient.getCartoesByCliente(cpf);

        return SituacaoCliente
                .builder()
                .cliente(dadosClienteResponse.getBody())
                .cartoes(cartoesResponse.getBody())
                .build();
    }

}
