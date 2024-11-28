package com.senai.aula01_classe_atributo_metodos.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Masazo Yoshimoto", 60 , "Grajau", "São Paulo" ,434845130 );



        Pessoa pessoa1 = new Pessoa("Daniel", 20, endereco1);
        Pessoa pessoa2 = new Pessoa(
                "Daniel",
                15,
                new Endereco(
                        "Masazo Yoshimoto",
                        33,
                        "São Paulo",
                        "São Paulo",
                        4848939

                )
        );
        Pessoa pessoa3 = new Pessoa("ning", 22, new Endereco("Masazo", 33, "Reimberg", "São Paulo" , 388383));

        System.out.println(pessoa1);
        System.out.println(pessoa1.endereco.rua);

        pessoa1.falar();

        Pessoa[] pessoas = new Pessoa[3];
        pessoas [0] = pessoa1;
        pessoas [1] = pessoa2;
        pessoas [2] = pessoa3;

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
        ArrayList pessoasList = new ArrayList<>();
        pessoasList.add(pessoa1);
        pessoasList.add(pessoa2);
        pessoasList.add(pessoa3);
        pessoasList.add(new Pessoa("Gabi", 21,endereco1));
        pessoasList.add("Teste");
        pessoasList.add(12);
        pessoasList.add(true);

        System.out.println(pessoasList.get(5));
        pessoasList.remove(5);
        System.out.println(pessoasList.get(5));
        System.out.println(pessoasList.indexOf("teste"));
        pessoasList.trimToSize();

    }
}