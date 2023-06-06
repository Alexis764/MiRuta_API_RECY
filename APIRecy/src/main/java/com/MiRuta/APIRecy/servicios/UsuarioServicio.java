package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.UsuarioInterface;
import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServicio implements UsuarioInterface {

    UsuarioInterface repository;

    public UsuarioServicio(UsuarioInterface repository) {
        this.repository = repository;
    }

    public ArrayList<UsuarioModelo> ListarServicio(){
        return (ArrayList<UsuarioModelo>) repository.findAll();
    }

    public String AgregarUsuario(UsuarioModelo usuario){
        var respuesta = "{'respuesta' : 'No se pudo eliminar usuario'}";
        if (!repository.existsById(usuario.getCorreoUsu()))
            repository.save(usuario);
            respuesta = "{'respuesta' : 'Se agrego un usuario'}";
        return respuesta;
    }

    public String EliminarUsuario(String correoUsu) {
        var respuesta = "{'respuesta' : 'No se pudo eliminar usuario'}";
        if (repository.existsById(correoUsu)){
            repository.deleteById(correoUsu);
            respuesta = "{'respuesta' : 'Eliminado exitosamente'}";
        }
        return respuesta;
    }


    @Override
    public <S extends UsuarioModelo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioModelo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UsuarioModelo> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<UsuarioModelo> findAll() {
        return null;
    }

    @Override
    public Iterable<UsuarioModelo> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(UsuarioModelo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsuarioModelo> entities) {

    }

    @Override
    public void deleteAll() {

    }
}