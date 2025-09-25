package ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    public Propietario(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setComputadora(Computadora c){ this.computadora = c; if (c!=null && c!=this.computadora) c.setPropietario(this); }
    public Computadora getComputadora(){ return computadora; }
}
