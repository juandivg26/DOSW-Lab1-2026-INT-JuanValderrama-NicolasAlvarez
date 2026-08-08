package reto4;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {
        public static void main(String[] args) {
                // Estudiante A
                HashMap<String, Integer> mapA = new HashMap<>();
                mapA.putIfAbsent("oro", 5);
                mapA.putIfAbsent("plata", 3);
                mapA.putIfAbsent("oro", 7);
                mapA.putIfAbsent("diamante", 10);

                // Estudiante B
                Hashtable<String, Integer> mapB = new Hashtable<>();
                mapB.put("plata", 8);
                mapB.put("rubí", 4);
                mapB.put("oro", 12);
                mapB.put("esmeralda", 6);

                Stream.concat(mapA.entrySet().stream(), mapB.entrySet().stream())
                        .collect(Collectors.toMap(
                                e -> e.getKey().toUpperCase(),
                                Map.Entry::getValue,
                                (v1, v2) -> v2,
                                TreeMap::new    
                        ))
                        .forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        }
}