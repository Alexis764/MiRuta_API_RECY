package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.*;


@Entity
@Table(name = "ruta")
public class RutaModelo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idRuta;

    @Column(nullable = false, length = 45)
    private String lugarInicio;

    @Column(nullable = false, length = 45)
    private String lugarFinal;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaInicio;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaFinal;



    //Constructores
    public RutaModelo() {
    }

    public RutaModelo(int idRuta, String lugarInicio, String lugarFinal, Time horaInicio, Time horaFinal) {
        this.idRuta = idRuta;
        this.lugarInicio = lugarInicio;
        this.lugarFinal = lugarFinal;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }



    //Getters
    public int getIdRuta() {
        return idRuta;
    }

    public String getLugarInicio() {
        return lugarInicio;
    }

    public String getLugarFinal() {
        return lugarFinal;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }


    //Setters
    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public void setLugarInicio(String lugarInicio) {
        this.lugarInicio = lugarInicio;
    }

    public void setLugarFinal(String lugarFinal) {
        this.lugarFinal = lugarFinal;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }
}
