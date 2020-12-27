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
public class Microrregiao {

    @JsonbProperty(value = "id")
    private int id;

    @JsonbProperty(value = "nome")
    private String nome;

    @JsonbProperty(value = "mesorregiao")
    private Mesorregiao mesorregiao;

}
