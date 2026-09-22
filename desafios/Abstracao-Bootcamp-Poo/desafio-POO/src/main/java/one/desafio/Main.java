package one.desafio;

import one.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Developer");
        curso1.setDescricao("Curso completo de Java ");
        curso1.setCargaHoraria(71);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso React");
        curso2.setDescricao("Curso completo de React ");
        curso2.setCargaHoraria(41);

        Conteudo conteudo = new Curso();


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Carreira Internacional");
        mentoria1.setDescricao("Mentoria focado EM carreiras");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo sobre java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Eduardo:" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("Conteudos Concluidos Eduardo:" + devEduardo.getConteudosInscritos());
        System.out.println("XP:" + devEduardo.calcularXp());

        System.out.println("-------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Paulo:" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("Conteudos Concluidos Paulo:" + devPaulo.getConteudosInscritos());
        System.out.println("XP:" + devPaulo.calcularXp());



    }
}
