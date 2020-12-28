package br.com.demo.controller;

import br.com.demo.entity.Usuario;
import br.com.demo.gateway.UsuarioGateway;
import br.com.demo.gateway.database.converter.UsuarioConverter;
import br.com.demo.gateway.database.repository.UsuarioRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuarioController {

    @Inject
    private UsuarioGateway usuarioGateway;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuario usuario){
        usuarioGateway.save(usuario);
    }

}
