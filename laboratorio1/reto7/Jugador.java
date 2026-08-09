package reto7;

public class Jugador {
    private int numero;
    private String nombre;
    private double deuda;
    private double premio;
    private String estado;

    public Jugador(int numero, String nombre, double deuda) {
        this.numero = numero;
        this.nombre = nombre;
        this.deuda = deuda;
        this.premio = 0.0;
        this.estado = "ACTIVO";
    }

    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }
    public double getDeuda() { return deuda; }
    public double getPremio() { return premio; }
    public String getEstado() { return estado; }

    public void setPremio(double premio) { this.premio = premio; }
    public void setEstado(String estado) { this.estado = estado; }
}