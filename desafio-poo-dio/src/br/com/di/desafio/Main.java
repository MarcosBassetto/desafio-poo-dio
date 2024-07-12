package br.com.di.desafio;

import br.com.di.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println(bootcamp);

        Dev dev = new Dev();
        dev.setNome("Jake");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println("XP dev1 "+dev.calcularTotalXp());
        System.out.println("Conteudos Inscritos dev1: "+dev.getConteudosInscritos());
        System.out.println("Conteudos Concluido dev1: "+dev.getConteudosConcluidos());


        Dev dev2 = new Dev();
        dev2.setNome("Margariada");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("XP dev2 "+dev2.calcularTotalXp());
        System.out.println("Conteudos Inscritos dev2: "+dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluido dev2: "+dev2.getConteudosConcluidos());


    }
}