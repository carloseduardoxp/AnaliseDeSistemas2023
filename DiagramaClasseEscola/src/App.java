import java.util.Arrays;

import domain.Aluno;
import domain.Avaliacao;
import domain.Curso;
import domain.Disciplina;
import domain.Pessoa;
import domain.Professor;
import domain.SituacaoAluno;
import domain.Titulacao;
import domain.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Carlos Eduardo","Rua teste","349855844");

        System.out.println(pessoa);

        Professor professor = new Professor(pessoa.getNome(),pessoa.getEndereco(),pessoa.getTelefone(),Titulacao.MESTRE);

        System.out.println(professor);

        Curso curso = new Curso(1,"Análise e Desenvolvimento de Sistemas",professor);
        curso.setProfessoresAlocados(Arrays.asList(professor));
        System.out.println(curso);
        
        Aluno aluno = new Aluno("Elvisley","Rua teste1","3455454","234243-1",SituacaoAluno.MATRICULADO,curso);
        System.out.println(aluno);

        Disciplina logica = new Disciplina(2,"Lógica de Programação",100,"ementa","bibliografia",curso);
        Disciplina web = new Disciplina(3,"Programação Web",100,"ementa","bibliografia",curso);

        Disciplina disciplina = new Disciplina(1,"Análise de Sistemas",66,"ementa","bibliografia",curso);
        disciplina.setPreRequisitos(Arrays.asList(logica,web));
        System.out.println(disciplina);

        Turma turma = new Turma(2023,2,1,"7:30 até 9:10",disciplina,professor);

        System.out.println(turma);

        Avaliacao avaliacao = new Avaliacao(aluno, turma, 10d, 20d, 100d, 75d);
        System.out.println(avaliacao);
    }
}
