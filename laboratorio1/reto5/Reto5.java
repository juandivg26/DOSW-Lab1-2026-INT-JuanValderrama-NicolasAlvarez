package reto5;
import java.util.*;

public class Reto5 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        TreeSet<Integer> arena = new TreeSet<>();
        arena.addAll(hashSet.stream().filter(n -> n % 3 != 0).toList());
        arena.addAll(treeSet.stream().filter(n -> n % 5 != 0).toList());

        arena.forEach(n -> System.out.println("Número en arena: " + n));
    }
}