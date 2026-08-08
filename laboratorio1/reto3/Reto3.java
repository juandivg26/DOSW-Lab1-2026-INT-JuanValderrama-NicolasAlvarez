package reto3;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "clave";

        // Estudiante A
        String canalA = IntStream.range(0, 3)
                .mapToObj(i -> new StringBuilder(mensaje).toString())
                .collect(Collectors.joining(" "));

        System.out.println("Canal A: \"" + canalA + "\"");
    }
}