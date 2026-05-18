package com.valostats.valostats.model;
import jakarta.persistence.*;

@Entity
@Table(name = "stats")

public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Kills", nullable = false)
    private int kills;

    @Column (name = "Deaths", nullable = false)
    private int deaths;

    @Column (name = "Assists", nullable = false)
    private int assists;

    @Column (name = "Rondas", nullable = false)
    private int rondas;

    @Column (name = "K:D", nullable = false)
    private double kd;

    @Column (name = "Hs%", nullable = false)
    private double hsPorcentaje;

    @Column (name = "Rating", nullable = false)
    private double rating;

    @Column (name = "torneo", nullable = false, length = 100)
    private String torneo;

    @OneToOne
    @JoinColumn (name = "jugador_id", nullable = false)
    private Jugador jugador;

    public Stats(){}

    public Stats(int kills, int deaths, int assists, int rondas, double kd,double hsPorcentaje, double rating, String torneo, Jugador jugador){
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.rondas = rondas;
        this.kd = kd;
        this.hsPorcentaje = hsPorcentaje;
        this.rating = rating;
        this.torneo = torneo;
        this.jugador = jugador;
    }

    public Long getId(){ return id; }
    public void setId(Long id) { this.id = id; }

    public int getkills(){ return kills; }
    public void setkills(int kills){ this.kills = kills; }

    public int getDeaths() { return deaths; }
    public void setDeaths(int deaths){ this.deaths = deaths; }

    public int getAssists() { return assists; }
    public void setAssists(int assists) { this.assists = assists; }

    public int getRondas() { return rondas; }
    public void setRondas(int rondas) { this.rondas = rondas; }

    public double getKd() { return kd; }
    public void setKd(double kd) { this.kd = kd; }

    public double getHsPorcentaje() { return hsPorcentaje; }
    public void setHsPorcentaje(double hsPorcentaje) { this.hsPorcentaje = hsPorcentaje; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String getTorneo() { return torneo; }
    public void setTorneo(String torneo) { this.torneo = torneo; }

    public Jugador getJugador() { return jugador; }
    public void setJugador(Jugador jugador) { this.jugador = jugador; }
}
