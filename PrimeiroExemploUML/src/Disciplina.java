import java.util.List;

public class Disciplina {
    private Integer codigo;

    private String descricao;

    private Integer cargaHoraria;

    private String ementa;

    private String bibliografia;

    private List<Disciplina> preRequisitos;

    public Disciplina(Integer codigo,String descricao,Integer cargaHoraria,String ementa,String bibliografia,List<Disciplina> preRequisitos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
        this.preRequisitos = preRequisitos;
    }


}
