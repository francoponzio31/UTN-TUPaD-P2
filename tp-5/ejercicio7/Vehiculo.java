package ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // agregación
    private Conductor conductor; // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor){ this.patente = patente; this.modelo = modelo; this.motor = motor; }

    public void setConductor(Conductor c){ this.conductor = c; if (c.getVehiculo()!=this) c.setVehiculo(this); }
}
