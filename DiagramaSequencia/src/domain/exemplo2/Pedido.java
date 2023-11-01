package domain.exemplo2;

import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;

    private Cliente cliente;

    public Pedido(List<ItemPedido> itens, Cliente cliente) {
        this.itens = itens;
        this.cliente = cliente;
    }    

    public Double calcularPreco() {
        Double valorFinal = 0.0;
        for (ItemPedido item: itens) {
            valorFinal += item.calcularPreco();
        }
        return cliente.obterValorComDesconto(valorFinal);
    }
  
    
}
