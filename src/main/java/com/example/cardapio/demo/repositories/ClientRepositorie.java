package com.example.cardapio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardapio.demo.entities.Client;

public interface ClientRepositorie extends JpaRepository<Client, Long> {
    
} 
