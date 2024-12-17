package vehiculos;

public class Camioneta extends Vehiculo {
    private static int cantidadCamionetas = 0;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean traccionIntegral) {
        super(placa, puertas, 90, nombre, precio, peso, traccionIntegral ? "4X4" : "4X2", fabricante);
        cantidadCamionetas++;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }
}
