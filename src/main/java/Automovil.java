package vehiculos;

public class Automovil extends Vehiculo {
    private static int cantidadAutomoviles = 0;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puertas) {
        super(placa, puertas, 100, nombre, precio, peso, "FWD", fabricante);
        cantidadAutomoviles++;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }
