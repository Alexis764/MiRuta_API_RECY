package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus")
public class BusModelo {

    @Id
    @Column(unique = true, length = 10)
    private String placaBus;

    public BusModelo(String placaBus) {
        this.placaBus = placaBus;
    }

    public BusModelo () {

    }

    public String getPlacaBus() {
        return placaBus;
    }

    public void setPlacaBus(String placaBus) {
        this.placaBus = placaBus;
    }
}
