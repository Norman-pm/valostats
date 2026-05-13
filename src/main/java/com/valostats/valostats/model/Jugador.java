package com.valostats.valostats.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "jugadors")

public class Jugador {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "GameName", nullable = false, length = 100)
    private String gameName;

    @Column(name = "Nacionalitat", nullable = false, length = 30)
    private String nacionalitat;

    @Column (name = "Nom", nullable = false, length = 50)
    private String nomJ;

    // relacion con el equipo
    @ManyToOne
    @JoinColumn(name = "equip_id", nullable = false)
    private Equip equip;

    //relacion con las estadisticas
    @OneToOne (mappedBy = "jugador", cascade = CascadeType.ALL)
    private Stats stats;

    public Jugador() {}

    public Jugador(String gameName, String nacionalitat, String nomJ){
        this.gameName = gameName;
        this.nacionalitat = nacionalitat;
        this.nomJ = nomJ;
    }
    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getgameName() { return gameName; }
    public void setgameName(String gameName) { this.gameName = gameName; }

    public String getnacionalitat() { return nacionalitat; }
    public void setnacionalitat(String nacionalitat) { this.nacionalitat = nacionalitat; }

    public String getnomJ(){ return nomJ; }
    public void setnomJ(String nomJ) { this.nomJ = nomJ; }

    public Equip getEquip() { return equip; }
    public void setEquip(Equip equip) { this.equip = equip; }

    public Stats getestadisticas() { return stats;}
    public void setestadisticas(Stats stats) { this.stats = stats; }





}
