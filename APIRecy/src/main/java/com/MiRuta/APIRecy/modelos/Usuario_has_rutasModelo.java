package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario_has_rutasModelo {

    //Atributos
    @Id
    private String correoUsuario;

    private int idRuta;



    //Constructores
    public Usuario_has_rutasModelo() {
    }

    public Usuario_has_rutasModelo(String correoUsuario, int idRuta) {
        this.correoUsuario = correoUsuario;
        this.idRuta = idRuta;
    }



    //Getters
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public int getIdRuta() {
        return idRuta;
    }



    //Setters
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
}
