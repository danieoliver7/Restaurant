package com.example.cardapio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardapio.demo.entities.Resume;

public interface ResumeRepositorie extends JpaRepository<Resume,Long> {
    
}
