package br.com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Uf {

    @JsonbProperty(value = "id")
    private int id;

    @JsonbProperty(value = "nome")
    private String nome;

    @JsonbProperty(value = "sigla")
    private String sigla;

    @JsonbProperty(value = "regiao")
    private Regiao regiao;

}
