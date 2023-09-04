package com.java.aula04.services;

import com.java.aula04.dto.EnderecoDTO;
import com.java.aula04.dto.PessoaDTO;
import com.java.aula04.models.Endereco;
import com.java.aula04.models.Pessoa;
import com.java.aula04.repositores.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    @Autowired
    private EnderecoService enderecoService;


    @Autowired
    private PessoaRepository pessoaRepository;


    public void salvar(PessoaDTO pessoaDTO)throws Exception{

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setEmail(pessoaDTO.getEmail());
        pessoa.setAtivo(pessoaDTO.getAtivo());

        Pessoa pessoaSalva = pessoaRepository.save(pessoa);


        EnderecoDTO enderecoDTO = enderecoService.buscarPorCep(pessoaDTO.getEnderecoDTO().getCep());
        if (enderecoDTO == null){
            enderecoDTO = pessoaDTO.getEnderecoDTO();
        }
        enderecoService.salvar(enderecoDTO, pessoa);


    }
}
