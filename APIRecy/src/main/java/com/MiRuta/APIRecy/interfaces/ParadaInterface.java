package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.ParadaModelo;
import org.springframework.data.repository.CrudRepository;

public interface ParadaInterface extends CrudRepository<ParadaModelo,Integer> {
    //  public abstract ArrayList<ParadaModelo> findByrol(Integer prioridad);
}
