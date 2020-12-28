package br.com.demo.controller;

import br.com.demo.gateway.database.data.UsuarioData;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuarioController {

    @POST
    @Transactional   //retirar essa camada daqui
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(UsuarioData usuario){  //retirar essa camada daqui tambem
        UsuarioData.persist(usuario);
    }

}
