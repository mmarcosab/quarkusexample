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
public class RegiaoIntermediaria {

    @JsonbProperty(value = "id")
    private int id;

    @JsonbProperty(value = "nome")
    private String nome;

    @JsonbProperty(value = "UF")
    private String uf;

}
