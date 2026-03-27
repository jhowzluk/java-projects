package interfaces.test;

import interfaces.dominio.Circulo;
import interfaces.dominio.Quadrado;

public class app {
    public static void main(String[] args) {
        Circulo circuloPequeno = new Circulo(5);
        System.out.println(circuloPequeno.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.gerarArea());
    }
}
