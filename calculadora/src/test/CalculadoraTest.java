package test;

import dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        double num1, num2;
        char oper;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o 1º número: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o 2º número: ");
        num2 = scan.nextDouble();

        Calculadora calculadora = new Calculadora(num1, num2);

        System.out.print("\n1 - Somar" +
                "\n2 - Subtrair" +
                "\n3 - Multiplicar" +
                "\n4 - Dividir" +
                "\n\nDigite o número da operação desejada: ");
        oper = scan.next().charAt(0);
        scan.nextLine();

        switch (oper) {
            case '1':
                System.out.println("\n-> Resultado da Soma: " + calculadora.somaNum());
                break;
            case '2':
                System.out.println("\n-> Resultado da Subtração: " + calculadora.subNum());
                break;
            case '3':
                System.out.println("\n-> Resultado da Multiplicação: " + calculadora.multNum());
                break;
            case '4':
                System.out.println("\n-> Resultado da Divisão: " + calculadora.divNum());
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}
