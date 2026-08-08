package reto5;
import java.util.*;

public class Reto5 {
    public static void main(String[] args) {
        // Estudiante A
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));

        List<Integer> sobreviveA = hashSet.stream()
                .filter(n -> n % 3 != 0)
                .toList();

        System.out.println("HashSet filtrado (Estudiante A): " + sobreviveA);
    }
}