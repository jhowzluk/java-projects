import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        char option;

        menu();

        do {
            option = scan.next().charAt(0);

            switch (option) {
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    System.out.println("\n-> Sistema Finalizado.");
                    break;
                default:
                    System.out.print("Opção inválida! Digite novamente: ");
            }


        } while(option != '3');

    }

    public static void menu(){
        System.out.println("\n----- Menu Professor -----");
        System.out.println("\n1 - Adicionar Alunos");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Sair");
        System.out.print("\nDigite a opção desejada: ");
    }
}
