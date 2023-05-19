package com.MiRuta.APIRecy.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "puntoGiro_has_Ruta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class puntoGiro_has_RutasModelo {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "puntoGiro_idMarcador", referencedColumnName = "idPuntoGiro", nullable = false)
    private PuntoGiroModelo idPuntoGiro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Rutas_idRuta", referencedColumnName = "idRuta", nullable = false)
    @JsonIgnore
    private RutaModelo idRuta;

}
