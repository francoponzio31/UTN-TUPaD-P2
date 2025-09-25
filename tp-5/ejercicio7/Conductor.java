package ejercicio7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    public Conductor(String nombre, String licencia){ this.nombre = nombre; this.licencia = licencia; }
    public void setVehiculo(Vehiculo v){ this.vehiculo = v; if (v!=null && v!=this.vehiculo) v.setConductor(this); }
    public Vehiculo getVehiculo(){ return vehiculo; }
}
