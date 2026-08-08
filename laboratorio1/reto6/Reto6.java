package reto6;

public class Reto6 {
    public static void main(String[] args) {
        // Estudiante A
        ejecutarComandoA("SALUDAR");
        ejecutarComandoA("CANTAR");
    }

    public static void ejecutarComandoA(String comando) {
        switch (comando) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del Tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Hasta la próxima compilación, viajero.");
                break;
            case "CANTAR":
                System.out.println("La la la... compilando melodías en tiempo real.");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;
            default:
                System.out.println("Comando no reconocido en Fragmento 1.");
                break;
        }
    }
}
