package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ParadaModelo {

    //Atributos
    @Id
    private int idParadas;

    private String nombrePara;
    private String direccionPara;
    private float longitud;
    private float latitud;
    private String imgParada;



    //Constructores
    public ParadaModelo() {
    }

    public ParadaModelo(int idParadas, String nombrePara, String direccionPara, float longitud, float latitud, String imgParada) {
        this.idParadas = idParadas;
        this.nombrePara = nombrePara;
        this.direccionPara = direccionPara;
        this.longitud = longitud;
        this.latitud = latitud;
        this.imgParada = imgParada;
    }



    //Getters
    public int getIdParadas() {
        return idParadas;
    }

    public String getNombrePara() {
        return nombrePara;
    }

    public String getDireccionPara() {
        return direccionPara;
    }

    public float getLongitud() {
        return longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public String getImgParada() {
        return imgParada;
    }



    //Setters
    public void setIdParadas(int idParadas) {
        this.idParadas = idParadas;
    }

    public void setNombrePara(String nombrePara) {
        this.nombrePara = nombrePara;
    }

    public void setDireccionPara(String direccionPara) {
        this.direccionPara = direccionPara;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public void setImgParada(String imgParada) {
        this.imgParada = imgParada;
    }

}
