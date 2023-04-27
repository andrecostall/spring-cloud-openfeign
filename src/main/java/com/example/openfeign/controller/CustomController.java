package com.example.openfeign.controller;

import com.example.openfeign.client.CepPostmonClient;
import com.example.openfeign.client.CepViaCepClient;
import com.example.openfeign.client.IbgeClient;
import com.example.openfeign.response.CepResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CustomController {

    private final CepPostmonClient cepPostmonClient;
    private final CepViaCepClient cepViaCepClient;
    private final IbgeClient ibgeClient;

    @GetMapping("/postmon/{cep}")
    public ResponseEntity<?> getApiPostmonCep(@PathVariable String cep) {
        return cepPostmonClient.getCep(cep);
    }

    @GetMapping("/viacep/{cep}")
    public ResponseEntity<CepResponse> getViaCep(@PathVariable String cep) {
        return cepViaCepClient.getCep(cep);
    }

    @GetMapping("/ibge/cnae/classes")
    public ResponseEntity<?> getClasses(@RequestParam(name="classeID", required = false) String id) {
        if(id == null) {
            return ibgeClient.getAllCnae();
        }
        return ibgeClient.getClasseByClasseID(id);
    }

}
