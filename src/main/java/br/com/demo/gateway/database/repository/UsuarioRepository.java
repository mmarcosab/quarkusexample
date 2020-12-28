package br.com.demo.gateway.database.repository;

import br.com.demo.gateway.database.data.UsuarioData;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<UsuarioData> {

}
