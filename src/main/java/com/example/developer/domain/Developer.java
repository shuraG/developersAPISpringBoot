package com.example.developer.domain;

import javax.persistence.*;

import java.util.List;

@Entity
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private long codigo;

    @Column(name="nombres_completos")
    private String nombresCompletos;

    @Column(name="link_github")
    private String linkGithub;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "developer")
    private List<TecnologiaConocida> tecnologias;


    public Developer(){

    }

    public long getCodigo(){
        return this.codigo;
    };

    public void setCodigo(long codigo){
         this.codigo = codigo;
    };    

    public String getnombresCompletos(){
        return this.nombresCompletos;
    };

    public void setnombresCompletos(String nombresCompletos){
         this.nombresCompletos = nombresCompletos;
    };

    public String getLinkGithub(){
        return this.linkGithub;
    };

    public void setLinkGithub(String linkGithub){
         this.linkGithub = linkGithub;
    };

    public List<TecnologiaConocida> getTecnologias() {
        return this.tecnologias;
    }

    public void setTecnologias(List<TecnologiaConocida> tecnologias) {
        for(TecnologiaConocida t : tecnologias){
			t.setDeveloper(this);
		}
        this.tecnologias = tecnologias;
    }

}