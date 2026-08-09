package reto3;

import java.util.Arrays;
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

        // Canal B
        Function<String, String> canalB = msg ->
                Arrays.stream(msg.split(" "))
                        .map(word -> new StringBuffer(word).reverse().toString())
                        .collect(Collectors.joining(" "));

        Function<String, String> descifradoFinal = canalA.andThen(canalB);

        String resultadoA = canalA.apply(mensaje);
        String resultadoFinal = descifradoFinal.apply(mensaje);

        System.out.println("Canal A:  \"" + resultadoA + "\"\n");
        System.out.println("Descifrado final:\n\"" + resultadoFinal + "\"");
    }
}