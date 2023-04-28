package com.MiRuta.APIRecy.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Paradas_has_Rutas")
public class Paradas_has_rutasModelo {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Paradas_idParadas", referencedColumnName = "idParadas", nullable = false)
    @JsonIgnore
    private ParadaModelo idParadas;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Rutas_idRuta", referencedColumnName = "idRuta", nullable = false)
    @JsonIgnore
    private RutaModelo idRuta;


    public Paradas_has_rutasModelo(ParadaModelo idParadas, RutaModelo idRuta) {
        this.idParadas = idParadas;
        this.idRuta = idRuta;
    }

    public Paradas_has_rutasModelo  () {

    }

    public ParadaModelo getIdParadas() {
        return idParadas;
    }

    public void setIdParadas(ParadaModelo idParadas) {
        this.idParadas = idParadas;
    }

    public RutaModelo getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(RutaModelo idRuta) {
        this.idRuta = idRuta;
    }
}
