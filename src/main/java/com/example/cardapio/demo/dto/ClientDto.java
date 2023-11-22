package com.example.cardapio.demo.dto;

import com.example.cardapio.demo.entities.Client;

public class ClientDto {

    private Long id;
    private String nameClient;
    private String password;



    public ClientDto() {
    }


    public ClientDto(Client client) {
        id = client.getId();
        nameClient = client.getNameClient();
        password = client.getPassword();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameClient() {
        return this.nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
