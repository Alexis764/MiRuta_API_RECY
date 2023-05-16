package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "puntosGiro")
public class PuntoGiroModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idPuntoGiro;
    @Column(nullable = false, length = 20)
    private float latitud;
    @Column(nullable = false, length = 20)
    private float longitud;

    //Contructores
    public PuntoGiroModelo() {
    }

    public PuntoGiroModelo(int idMarcador, int latitud, int longitud) {
        this.idPuntoGiro = idMarcador;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    //Getters
    public int getIdPuntoGiro() {
        return idPuntoGiro;
    }
    public float getLatitud() {
        return latitud;
    }
    public float getLongitud() {
        return longitud;
    }

    //Setters


    public void setIdPuntoGiro(int idPuntoGiro) {
        this.idPuntoGiro = idPuntoGiro;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}