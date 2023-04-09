package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Time;

@Entity
public class RutaModelo {

    //Atributos
    @Id
    private int idRuta;

    private String lugarInicio;
    private String lugarFinal;
    private Time horaInicio;
    private Time horaFinal;
    private String marcadorRuta;
    private String diasDisponibles;



    //Constructores
    public RutaModelo() {
    }

    public RutaModelo(int idRuta, String lugarInicio, String lugarFinal, Time horaInicio, Time horaFinal, String marcadorRuta, String diasDisponibles) {
        this.idRuta = idRuta;
        this.lugarInicio = lugarInicio;
        this.lugarFinal = lugarFinal;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.marcadorRuta = marcadorRuta;
        this.diasDisponibles = diasDisponibles;
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

    public String getMarcadorRuta() {
        return marcadorRuta;
    }

    public String getDiasDisponibles() {
        return diasDisponibles;
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

    public void setMarcadorRuta(String marcadorRuta) {
        this.marcadorRuta = marcadorRuta;
    }

    public void setDiasDisponibles(String diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

}
