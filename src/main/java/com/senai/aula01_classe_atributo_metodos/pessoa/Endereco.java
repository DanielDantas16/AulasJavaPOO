package com.senai.aula01_classe_atributo_metodos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    int cep;

    public Endereco(String rua, int numero, String bairro, String cidade, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep=" + cep +
                '}';
    }
}