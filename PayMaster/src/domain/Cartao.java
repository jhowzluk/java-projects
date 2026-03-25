package domain;

import exceptions.SaldoInsuficienteException;
import interfaces.Validavel;

public class Cartao extends Pagamento implements Validavel {

    @Override
    public void processar() {
        if (valor > 1000) {

        }
    }

    @Override
    public void validar(){

    }
}
