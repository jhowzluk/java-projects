package streams_lambda;

import javax.swing.*;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosParesPor10 = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .toList();

        System.out.println(numerosParesPor10);
    }
}
