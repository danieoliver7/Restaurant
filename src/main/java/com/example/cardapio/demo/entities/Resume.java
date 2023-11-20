package com.example.cardapio.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resumes")
public class Resume {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_prato")
    private String namePrato;
    private String descr;
    private Double price;



    public Resume() {
    }



    public Resume(Long id, String namePrato, String descr, Double price) {
        this.id = id;
        this.namePrato = namePrato;
        this.descr = descr;
        this.price = price;
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
