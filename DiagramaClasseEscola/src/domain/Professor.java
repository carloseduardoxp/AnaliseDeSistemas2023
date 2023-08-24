package domain;

import java.util.List;

public class Professor extends Pessoa {

    private Titulacao titulacaoMaxima;

    private Curso cursoCoordenado;

    private List<Curso> cursosAlocdos;

    private List<Turma> turmas;

    public Professor(String nome, String endereco, String telefone, Titulacao titulacaoMaxima) {
        super(nome, endereco, telefone);
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public Titulacao getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(Titulacao titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    @Override
    public String toString() {
        return super.toString()+" Professor [titulacaoMaxima=" + titulacaoMaxima + "]";
    }

    public List<Curso> getCursosAlocdos() {
        return cursosAlocdos;
    }

    public void setCursosAlocdos(List<Curso> cursosAlocdos) {
        this.cursosAlocdos = cursosAlocdos;
    }



    public Curso getCursoCoordenado() {
        return cursoCoordenado;
    }



    public void setCursoCoordenado(Curso cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }



    public List<Turma> getTurmas() {
        return turmas;
    }



    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    
    
}
