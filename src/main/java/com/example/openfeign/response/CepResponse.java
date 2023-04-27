package com.example.openfeign.response;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CepResponse {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
