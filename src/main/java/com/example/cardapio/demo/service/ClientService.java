package com.example.cardapio.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.cardapio.demo.dto.ClientDto;
import com.example.cardapio.demo.entities.Client;
import com.example.cardapio.demo.repositories.ClientRepositorie;

@Service
public class ClientService {

    @Autowired
    private ClientRepositorie clientRepositorie;

    public List<ClientDto> findAll(){
        List<Client> result = clientRepositorie.findAll();
        List<ClientDto> resultList = result.stream().map(x -> new ClientDto(x)).toList();
        return resultList;
    }

    public void deleteById(@PathVariable Client id){
        clientRepositorie.deleteById(id.getId());
    }
}
