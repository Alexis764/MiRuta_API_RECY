package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioDao extends CrudRepository<UsuarioModelo, Integer> {}
