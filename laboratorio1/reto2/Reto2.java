package reto2;
import java.util.*;

public class Reto2 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(14, 3, 27, 8, 51, 6);

        // Estudiante B (Carril 1): Máximo
        int max = lista1.stream().max(Integer::compare).orElse(0);

        System.out.println("Max: " + max);
    }
}