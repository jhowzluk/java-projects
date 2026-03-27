package test;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor;
        char option = ' ';

        do {
            do {
                header();
                System.out.print("\nDigite o valor a ser recebido: R$");
                valor = scan.nextDouble();
                scan.nextLine();

                if (valor <= 0){
                    System.out.println("\nErro! Digite um valor maior que 0.");
                }
            } while (valor <= 0);

            System.out.println("\n-- MÉTODOS DE PAGAMENTO --");
            System.out.println("1 - Cartão");
            System.out.println("2 - PIX");
            System.out.println("3 - Sair");
            option = scan.next().charAt(0);
            scan.nextLine();

            switch (option) {
                case '1':

                    break;
                case '2':
                    break;
                case '3':
                    System.out.println("\n-> Finalizando sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Digite novamente.");
            }
        } while (option != '3');


    }

    static void header() {
        System.out.println("\n|- - PayMaster - -|");
    }
}
