//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Vehiculo miVehiculo = new Vehiculo("AB-123-CD", "Sedán Compacto", 1500.5);
    System.out.println("Patente: " + miVehiculo.getPatente());
    System.out.println("Modelo: " + miVehiculo.getModelo());
    System.out.println("Kilometraje inicial: " + miVehiculo.getKilometrajeAcumulado());

    System.out.println("==========================================================");
    System.out.println("Intentando registrar un viaje de 120.0 km...");
    miVehiculo.avanzar(120.0);
    System.out.println("==========================================================");
    System.out.println("Intentando registrar un viaje de 10.0 km...");
    miVehiculo.avanzar(10.0);
    System.out.println("==========================================================");
    System.out.println("Intentando registrar un viaje inválido de -50.0 km...");
    miVehiculo.avanzar(-50.0);

    System.out.println("\n------------------------------------------------");
    System.out.println("Kilometraje total final acumulado: " + miVehiculo.getKilometrajeAcumulado() + " km");
}
