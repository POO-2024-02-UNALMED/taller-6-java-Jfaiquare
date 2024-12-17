package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear un fabricante
        Fabricante fabricante1 = new Fabricante("Renault", new Pais("Colombia"));

        // Crear vehículos
        Vehiculo auto1 = new Automovil("ABC123", "Automovil Modelo A", 20000, 1500, fabricante1, 4);
        Vehiculo camioneta1 = new Camioneta("DEF456", 5, "Camioneta Modelo X", 30000, 2000, fabricante1, true);
        Vehiculo camion1 = new Camion("GHI789", "Camion Modelo Z", 40000, 5000, fabricante1, 2);

        // Imprimir la cantidad total de vehículos
        System.out.println("Cantidad total de vehículos: " + Vehiculo.getCantidadVehiculos());

        // Imprimir la cantidad de vehículos por tipo
        System.out.println(Vehiculo.vehiculosPorTipo());
    }
}
