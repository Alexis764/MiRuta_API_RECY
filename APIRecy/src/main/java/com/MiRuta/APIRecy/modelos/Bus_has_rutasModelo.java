package com.MiRuta.APIRecy.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
@Table(name = "Bus_has_rutasModelo")
public class Bus_has_rutasModelo {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Bus_placaBus", referencedColumnName = "placaBus", nullable = false)
    @JsonIgnore
    private BusModelo placaBus;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Ruta_idRuta", referencedColumnName = "idRuta", nullable = false)
    @JsonIgnore
    private RutaModelo idRuta;

    public Bus_has_rutasModelo(BusModelo placaBus, RutaModelo idRuta) {
        this.placaBus = placaBus;
        this.idRuta = idRuta;
    }

    public Bus_has_rutasModelo() {

    }

    public BusModelo getPlacaBus() {
        return placaBus;
    }

    public void setPlacaBus(BusModelo placaBus) {
        this.placaBus = placaBus;
    }

    public RutaModelo getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(RutaModelo idRuta) {
        this.idRuta = idRuta;
    }
}
