package ejercicio3;

public class Autor {
    private String nombre;
    private String nacionalidad;
    public Autor(String nombre, String nacionalidad){ this.nombre = nombre; this.nacionalidad = nacionalidad; }
    public String toString(){ return "Autor{"+nombre+", "+nacionalidad+"}"; }
}
