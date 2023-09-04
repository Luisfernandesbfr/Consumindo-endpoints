package com.java.aula04.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String localidade;
    private String bairro;
    private String numero;


}
