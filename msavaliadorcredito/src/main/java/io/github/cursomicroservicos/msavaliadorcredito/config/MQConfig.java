package io.github.cursomicroservicos.msavaliadorcredito.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class MQConfig {

    @Value("${mq.queues.emissao-cartoes}")
    private String emissaoCartoesFila;

    public Queue queueEmissaoCartoes() {
        return new Queue(emissaoCartoesFila, true);
    }

}
