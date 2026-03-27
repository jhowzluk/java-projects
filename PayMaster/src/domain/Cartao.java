package domain;

import exceptions.SaldoInsuficienteException;
import repository.Validavel;

public class Cartao extends Pagamento implements Validavel {

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void processar() throws SaldoInsuficienteException {
        if (valor > 1000) {
            throw new SaldoInsuficienteException("Limite excedido!");
        }
        System.out.println("Pagamento com cartão realizado.");
    }


    @Override
    public void validar() {

    }
}
