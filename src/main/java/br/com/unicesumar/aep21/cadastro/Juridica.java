package br.com.unicesumar.aep21.cadastro;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public class Juridica extends Pessoa {
    private String cnpj;
    private double capitalSocial;
    private Set<CotaSociedade> cotasSociedade = new HashSet<>();

    public Juridica(String nome, String cnpj, double capitalSocial) {
        super(nome);
        this.capitalSocial = capitalSocial;
        this.cnpj = cnpj;
    }

    public Juridica(UUID id, String nome, String cnpj, double capitalSocial) {
        super(id, nome);
        this.capitalSocial = capitalSocial;
        this.cnpj = cnpj;
    }

    public void adicionarSocio(Pessoa socio, double percentualDeParticipacao) {

        if (socio.getId() != this.getId()) {

            cotasSociedade.add(new CotaSociedade(socio, percentualDeParticipacao));
        } else {

            System.out.println("Não pode ser sócio");
        }
    }

    public void removerSocio(Pessoa socio) {

        boolean éSócio = false;
        for (CotaSociedade cota : cotasSociedade) {

            if(cota.socio == socio) {

                cotasSociedade.remove(cota);
                éSócio = true;
            }
        }
        if (!éSócio) {
            System.out.println(socio.getNome() + " não é sócio");
        }

    }


    private class CotaSociedade{

        private double percentualDeParticipacao;
        private Pessoa socio;

        public CotaSociedade(Pessoa socio, double percentualDEPArticipacao) {

            this.percentualDeParticipacao = percentualDEPArticipacao;
            this.socio = socio;
        }
    }
}
