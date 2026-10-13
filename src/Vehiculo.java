public class Vehiculo {
    private String patente;
    private  String modelo;
    private double kilometrajeAcumulado;

    public Vehiculo(String patente, String modelo, double kilometrajeAcumulado){
        this.patente = patente;
        this.modelo = modelo;
        this.kilometrajeAcumulado  = kilometrajeAcumulado;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometrajeAcumulado() {
        return kilometrajeAcumulado;
    }

    public void setKilometrajeAcumulado(double kilometrajeAcumulado) {
        this.kilometrajeAcumulado = kilometrajeAcumulado;
    }

public void avanzar(double kilometros){
        if(kilometros <= 0 ){
            System.out.println("Ingrese una cantidad de kilometros validos");
        }else{
            this.kilometrajeAcumulado += kilometros;
            System.out.println("Kilometraje actualizado: " + kilometrajeAcumulado);
        }
}

}

