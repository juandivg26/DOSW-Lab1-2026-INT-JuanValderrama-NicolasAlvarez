package reto4;
import java.util.*;

public class Reto4 {
    public static void main(String[] args) {
        // Estudiante A
        HashMap<String, Integer> mapA = new HashMap<>();
        mapA.putIfAbsent("oro", 5);
        mapA.putIfAbsent("plata", 3);
        mapA.putIfAbsent("oro", 7);
        mapA.putIfAbsent("diamante", 10);

        System.out.println("HashMap (Estudiante A): " + mapA);
    }
}
