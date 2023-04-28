package com.MiRuta.APIRecy.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Usuario_has_rutas")
public class Usuario_has_rutasModelo {

    //Atributos
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Usuario_idUsu", referencedColumnName = "idUsu", nullable = false)
    @JsonIgnore
    private UsuarioModelo idUsu;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Ruta_idRuta", referencedColumnName = "idRuta", nullable = false)
    @JsonIgnore
    private RutaModelo idRuta;



    //Constructores
    public Usuario_has_rutasModelo() {
    }

    public Usuario_has_rutasModelo(UsuarioModelo idUsu, RutaModelo idRuta) {
        this.idUsu = idUsu;
        this.idRuta = idRuta;
    }

    public UsuarioModelo getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(UsuarioModelo idUsu) {
        this.idUsu = idUsu;
    }

    public RutaModelo getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(RutaModelo idRuta) {
        this.idRuta = idRuta;
    }
}
