package com.example.openfeign.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstadoInfo {

    private String area_km2;
    private String codigo_ibge;
}
