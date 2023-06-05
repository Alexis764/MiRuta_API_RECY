package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.ParadaModelo;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ParadaInterface extends CrudRepository<ParadaModelo,Integer> {
    //ArrayList<ParadaModelo> findByrol(Integer prioridad);
    //  public abstract ArrayList<ParadaModelo> findByrol(Integer prioridad);
}
