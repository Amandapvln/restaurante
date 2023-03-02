import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Pedido> pedidos;

    public Cardapio() {
        pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Lasanha", 25.50));
        pedidos.add(new Pedido("Pizza", 30.00));
        pedidos.add(new Pedido("Hamburguer", 20.00));
        pedidos.add(new Pedido("Salada", 15.00));
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
