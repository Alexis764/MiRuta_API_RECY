package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "puntosGiro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PuntoGiroModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idPuntoGiro;
    @Column(nullable = false, length = 20)
    private float latitud;
    @Column(nullable = false, length = 20)
    private float longitud;
}