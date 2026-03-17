package test;

import domain.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String nome, turma;
        int idade, count = 0;
        char option;

        menu();

        do {
            option = scan.next().charAt(0);
            scan.nextLine();

            switch (option) {
                case '1':
                    do {
                        System.out.print("\nDigite o nome do aluno: ");
                        nome = scan.nextLine();
                        System.out.print("Digite a idade do aluno: ");
                        idade = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite a turma do aluno: ");
                        turma = scan.nextLine();

                        estudantes.add(new Estudante(nome, idade, turma));

                        System.out.print("\n1 - Adicionar novo aluno | 2 - Sair : ");
                        option = scan.next().charAt(0);
                        scan.nextLine();
                    } while (option != '2');

                    menu();
                    break;
                case '2':
                    if (estudantes.isEmpty()) {
                        System.out.println("\n- Nenhum aluno adicionado!");
                    } else {
                        for (Estudante n : estudantes) {
                            System.out.println(n.getEstudante());
                        }

                        System.out.println("\nPressione qualquer tecla para sair");
                        String op = scan.nextLine();
                    }

                    menu();
                    break;
                case '3':
                    System.out.println("\n-> Sistema Finalizado.");
                    break;
                default:
                    System.out.print("Opção inválida! Digite novamente: ");
            }

        } while (option != '3');

    }

    public static void menu() {
        System.out.println("\n----- Menu Professor -----");
        System.out.println("\n1 - Adicionar Alunos");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Sair");
        System.out.print("\nDigite a opção desejada: ");
    }
}
