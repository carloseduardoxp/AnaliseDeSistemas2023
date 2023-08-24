package domain;

import java.util.List;

public class Disciplina {

    private Integer codigo;

    private String descricao;

    private Integer cargaHoraria;

    private String ementa;

    private String bibliografia;

    private Curso curso;

    private List<Disciplina> preRequisitos;

    private List<Turma> turmas;

    public Disciplina(Integer codigo, String descricao, Integer cargaHoraria, String ementa, String bibliografia,
            Curso curso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
        this.curso = curso;
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

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(List<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Disciplina [codigo=" + codigo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria
                + ", ementa=" + ementa + ", bibliografia=" + bibliografia + ", curso=" + curso + ", preRequisitos="
                + preRequisitos + ", turmas=" + turmas + "]";
    }

    

}
