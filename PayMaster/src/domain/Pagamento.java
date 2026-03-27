package domain;

import exceptions.SaldoInsuficienteException;

public abstract class Pagamento {
    protected double valor;
    public static final double TAXA_CONVENIENCIA = 0.02;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public final void exibirDetalhes() {
        System.out.println(valor + TAXA_CONVENIENCIA);
    }

    public abstract void processar() throws SaldoInsuficienteException;
}
