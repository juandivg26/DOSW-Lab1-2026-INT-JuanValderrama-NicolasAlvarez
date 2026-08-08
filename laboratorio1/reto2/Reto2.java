package reto2;
import java.util.*;

public class Reto2 {
    public static void main(String[] args) {
        procesarLista("Lista 1", Arrays.asList(14, 3, 27, 8, 51, 6), "par");
        procesarLista("Lista 2", Arrays.asList(100, 45, 72, 13, 88), "impar");
    }

    static void procesarLista(String nombre, List<Integer> lista, String tipoCantidad) {
        int max = lista.stream().max(Integer::compare).orElse(0);
        int min = lista.stream().min(Integer::compare).orElse(0);
        long cant = lista.stream().count();

        System.out.println(nombre + " => max:" + max + " min:" + min + " cant: " + cant);
        System.out.println("¿" + max + " múltiplo de 2? " + (max % 2 == 0 ? "Si" : "No"));
        System.out.println("¿" + max + " divisible entre 2? " + (max % 2 == 0 ? "Si" : "No"));
        System.out.println("¿Cantidad (" + cant + ") es " + tipoCantidad + "? Si\n");
    }
}