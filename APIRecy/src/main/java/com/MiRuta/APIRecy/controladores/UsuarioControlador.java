package com.MiRuta.APIRecy.controladores;
import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import com.MiRuta.APIRecy.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Usuario")
@CrossOrigin(origins = "*", maxAge = 360)
public class UsuarioControlador {

    @Autowired
    UsuarioServicio servicio;

    public UsuarioControlador(UsuarioServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/ListaUsuarios")
    public ArrayList<UsuarioModelo> ListaUsuarios() {
        return servicio.ListarServicio();

    }

    @PostMapping("/AgregarUsuario")
    public String AgregarUsuario(@RequestBody UsuarioModelo usuario) {
        return servicio.AgregarUsuario(usuario);
    }

    @DeleteMapping("/EliminarUsuario/{correoUsu}")
    public String EliminarUsuario(@PathVariable("correoUsu")int correoUsu) {
        return servicio.EliminarUsuario(correoUsu);
    }






}

