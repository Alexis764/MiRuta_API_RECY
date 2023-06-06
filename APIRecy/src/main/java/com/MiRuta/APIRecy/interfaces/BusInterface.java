package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.BusModelo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BusInterface extends CrudRepository<BusModelo,String> {
    //Optional<BusModelo> findById(Long id);

    //Optional<BusModelo> findByPlacaBus(String placaBus);
}
