package reto3;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "clave clave clave";

        // Canal B
        Function<String, String> canalB = msg ->
                Arrays.stream(msg.split(" "))
                        .map(word -> new StringBuffer(word).reverse().toString())
                        .collect(Collectors.joining(" "));

        System.out.println("Canal B (Invertido): \"" + canalB.apply(mensaje) + "\"");
    }
}