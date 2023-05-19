package com.MiRuta.APIRecy.interfaces;

import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UsuarioInterface extends CrudRepository<UsuarioModelo,Integer> {

}
