package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.BusModelo;
import org.springframework.data.repository.CrudRepository;

public interface BusInterface extends CrudRepository<BusModelo,String> {
}
