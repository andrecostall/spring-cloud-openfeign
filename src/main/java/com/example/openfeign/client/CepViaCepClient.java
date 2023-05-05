package com.example.openfeign.client;

import com.example.openfeign.response.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep-client", url = "https://viacep.com.br/ws/")
public interface CepViaCepClient {

    @GetMapping("/{cep}/json")
    ResponseEntity<?> getCep(@PathVariable("cep") String cep);

}
