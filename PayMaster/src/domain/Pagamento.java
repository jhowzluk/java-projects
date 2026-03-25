package domain;

public abstract class Pagamento {
    protected double valor;
    public static final double TAXA_CONVENIENCIA = 5.0;

    public final void exibirDetalhes() {
        System.out.println(valor + TAXA_CONVENIENCIA);
    }

    public abstract void processar();
}
