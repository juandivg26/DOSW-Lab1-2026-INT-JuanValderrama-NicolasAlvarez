package reto2;
import java.util.*;

public class Reto2 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(14, 3, 27, 8, 51, 6);

        // (Estudiante A): Mínimo y Cantidad
        int min = lista1.stream().min(Integer::compare).orElse(0);
        long cant = lista1.stream().count();

        System.out.println("Min: " + min + ", Cantidad: " + cant);
    }
}