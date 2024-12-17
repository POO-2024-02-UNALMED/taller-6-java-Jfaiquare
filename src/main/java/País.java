package vehiculos;

public class Pais {
    private String nombre;
    private int cantidadVentas;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void aumentarVentas() {
        this.cantidadVentas++;
    }

    public static Pais paisMasVendedor() {
        // Implementar lógica para devolver el país con mayor ventas
        return null; // Implementación necesaria
    }
}
