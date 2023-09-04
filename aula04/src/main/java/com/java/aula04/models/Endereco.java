package com.java.aula04.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String numero;
    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;


}
