package com.valostats.valostats.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name= "equips")

public class Equip {
    @Id // clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementa
    private Long id;


    //@column se relaciona con el sql
    @Column(name = "Nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "Region", nullable = false, length = 50)
    private String region;

    @Column(name = "Pais", nullable = false, length = 50)
    private String pais;

    @Column( name = "Org", nullable = false, length = 50)
    private String org;

    //@OneToMany porque un equipo puede tener muchos jugadores
    @OneToMany (mappedBy = "equip", cascade = CascadeType.ALL)
    private List<Jugador> jugadors;
    public Equip(){}

    public Equip(String nom,String region, String pais, String Org){
        this.nom = nom;
        this.region = region;
        this.pais = pais;
        this.org = org;
    }
    //getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getOrg() { return org; }
    public void setOrg(String org) { this.org = org; }

    public List<Jugador> getJugadors() { return jugadors; }
    public void setJugadors(List<Jugador> jugadors) { this.jugadors = jugadors; }


}
