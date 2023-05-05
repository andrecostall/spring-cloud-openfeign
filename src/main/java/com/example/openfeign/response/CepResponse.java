package com.example.openfeign.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CepResponse {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private EstadoInfo estado_info;
    private CidadeInfo cidade_info;
}
