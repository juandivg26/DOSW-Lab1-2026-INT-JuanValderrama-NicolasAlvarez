package reto5;
import java.util.*;

public class Reto5 {
    public static void main(String[] args) {
        // Estudiante B
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        List<Integer> sobreviveB = treeSet.stream()
                .filter(n -> n % 5 != 0)
                .toList();

        System.out.println("TreeSet filtrado (Estudiante B): " + sobreviveB);
    }
}