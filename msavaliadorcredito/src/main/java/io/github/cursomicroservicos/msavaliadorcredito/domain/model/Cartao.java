package io.github.cursomicroservicos.msavaliadorcredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Cartao {

    private Long id;

    private String nome;

    private String banderia;

    private BigDecimal limiteBasico;

}
