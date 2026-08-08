package reto3;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "clave";

        Function<String, String> descifradoFinal = msg ->
                IntStream.range(0, 3)
                        .mapToObj(i -> new StringBuffer(new StringBuilder(msg).toString()).reverse().toString())
                        .collect(Collectors.joining(" "));

        System.out.println("Descifrado final: \"" + descifradoFinal.apply(mensaje) + "\"");
    }
}