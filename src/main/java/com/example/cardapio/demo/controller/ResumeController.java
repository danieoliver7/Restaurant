package com.example.cardapio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.demo.dto.ResumeDto;
import com.example.cardapio.demo.entities.Resume;
import com.example.cardapio.demo.repositories.ResumeRepositorie;
import com.example.cardapio.demo.service.ResumeService;

@RestController
@RequestMapping(value = "/resume")
public class ResumeController {
    
    @Autowired
    private ResumeService resumeService;

   


    @GetMapping
    public List<ResumeDto> findAll(){
        List<ResumeDto> res = resumeService.findall();
        return res;
    }

    @PostMapping
    public void save(@RequestBody Resume resume){
        if(resume != null){
        resumeService.create(resume);
        }else{
            ResponseEntity.status(HttpStatus.BAD_REQUEST);
        }
    }
}
