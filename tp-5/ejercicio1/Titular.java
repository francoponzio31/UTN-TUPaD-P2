package ejercicio1;

public class Titular {
    private String nombre;
    private String dni;
    // asociación bidireccional con Pasaporte
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte != this.pasaporte) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte(){ return pasaporte; }
    public String toString(){ return "Titular{"+nombre+", "+dni+"}"; }
}
