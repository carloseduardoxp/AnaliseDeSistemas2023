package domain.exemplo2;

public class Cliente {

    private Double percentualDesconto;

    public Cliente(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Double obterValorComDesconto(Double valorPedido) {
        double desconto = percentualDesconto / 100d;
        return valorPedido - (valorPedido * desconto);
    }



}
