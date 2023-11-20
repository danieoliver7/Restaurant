package com.example.cardapio.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cardapio.demo.repositories.ResumeRepositorie;


import com.example.cardapio.demo.dto.ResumeDto;
import com.example.cardapio.demo.entities.Resume;

@Service
public class ResumeService {
    
    @Autowired
    private ResumeRepositorie resumeRepositorie;

    @Transactional(readOnly = true)
    public List<ResumeDto> findall(){
        List<Resume> result = resumeRepositorie.findAll();
        List<ResumeDto> dto = result.stream().map(x -> new ResumeDto(x)).toList();
        return dto;
    }

}
