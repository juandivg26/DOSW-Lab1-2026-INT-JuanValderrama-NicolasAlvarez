package reto6;

public class Reto6 {
    public static void main(String[] args) {
        // Estudiante B
        ejecutarComandoB("BROMEAR");
        ejecutarComandoB("ANALIZAR");
    }

    public static void ejecutarComandoB(String comando) {
        switch (comando) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("¡¡STACK OVERFLOOOOOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("psst... revisa el punto y coma de la línea 42.");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... ¡Eres increíble!");
                break;
            default:
                System.out.println("Comando no reconocido en Fragmento 2.");
                break;
        }
    }
}