package domain.exemplo2;

public class ItemPedido {

    private Produto produto;

    private Integer quantidade;

    public ItemPedido(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }  

    public Double calcularPreco() {
        return produto.obterPreco(quantidade);
    }



  
}
