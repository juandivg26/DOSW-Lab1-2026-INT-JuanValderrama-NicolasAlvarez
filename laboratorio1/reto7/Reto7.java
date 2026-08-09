package reto7;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reto7 {
    public static void main(String[] args) {
        long pozoAcumulado = 150_000_000_000L;

        List<Jugador> jugadores = Arrays.asList(
                new Jugador(456, "Gi-hun", 160_000_000),
                new Jugador(67, "Sae-byeok", 80_000_000),
                new Jugador(218, "Cho Sang-woo", 250_000_000),
                new Jugador(199, "Abdul", 70_000_000)
        );


        // PRUEBA 1

        Predicate<Jugador> prueba1Valida = j -> j.getDeuda() <= 170_000_000;

        List<Jugador> sobrevivientesP1 = jugadores.stream()
                .filter(prueba1Valida)
                .collect(Collectors.toList());

        List<Jugador> eliminadosP1 = jugadores.stream()
                .filter(prueba1Valida.negate())
                .peek(j -> j.setEstado("ELIMINADO"))
                .collect(Collectors.toList());

        pozoAcumulado += eliminadosP1.size() * 50_000_000L;

        String pasanP1 = sobrevivientesP1.stream()
                .map(Jugador::getNombre)
                .collect(Collectors.joining(", "));

        System.out.println("Prueba 1 – Luz Roja Luz Verde:");
        System.out.println("  " + pasanP1 + " PASAN");
        eliminadosP1.forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO\n"));

        // PRUEBA 2

        Map<Integer, Integer> dadosAsignados = new HashMap<>();
        dadosAsignados.put(456, 4);
        dadosAsignados.put(67, 6);
        dadosAsignados.put(199, 3);

        Predicate<Jugador> prueba2Valida = j -> dadosAsignados.getOrDefault(j.getNumero(), 1) % 2 == 0;

        List<Jugador> sobrevivientesP2 = sobrevivientesP1.stream()
                .filter(prueba2Valida)
                .collect(Collectors.toList());

        List<Jugador> eliminadosP2 = sobrevivientesP1.stream()
                .filter(prueba2Valida.negate())
                .peek(j -> j.setEstado("ELIMINADO"))
                .collect(Collectors.toList());

        pozoAcumulado += eliminadosP2.size() * 50_000_000L;

        String pasanP2 = sobrevivientesP2.stream()
                .map(j -> j.getNombre() + "(" + dadosAsignados.get(j.getNumero()) + ")")
                .collect(Collectors.joining(", "));

        System.out.println("Prueba 2 – Los Dados:");
        System.out.println("  " + pasanP2 + " PASAN");
        eliminadosP2.forEach(j -> System.out.println("  Jugador " + j.getNumero() + " ELIMINADO\n"));


        // PRUEBA 3

        Predicate<Jugador> prueba3Valida = j -> j.getNumero() == 456;

        List<Jugador> ganadores = sobrevivientesP2.stream()
                .filter(prueba3Valida)
                .collect(Collectors.toList());

        List<Jugador> eliminadosP3 = sobrevivientesP2.stream()
                .filter(prueba3Valida.negate())
                .peek(j -> j.setEstado("ELIMINADO"))
                .collect(Collectors.toList());

        pozoAcumulado += eliminadosP3.size() * 100_000_000L;

        String pasanP3 = ganadores.stream()
                .map(Jugador::getNombre)
                .collect(Collectors.joining(", "));

        System.out.println("Prueba 3 – Puente de Cristal:");
        System.out.println("  " + pasanP3 + " PASA");
        eliminadosP3.forEach(j -> System.out.println("  Jugador " + String.format("%03d", j.getNumero()) + " ELIMINADO\n"));

        // RESULTADO FINAL

        if (!ganadores.isEmpty()) {
            double premioPorGanador = (double) pozoAcumulado / ganadores.size();
            ganadores.forEach(j -> {
                j.setEstado("GANADOR");
                j.setPremio(premioPorGanador);
            });

            Jugador ganador = ganadores.get(0);
            String pozoFormateado = String.format("%,d", pozoAcumulado).replace(',', '.');

            System.out.println("¡Jugador " + ganador.getNumero() + " Eres el Ganador!");
            System.out.println("Premio: " + pozoFormateado + " wones");
        }
    }
}