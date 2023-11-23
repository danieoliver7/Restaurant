package com.example.cardapio.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> descr;
    private Double price;



    public Resume() {
    }



    public Resume(Long id, String namePrato, List<String> descr, Double price) {
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

    public List<String> getDescr() {
        return this.descr;
    }

    public void setDescr(List<String> descr) {
        this.descr = descr;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

}
