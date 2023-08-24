package domain;

import java.util.List;

public class Curso {

    private Integer codigo;

    private String descricao;

    private Professor coordenador;

    private List<Aluno> alunos;

    private List<Professor> professoresAlocados;

    private List<Disciplina> disciplinas;

    public Curso(Integer codigo, String descricao, Professor coordenador) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.coordenador = coordenador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessoresAlocados() {
        return professoresAlocados;
    }

    public void setProfessoresAlocados(List<Professor> professoresAlocados) {
        this.professoresAlocados = professoresAlocados;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Curso [codigo=" + codigo + ", descricao=" + descricao + ", coordenador=" + coordenador + ", alunos="
                + alunos + ", professoresAlocados=" + professoresAlocados + ", disciplinas=" + disciplinas + "]";
    }

    

}