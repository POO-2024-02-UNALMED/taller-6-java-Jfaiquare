package vehiculos;

public class Camion extends Vehiculo {
    private static int cantidadCamiones = 0;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puertas) {
        super(placa, puertas, 80, nombre, precio, peso, "4X2", fabricante);
        cantidadCamiones++;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }
}
