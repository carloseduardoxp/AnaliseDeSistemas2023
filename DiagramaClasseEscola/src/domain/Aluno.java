package domain;

import java.util.List;

public class Aluno extends Pessoa {

    private String matricula;

    private SituacaoAluno situacaoAluno;

    private Curso curso;

    private List<Avaliacao> avaliacoes;

    public Aluno(String nome, String endereco, String telefone, String matricula, SituacaoAluno situacaoAluno,Curso curso) {
        super(nome, endereco, telefone);
        this.matricula = matricula;
        this.situacaoAluno = situacaoAluno;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public SituacaoAluno getSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(SituacaoAluno situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", situacaoAluno=" + situacaoAluno + ", curso=" + curso + "]";
    }



    public Curso getCurso() {
        return curso;
    }



    public void setCurso(Curso curso) {
        this.curso = curso;
    }



    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }



    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    

    
    
}
