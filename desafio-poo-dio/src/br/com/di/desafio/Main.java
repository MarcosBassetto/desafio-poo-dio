package br.com.di.desafio;

import br.com.di.desafio.dominio.Conteudo;
import br.com.di.desafio.dominio.Curso;
import br.com.di.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("");
        mentoria.setDescricao("");
        mentoria.setData(LocalDate.parse("2024-12-15"));

        System.out.println(mentoria);

    }
}