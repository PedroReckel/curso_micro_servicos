package io.github.cursomicroservicos.mscartoes.domain;

import lombok.Data;

import java.math.BigDecimal;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosSolicitacaoEmissaoCartao {
    private Long idCartao;
    private String cpf;
    private String endereco;
    private BigDecimal limiteLiberado;
}