package com.example.developer.domain;

import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TecnologiaConocida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private long codigo;

    @Column(name="nombre")
    private String nombre;

    @ManyToOne 
    @JoinColumn(name = "codigo_developer")
    private Developer developer;

    public TecnologiaConocida(){
    }

    public long getCodigo(){
        return this.codigo;
    };

    public void setCodigo(long codigo){
         this.codigo = codigo;
    };    

    public String getNombre(){
        return this.nombre;
    };

    public void setNombre(String nombre){
         this.nombre = nombre;
    };
    
    public Developer getDeveloper(){
        return this.developer;
    };

    public void setDeveloper(Developer developer){
         this.developer = developer;
    };
}