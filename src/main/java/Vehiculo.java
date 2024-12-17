package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    
    protected static int cantidadVehiculos = 0;

    // Constructor
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        fabricante.aumentarVentas();
    }

    // Getters y Setters
    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public String getTraccion() {
        return traccion;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Método vehiculosPorTipo
    public static String vehiculosPorTipo() {
        return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\n" +
               "Camionetas: " + Camioneta.getCantidadCamionetas() + "\n" +
               "Camiones: " + Camion.getCantidadCamiones();
    }
}
