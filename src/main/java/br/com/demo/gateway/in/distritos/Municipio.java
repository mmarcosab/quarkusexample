package br.com.demo.gateway.in.distritos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Municipio {

    @JsonbProperty(value = "id")
    private int id;

    @JsonbProperty(value = "nome")
    private String nome;

    @JsonbProperty(value = "microrregiao")
    private Microrregiao microRegiao;

    @JsonbProperty(value = "regiao-imediata")
    private RegiaoImediata regiaoImediata;

}
