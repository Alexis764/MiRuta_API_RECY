package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "marcador")
public class MarcadorModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idMarcador;
    @Column(nullable = false,length = 45)
    private String nombreMarcador;
    @Column(nullable = false, length = 20)
    private float Latitud;
    @Column(nullable = false, length = 20)
    private float longitud;

    //Contructores
    public MarcadorModelo() {
    }

    public MarcadorModelo(int idMarcador, String nombreMarcador, int latitud, int longitud) {
        this.idMarcador = idMarcador;
        this.nombreMarcador = nombreMarcador;
        Latitud = latitud;
        this.longitud = longitud;
    }

    //Getters
    public int getIdMarcador() {
        return idMarcador;
    }

    public String getNombreMarcador() {
        return nombreMarcador;
    }

    public float getLatitud() {
        return Latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    //Setters

    public void setIdMarcador(int idMarcador) {
        this.idMarcador = idMarcador;
    }

    public void setNombreMarcador(String nombreMarcador) {
        this.nombreMarcador = nombreMarcador;
    }

    public void setLatitud(int latitud) {
        Latitud = latitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}