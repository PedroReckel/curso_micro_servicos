package io.github.cursomicroservicos.msavaliadorcredito.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor // Construir um construtor vazio
@Builder // Facilitar a construção de um objeto
public class SituacaoCliente {

    private DadosCliente cliente;

    private List<CartaoCliente> cartoes;

}
