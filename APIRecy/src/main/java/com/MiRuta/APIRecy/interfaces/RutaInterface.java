package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.RutaModelo;
import org.springframework.data.repository.CrudRepository;

public interface RutaInterface extends CrudRepository<RutaModelo,Integer> {

    /*
    //Metodo listar todas las rutas
    public List<Map<String, Object>> listarRutas(String correoUsuario);
     */
}
