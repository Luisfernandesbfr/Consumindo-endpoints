package com.java.aula04.services;

import com.java.aula04.client.EnderecoClient;
import com.java.aula04.dto.EnderecoDTO;
import com.java.aula04.models.Endereco;
import com.java.aula04.models.Pessoa;
import com.java.aula04.repositores.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    private EnderecoClient enderecoClient;

    public EnderecoDTO buscarPorCep(String cep) throws Exception{
        return enderecoClient.buscarPorCep(cep);

    }

    public Endereco salvar(EnderecoDTO enderecoDTO, Pessoa pessoa){

        Endereco endereco = new Endereco();
        endereco.setCep(enderecoDTO.getCep());
        endereco.setLogradouro(enderecoDTO.getLogradouro());
        endereco.setCidade(enderecoDTO.getLocalidade());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setPessoa(pessoa);
        return enderecoRepository.save(endereco);


    }
}
