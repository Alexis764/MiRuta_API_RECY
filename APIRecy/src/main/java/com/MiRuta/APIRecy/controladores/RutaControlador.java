package com.MiRuta.APIRecy.controladores;

import com.MiRuta.APIRecy.servicios.RutaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ruta")
public class RutaControlador {

    //Objeto para servicio de ruta
    @Autowired
    RutaServicio rutaServicio;



    //Metodo listar todas las rutas
    @GetMapping("/listar")
    public List<Map<String, Object>> listarRutasCon() {
        return rutaServicio.listarRutas();
    }

}
