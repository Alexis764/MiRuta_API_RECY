package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idUsu;

    @Column(nullable = false, length = 45)
    private String correoUsu;

    @Column(nullable = false, length = 45)
    private String contrasenaUsu;

    @Column(nullable = false, length = 45)
    private String nombreUsu;

    @Column(nullable = false, length = 45)
    private String fotoUsu;
    
    @Column(nullable = false, length = 2)
    private int rol;
<<<<<<< HEAD
=======

    //Constructor


    public UsuarioModelo() {
    }
    public UsuarioModelo(int idUsu, String correoUsu, String contrasenaUsu, String nombreUsu, String fotoUsu, int rol) {
        this.idUsu = idUsu;
        this.correoUsu = correoUsu;
        this.contrasenaUsu = contrasenaUsu;
        this.nombreUsu = nombreUsu;
        this.fotoUsu = fotoUsu;
        this.rol = rol;
    }

    //Getter

    public int getIdUsu() {
        return idUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public String getContrasenaUsu() {
        return contrasenaUsu;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public String getFotoUsu() {
        return fotoUsu;
    }

    public int getRol() {
        return rol;
    }

    //Setter

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public void setContrasenaUsu(String contrasenaUsu) {
        this.contrasenaUsu = contrasenaUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public void setFotoUsu(String fotoUsu) {
        this.fotoUsu = fotoUsu;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
>>>>>>> main
}
