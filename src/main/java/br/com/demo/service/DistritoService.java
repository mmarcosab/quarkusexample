package br.com.demo.service;


import br.com.demo.entity.Distrito;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(configKey = "distritos-api")    //informa ao framework que esse servico pode ser injetado
@Path("/distritos")    //recurso a ser acessado dentro da api
public interface DistritoService {   //Essa interface será usada para fazer as requisicoes em uma api externa

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Distrito> listar();

}
