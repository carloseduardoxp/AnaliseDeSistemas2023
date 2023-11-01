package domain.exemplo2;

public class Produto {

    private Double preco;

    public Produto(Double preco) {
        this.preco = preco;
    }

    public Double obterPreco(Integer quantidade) {
        return preco * quantidade;
    }

}
