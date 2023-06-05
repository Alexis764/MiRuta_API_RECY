package com.MiRuta.APIRecy.controladores;

import com.MiRuta.APIRecy.modelos.Usuario_has_rutasModelo;
import com.MiRuta.APIRecy.servicios.Usuario_has_rutasServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Favoritos")
public class Usuario_has_rutasControlador {

    //Objeto para servicio de usuario_has_rutas
    @Autowired
    Usuario_has_rutasServicio usuarioHasRutasServicio;



    //Metodo listar rutas favoritas para un usuario
    @GetMapping("/listar/{correo}")
     public List<Map<String, Object>> listarRutasFavoritasCon(@PathVariable("correo") String correoUsuario) {
        return usuarioHasRutasServicio.listarRutasFavoritas(correoUsuario);
    }



    //Metodo agregar rutas favoritas para un usuario
    @PostMapping("/agregar")
    public String agregarRutaFavoritaCon(@RequestBody Usuario_has_rutasModelo ruta) {
        int respuesta = usuarioHasRutasServicio.agregarRutaFavorita(ruta);

        if (respuesta == 0) {
            return "{'respuesta': 'No se pudo agregar a favoritos'}";

        } else {
            return "{'respuesta': 'Agregada a favoritos'}";
        }
    }



    //Metodo eliminar rutas favoritas para un usuario

}
