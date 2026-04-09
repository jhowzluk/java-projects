package collections;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        //Exercicio 1
        Set<String> emails = new HashSet<>();
        emails.add("jluksik@gami.com");
        emails.add("jlu@gami.com");

        //Exercicio 2
        List<String> cargos = new ArrayList<>();
        cargos.add("Dev");
        cargos.add("QA");
        cargos.add("Gerente");

        //Exercicio 3
        Map<Integer, String> funcionarios = new HashMap<>();
        funcionarios.put(2698, "João");
    }
}
