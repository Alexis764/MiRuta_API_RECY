package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.interfaces.ParadaInterface;

import com.MiRuta.APIRecy.modelos.ParadaModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface ParadaDao extends CrudRepository<ParadaModelo,Integer>{}
