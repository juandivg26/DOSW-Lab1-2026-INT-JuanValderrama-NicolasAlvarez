package reto3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "clave";

        // Canal A
        Function<String, String> canalA = msg ->
                IntStream.range(0, 3)
                        .mapToObj(i -> new StringBuilder(msg).toString())
                        .collect(Collectors.joining(" "));

        System.out.println("Canal A:  \"" + canalA.apply(mensaje) + "\"");
    }
}