import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
           Curso curso1=new Curso();
           curso1.setTitulo("Curso  java");
           curso1.setDescricao("Descrição curso java");
           curso1.setCargaHoraria(8);
           Curso curso2=new Curso();
           curso2.setTitulo("Curso  js");
           curso2.setDescricao("Descrição curso js");
           curso2.setCargaHoraria(4);
           Mentoria mentoria=new Mentoria();
           mentoria.setTitulo("mentoria do java");
           mentoria.setDescricao("descrição da mentoria do java");
           mentoria.setData(LocalDate.now());
            //System.out.println(curso1);
            //  System.out.println(curso2);
           //   System.out.println(mentoria);
        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devCamila=new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de Camila"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de Camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Camila"+devCamila.getConteudosConcluidos());
        System.out.println("XP"+devCamila.calcularTotalxp());
        System.out.println("------");
        Dev devjoao=new Dev();
        devjoao.setNome("João");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de João"+devjoao.getConteudosInscritos());
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de João"+devjoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de João"+devjoao.getConteudosConcluidos());
        System.out.println("XP"+devjoao.calcularTotalxp());
    }
}
