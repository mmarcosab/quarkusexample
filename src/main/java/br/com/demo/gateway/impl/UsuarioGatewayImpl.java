package br.com.demo.gateway.impl;

import br.com.demo.entity.Usuario;
import br.com.demo.gateway.UsuarioGateway;
import br.com.demo.gateway.database.converter.UsuarioConverter;
import br.com.demo.gateway.database.repository.UsuarioRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class UsuarioGatewayImpl implements UsuarioGateway {

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    UsuarioConverter usuarioConverter;

    @Transactional
    @Override
    public void save(Usuario usuario){
        usuarioRepository.persist(usuarioConverter.convert(usuario));
    }

}
