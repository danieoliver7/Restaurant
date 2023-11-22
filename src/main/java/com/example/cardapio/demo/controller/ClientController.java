package com.example.cardapio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.demo.dto.ClientDto;
import com.example.cardapio.demo.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<ClientDto> findAllClients(){
    List<ClientDto> clients = clientService.findAll();
    return clients;
    }
}
