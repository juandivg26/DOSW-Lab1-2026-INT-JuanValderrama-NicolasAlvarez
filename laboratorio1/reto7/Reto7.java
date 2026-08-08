package reto7;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reto7 {
    public static void main(String[] args) {
        long pozoAcumulado = 150_000_000_000L;

        List<Jugador> jugadores = Arrays.asList(
                new Jugador(456, "Seong Gi-hun", 160_000_000),
                new Jugador(218, "Cho Sang-woo", 200_000_000),
                new Jugador(67, "Sae-byeok", 120_000_000),
                new Jugador(1, "Oh Il-nam", 50_000_000),
                new Jugador(101, "Deok-su", 180_000_000),
                new Jugador(199, "Abdul Ali", 140_000_000),
                new Jugador(212, "Mi-nyeo", 190_000_000),
                new Jugador(240, "Ji-yeong", 80_000_000)
        );

        System.out.println("=== EL JUEGO DEL CALAMAR ===");
        System.out.println("Participantes iniciales: " + jugadores.size());

        // PRUEBA 1

        Predicate<Jugador> prueba1Valida = j -> j.getDeuda() <= 170_000_000;

        List<Jugador> sobrevivientesP1 = jugadores.stream()
                .filter(prueba1Valida)
                .collect(Collectors.toList());

        long eliminadosP1 = jugadores.size() - sobrevivientesP1.size();
        pozoAcumulado += eliminadosP1 * 50_000_000L;

        jugadores.stream()
                .filter(prueba1Valida.negate())
                .forEach(j -> j.setEstado("ELIMINADO"));

        System.out.println("\n--- PRUEBA 1: Luz Roja Luz Verde ---");
        System.out.println("Eliminados: " + eliminadosP1 + " (+ " + String.format("%,d", eliminadosP1 * 50_000_000L) + " wones)");
        System.out.println("Sobrevivientes: " + sobrevivientesP1.size());

        // PRUEBA 2

        Predicate<Jugador> prueba2Valida = j -> j.getNumero() % 2 == 0;

        List<Jugador> sobrevivientesP2 = sobrevivientesP1.stream()
                .filter(prueba2Valida)
                .collect(Collectors.toList());

        long eliminadosP2 = sobrevivientesP1.size() - sobrevivientesP2.size();
        pozoAcumulado += eliminadosP2 * 50_000_000L;

        sobrevivientesP1.stream()
                .filter(prueba2Valida.negate())
                .forEach(j -> j.setEstado("ELIMINADO"));

        System.out.println("\n--- PRUEBA 2: Los Dados ---");
        System.out.println("Eliminados: " + eliminadosP2 + " (+ " + String.format("%,d", eliminadosP2 * 50_000_000L) + " wones)");
        System.out.println("Sobrevivientes: " + sobrevivientesP2.size());

        // PRUEBA 3

        Predicate<Jugador> prueba3Valida = j -> j.getNombre().length() >= 5;

        List<Jugador> ganadores = sobrevivientesP2.stream()
                .filter(prueba3Valida)
                .collect(Collectors.toList());

        long eliminadosP3 = sobrevivientesP2.size() - ganadores.size();
        pozoAcumulado += eliminadosP3 * 100_000_000L;

        sobrevivientesP2.stream()
                .filter(prueba3Valida.negate())
                .forEach(j -> j.setEstado("ELIMINADO"));

        System.out.println("\n--- PRUEBA 3: Puente de Cristal ---");
        System.out.println("Eliminados: " + eliminadosP3 + " (+ " + String.format("%,d", eliminadosP3 * 100_000_000L) + " wones)");

        // RESULTADO

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Pozo acumulado total: " + String.format("%,d", pozoAcumulado) + " wones");

        if (!ganadores.isEmpty()) {
            double premioPorGanador = (double) pozoAcumulado / ganadores.size();
            ganadores.forEach(j -> {
                j.setEstado("GANADOR");
                j.setPremio(premioPorGanador);
            });

            System.out.println("Ganadores (" + ganadores.size() + "):");
            ganadores.forEach(System.out.println);
        } else {
            System.out.println("No hubo ganadores. El pozo queda para la organización.");
        }
    }
}