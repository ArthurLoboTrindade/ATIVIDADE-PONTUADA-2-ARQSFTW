package bes.ucsal;

public class CarrinhoDePipocaMain {
    public static void main(String[] args) {
        Pipoca pedido1 = new PipocaEnsacada();
        System.out.println("Pedido 1: " + pedido1.getDescricao());
        System.out.println("Preço: R$ " + pedido1.getPreco());
        System.out.println("-------------------------");


        Pipoca pedido2 = new PipocaEnsacada();
        pedido2 = new Manteiga(pedido2);

        System.out.println("Pedido 2: " + pedido2.getDescricao());
        System.out.println("Preço: R$ " + pedido2.getPreco());
        System.out.println("-------------------------");

        Pipoca pedido3 = new PipocaEnsacada();
        pedido3 = new Manteiga(pedido3);
        pedido3 = new Achocolatado(pedido3);
        pedido3 = new LeiteCondenado(pedido3);

        System.out.println("Pedido 3: " + pedido3.getDescricao());
        System.out.println("Preço: R$ " + pedido3.getPreco());
    }
}