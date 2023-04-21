package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.Usuario_has_rutasInterface;
import com.MiRuta.APIRecy.modelos.Usuario_has_rutasModelo;
import com.MiRuta.APIRecy.modelosDAO.Usuario_has_rutasDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Usuario_has_rutasServicio implements Usuario_has_rutasInterface {

    //Objeto DAO de usuario_has_rutas
    @Autowired
    Usuario_has_rutasDAO usuarioHasRutaDAO;



    //Metodo listar rutas favoritas para un usuario
    @Override
    public List<Map<String, Object>> listarRutasFavoritas(String correoUsuario) {
        return usuarioHasRutaDAO.listarRutasFavoritas(correoUsuario);
    }



    //Metodo agregar rutas favoritas para un usuario
    @Override
    public int agregarRutaFavorita(Usuario_has_rutasModelo ruta) {
        return usuarioHasRutaDAO.agregarRutaFavorita(ruta);
    }



    //Metodo eliminar rutas favoritas para un usuario
    @Override
    public String eliminarRutaFavorita(Usuario_has_rutasModelo ruta) {
        return null;
    }
}
