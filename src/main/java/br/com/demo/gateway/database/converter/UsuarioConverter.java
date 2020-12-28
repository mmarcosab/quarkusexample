package br.com.demo.gateway.database.converter;

import br.com.demo.entity.Usuario;
import br.com.demo.gateway.database.data.UsuarioData;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioConverter {

    public UsuarioData convert(Usuario usuario){

        UsuarioData data = new UsuarioData();
        data.setCpf(usuario.getCpf());
        data.setNome(usuario.getNome());
        data.setPassword(usuario.getPassword());
        data.setUsername(usuario.getUsername());

        return data;

    }

}
