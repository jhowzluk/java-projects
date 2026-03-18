package application;

import entidades.Conta;

public class Program {
    public static void main(String[] args) {
        Conta c = new Conta();

        c.nome = "Jhow";
        c.cpf = "117282222";
        c.depositar(100.0);
        c.sacar(20.0);

        System.out.println(c.nome);
        System.out.println(c.cpf);
        System.out.println(c.getSaldo());
    }
}
