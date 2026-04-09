package streams_lambda;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        List<String> cargos = new ArrayList<>();
        cargos.add("Dev");
        cargos.add("QA");
        cargos.add("Gerente");

        List<String> cargosComG = cargos.stream()
                .filter(c -> c.startsWith("G"))
                .toList();

        List<String> cargosMais2Letras = cargos.stream()
                .filter(c -> c.length() > 2)
                .toList();

        List<String> cargosMaiusculo = cargos.stream()
                .map(c -> c.toUpperCase())
                .toList();

        System.out.println("Cargos que começam com 'G': " + cargosComG);
        System.out.println("Cargos com mais de 2 letras: " + cargosMais2Letras);
        System.out.println("Cargos com letras maiúsculas: " + cargosMaiusculo);
    }
}
