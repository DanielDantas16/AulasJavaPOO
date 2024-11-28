package com.senai.aula01_classe_atributo_metodos.carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro ();
        carro1.marca = "Camaro";
        carro1.modelo = "City";
        carro1.cor = "Amarelo";
        carro1.portas = 4;
        carro1.motor = 1.6;
        carro1.precoBase = 10000;
        carro1.anoFabricacao=2013;


        carro1.verificarInformacoes();
        carro1.ligar();
        carro1.buzinar();
        carro1.testarSom();
        carro1.consultarPreco(2024);

        Carro carro2 = new Carro ();
        carro2.marca = "Honda";
        carro2.modelo = "City";
        carro2.cor = "Vermelho";
        carro2.portas = 4;
        carro2.motor = 1.6;
        carro2.precoBase = 9000;
        carro2.anoFabricacao=2013;


        carro2.verificarInformacoes();
        carro2.ligar();
        carro2.buzinar();
        carro2.testarSom();
        carro2.consultarPreco(2024);

        System.out.println(carro1);
        System.out.println(carro2);

        carro1 = carro2;

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.modelo = "Fiat";
        System.out.println(carro2.modelo);

        String texto = "teste";
        System.out.println(texto);

        Carro carro3 = new Carro ();
        carro3.marca = "Honda";
        carro3.modelo = "City";
        carro3.cor = "Vermelho";
        carro3.portas = 4;
        carro3.motor = 1.6;
        carro3.precoBase = 9000;
        carro3.anoFabricacao=2013;


        carro3.verificarInformacoes();
    }
}