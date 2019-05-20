package br.com.unicesumar.aep21.cadastro;

public class Main {

    public static void main(String[] args) {
        Fisica pessoa1 = new Fisica("Mateus", "12345678910", "123456789123");

        System.out.println (pessoa1.toString());

        Juridica pessoaJur1 = new Juridica("Bruce Wayne", "4645434365746", 500);
        Juridica pessoaJur2 = new Juridica("Tony Stark", "64654344704", 100000);

        Fisica pessoa2 = new Fisica("Don Falcone", "324465452", "876543245");
        Fisica pessoa3 = new Fisica("Martin Luther King", "654376543333", "212256543569");

        pessoaJur1.adicionarSocio(pessoa1, 50);

        pessoaJur1.adicionarSocio(pessoa2, 20);

        pessoaJur1.adicionarSocio(pessoaJur2, 21);

        pessoaJur1.adicionarSocio(pessoaJur1, 90);

        pessoaJur1.removerSocio(pessoa3);
    }
}
