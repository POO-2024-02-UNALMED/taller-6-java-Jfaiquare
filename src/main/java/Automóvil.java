public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puertas) {
        super(placa, puertas, 100, nombre, precio, peso, "FWD", fabricante);
        this.puertas = puertas;
    }

}
