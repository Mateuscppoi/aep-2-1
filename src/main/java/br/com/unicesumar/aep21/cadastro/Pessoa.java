package br.com.unicesumar.aep21.cadastro;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Pessoa {

    private String nome;
    private UUID id;


    public Pessoa(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID();
    }

    public Pessoa(UUID id, String nome) {
        this.nome = nome;
        this.id = id;
    }

}
