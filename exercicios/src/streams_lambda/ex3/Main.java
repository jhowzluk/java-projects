package streams_lambda.ex3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Monitor", 1200.0, "Eletrônicos"),
                new Produto("Cadeira", 800.0, "Móveis"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Mouse", 100.0, "Eletrônicos"),
                new Produto("Mesa", 1500.0, "Móveis"),
                new Produto("Fone", 50.0, "Eletrônicos")
        );

        List<String> produtosFiltrados = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000)
                .map(p -> p.getNome().toUpperCase())
                .toList();

        System.out.println(produtosFiltrados);

        double somaProduto = produtos.stream()
                .filter(p -> p.getCategoria().equals("Móveis"))
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println(somaProduto);
    }
}
