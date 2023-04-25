package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.RutaInterface;
import com.MiRuta.APIRecy.modelosDAO.RutaDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RutaServicio implements RutaInterface {

    //Objeto DAO de ruta
    @Autowired
    RutaDAO rutaDAO;



    //Metodo listar todas las rutas
    @Override
    public List<Map<String, Object>> listarRutas(String correoUsuario) {
        return rutaDAO.listarRutas(correoUsuario);
    }

}
