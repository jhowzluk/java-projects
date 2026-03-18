package entidades;

public class Conta {
    public String nome;
    public String cpf;
    private double saldo;

    public Conta() {
        saldo = 0.0;
    }

    public Conta(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(saldo < valor){
            System.out.println("Valor inválido!");
        } else {
            saldo -= valor;
        }
    }
}
