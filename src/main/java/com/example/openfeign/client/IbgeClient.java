package com.example.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ibge-client", url = "https://servicodados.ibge.gov.br/api/v2/")
public interface IbgeClient {

    @GetMapping("cnae/classes")
    ResponseEntity<?> getAllCnae();

    @GetMapping("cnae/classes/{classeID}")
    ResponseEntity<?> getClasseByClasseID(@PathVariable("classeID") String classeID);

}
