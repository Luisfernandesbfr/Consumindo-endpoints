package com.java.aula04.controllers;

import com.java.aula04.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("buscar/cep/{cep}")
    public ResponseEntity buscarPorCep(@PathVariable String cep){
        try{
            return ResponseEntity.ok(enderecoService.buscarPorCep(cep));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
