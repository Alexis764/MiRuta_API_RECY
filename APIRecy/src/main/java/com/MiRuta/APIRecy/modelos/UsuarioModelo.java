package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
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


    public UsuarioModelo(int idUsu, String correoUsu, String contrasenaUsu, String nombreUsu, String fotoUsu) {
        this.idUsu = idUsu;
        this.correoUsu = correoUsu;
        this.contrasenaUsu = contrasenaUsu;
        this.nombreUsu = nombreUsu;
        this.fotoUsu = fotoUsu;
    }

    public UsuarioModelo () {

    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public String getContrasenaUsu() {
        return contrasenaUsu;
    }

    public void setContrasenaUsu(String contrasenaUsu) {
        this.contrasenaUsu = contrasenaUsu;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getFotoUsu() {
        return fotoUsu;
    }

    public void setFotoUsu(String fotoUsu) {
        this.fotoUsu = fotoUsu;
    }
}
