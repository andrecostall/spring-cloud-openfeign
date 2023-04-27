package com.example.openfeign.client;

import com.example.openfeign.response.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cep-postmon-client", url = "https://api.postmon.com.br")
public interface CepPostmonClient {

    @GetMapping("/v1/cep/{cep}")
    ResponseEntity<?> getCep(@PathVariable("cep") String cep);

}
