package reto3;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "clave";

        // Estudiante B
        String canalB = new StringBuffer(mensaje).reverse().toString();

        System.out.println("Canal B: \"" + canalB + "\"");
    }
}