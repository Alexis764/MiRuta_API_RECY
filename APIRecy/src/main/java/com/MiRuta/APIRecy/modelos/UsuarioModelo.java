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
    @Column(unique = true, length = 45)
    private String correoUsu;

    @Column(nullable = false, length = 45)
    private String contrasenaUsu;

    @Column(nullable = false, length = 45)
    private String nombreUsu;

    @Column(nullable = false, length = 45)
    private String fotoUsu;
    
    @Column(nullable = false, length = 2)
    private int rol;

}
