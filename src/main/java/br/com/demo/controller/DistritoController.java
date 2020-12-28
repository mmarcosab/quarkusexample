package br.com.demo.controller;

import br.com.demo.gateway.in.distritos.Distrito;
import br.com.demo.service.DistritoService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/distritos")
public class DistritoController {

    @Inject
    @RestClient
    private DistritoService distritoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Distrito> distritos(){
        return distritoService.listar();
    }

}
