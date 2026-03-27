package interfaces.dominio;

public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double gerarArea() {
        return Math.pow(lado, 2);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
