package com.example.openfeign.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CidadeInfo {
    private String area_km2;
    private String codigo_ibge;
}
