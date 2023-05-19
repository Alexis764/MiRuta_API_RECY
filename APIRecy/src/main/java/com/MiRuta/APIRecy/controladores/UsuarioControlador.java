package com.MiRuta.APIRecy.controladores;
import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import com.MiRuta.APIRecy.servicios.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 360)
public class UsuarioControlador {

    UsuarioServicio servicio;

    public UsuarioControlador(UsuarioServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/ListaUsuarios")
    public ArrayList<UsuarioModelo> ListaUsuarios()
    {
        return servicio.Listar();

    }

    @PostMapping("/AgregarUsuario")
    public String AgregarUsuario(@RequestBody UsuarioModelo usuario) {
        return servicio.AgregarUsuario(usuario);
    }

    @DeleteMapping("/EliminarUsuario/{id}")
    public String EliminarUsuario(@PathVariable("id")int idUsu) {
        return servicio.EliminarUsuario(idUsu);
    }




}

