package reto6;
import java.util.*;

public class Reto6 {
    public static void main(String[] args) {
        Map<String, Runnable> comandos = new HashMap<>();

        comandos.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del Tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("Hasta la próxima compilación, viajero."));
        comandos.put("CANTAR", () -> System.out.println("La la la... compilando melodías en tiempo real."));
        comandos.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));

        comandos.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("¡¡STACK OVERFLOOOOOW!!!");"));
        comandos.put("SUSURRAR", () -> System.out.println("psst... revisa el punto y coma de la línea 42."));
        comandos.put("ANALIZAR", () -> System.out.println("Analizando datos... ¡Eres increíble!"));

        List<String> ordenEjecucion = Arrays.asList(
                "SALUDAR", "BROMEAR", "ANALIZAR", "DANZAR",
                "DESPEDIR", "CANTAR", "GRITAR", "SUSURRAR"
        );

        ordenEjecucion.forEach(cmd -> {
            Runnable accion = comandos.get(cmd);
            if (accion != null) {
                accion.run();
            }
        });
    }
}