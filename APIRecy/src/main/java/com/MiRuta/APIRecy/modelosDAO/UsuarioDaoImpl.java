package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import com.MiRuta.APIRecy.modelosDAO.UsuarioDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<UsuarioModelo> listarUsuario() {
        return null;
    }

}
