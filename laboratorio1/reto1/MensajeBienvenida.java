package reto1;
import java.util.*;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Juan Pérez", 6, 21, "juan.perez@mail.escuelaing.edu.co"),
                new Estudiante("Miguel Roncancio", 5, 22, "miguel.roncancio@mail.escuelaing.edu.co")
        );

        String presentacion = estudiantes.stream()
                .map(e -> (e.nombre.equals("Juan Pérez") ? e.nombre + ", estudiante de " + e.semestre + "º semestre de " + e.edad + " años" : e.nombre + ", de " + e.semestre + "º semestre de " + e.edad + " años"))
                .collect(Collectors.joining(", y "));

        String correos = estudiantes.stream()
                .map(e -> e.correo)
                .collect(Collectors.joining(" y "));

        System.out.println("¡Hola, bienvenidos! Somos la pareja conformada por " + presentacion + ". Nuestros correos son: " + correos + ".");
    }
}