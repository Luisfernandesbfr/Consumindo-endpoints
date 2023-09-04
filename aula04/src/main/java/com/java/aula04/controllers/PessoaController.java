package com.java.aula04.controllers;

import com.java.aula04.dto.PessoaDTO;
import com.java.aula04.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @PostMapping("/salvar")
    public ResponseEntity salvar (@RequestBody PessoaDTO pessoaDTO){
        try{

            return ResponseEntity.ok("Pessoa cadastrada com sucesso");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }



    }




}
