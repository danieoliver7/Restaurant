package com.example.cardapio.demo.dto;

import com.example.cardapio.demo.entities.Resume;

public class ResumeDto {
    
    
    private Long id;
    private String namePrato;
    private String descr;
    private double price;


    public ResumeDto() {
    }


    public ResumeDto(Resume entity) {
        id = entity.getId();
        namePrato = entity.getNamePrato();
        descr = entity.getDescr();
        price = entity.getPrice();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePrato() {
        return this.namePrato;
    }

    public void setNamePrato(String namePrato) {
        this.namePrato = namePrato;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
