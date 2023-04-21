package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.Usuario_has_rutasModelo;

import java.util.List;
import java.util.Map;

public interface Usuario_has_rutasInterface {

    //Metodo listar rutas favoritas para un usuario
    public List<Map<String, Object>> listarRutasFavoritas(String correoUsuario);



    //Metodo agregar rutas favoritas para un usuario
    public int agregarRutaFavorita(Usuario_has_rutasModelo ruta);



    //Metodo eliminar rutas favoritas para un usuario
    public String eliminarRutaFavorita(Usuario_has_rutasModelo ruta);


}
