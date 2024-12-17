package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int cantidadVentas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void aumentarVentas() {
        this.cantidadVentas++;
        pais.aumentarVentas();
    }

    public static Fabricante fabricaMayorVentas() {
        // Implementar lógica para devolver el fabricante con mayor ventas
        return null; // Implementación necesaria
    }
}
