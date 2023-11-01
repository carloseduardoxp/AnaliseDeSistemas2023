import java.util.Arrays;

import domain.exemplo2.Cliente;
import domain.exemplo2.ItemPedido;
import domain.exemplo2.Pedido;
import domain.exemplo2.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Produto produto = new Produto(1000d);
        Produto produto2 = new Produto(500d);

        Cliente cliente = new Cliente(5d);
        Cliente cliente2 = new Cliente(0d);

        ItemPedido itemPedido = new ItemPedido(produto,3);
        ItemPedido itemPedido2 = new ItemPedido(produto2,2);

        Pedido pedido = new Pedido(Arrays.asList(itemPedido,itemPedido2), cliente);
        Pedido pedido2 = new Pedido(Arrays.asList(itemPedido2), cliente2);

        System.out.println(pedido.calcularPreco());
        System.out.println(pedido2.calcularPreco());

    }
}
