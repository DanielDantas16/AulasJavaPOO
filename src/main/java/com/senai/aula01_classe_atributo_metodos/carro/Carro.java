package com.senai.aula01_classe_atributo_metodos.carro;

public class Carro {
        String marca;
        String modelo;
        String cor;
        int anoFabricacao;
        double motor;
        byte portas;
        double precoBase;


        public void verificarInformacoes(){
            System.out.println("marca = " + marca);
            System.out.println("modelo = " + modelo);
            System.out.println("cor= " + cor);
            System.out.println("anoFabricação = " + anoFabricacao);
            System.out.println("motor = " + motor);
            System.out.println("portas = " + portas);
        }

    public void ligar() {
        System.out.println("Vrum");

    }
    public  void testarSom(){
        System.out.println("Som ligado");
    }
    public void buzinar(){
        System.out.println("Bibiii");
    }
    public void consultarPreco(int anoAtual){
            int idadeDoCarro = anoAtual - anoFabricacao;
            double precoAtual=precoBase;

        for (int i = 0; i < idadeDoCarro; i++) {
            precoAtual -= (precoAtual*0.05);
        }
        System.out.println("O valor atual do carro sera de: " + precoAtual);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motor=" + motor +
                ", portas=" + portas +
                ", precoBase=" + precoBase +
                '}';
    }
}
