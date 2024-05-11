import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Cursos curso1 = new Cursos();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Cursos curso2 = new Cursos();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentorias mentoria = new Mentorias();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    /*
     * System.out.println(curso1);
     * System.out.println(curso2);
     * System.out.println(mentoria);
     */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Devseloper");
    bootcamp.setDescricao("Descrição Bootcamp Java Devseloper");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    System.out.println("-------");

    Devs devJoao = new Devs();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularTotalXP());
  }
}
