package br.com.unicesumar.aep21.cadastro;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class Fisica extends Pessoa {

    private String cpf;
    private String rg;


    public Fisica(String nome, String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public Fisica(UUID id, String nome, String cpf, String rg) {
        super(id, nome);
        this.cpf = cpf;
        this.rg = rg;
    }


    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
}
