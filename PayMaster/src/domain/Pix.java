package domain;

import repository.Validavel;

public class Pix extends Pagamento implements Validavel {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pix de R$" + valor + " processado.");
    }

    @Override
    public void validar() {

    }
}
