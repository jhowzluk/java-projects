package domain;

public class Pix extends Pagamento {

    @Override
    public void processar() {
        System.out.println("Pix de R$" + valor + " processado.");
    }
}
