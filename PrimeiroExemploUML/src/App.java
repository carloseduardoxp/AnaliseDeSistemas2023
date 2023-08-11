import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Disciplina analise = 
        
        new Disciplina(1,
        "Análise de Sistemas", 
        66, 
        "ementa ",
        "bibliografia",
        null);

        List<Disciplina> preRequisitos = new ArrayList<>();

        preRequisitos.add(analise);

        Disciplina projeto = 
        
        new Disciplina(2,
        "Projeto Web MVC e SQL", 
        80, 
        "ementa1",
        "bibliografia1",
        preRequisitos);
    }
}
