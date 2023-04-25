package com.MiRuta.APIRecy.interfaces;

import java.util.List;
import java.util.Map;

public interface RutaInterface {

    //Metodo listar todas las rutas
    public List<Map<String, Object>> listarRutas(String correoUsuario);

}
