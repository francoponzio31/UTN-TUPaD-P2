package ejercicio1;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    // composición: Pasaporte contiene Foto que vive con él
    private Foto foto;
    // asociación bidireccional con Titular
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto; // composición: creada fuera o dentro, aquí la asignamos en constructor
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public String toString(){
        return "Pasaporte{"+numero+", "+fechaEmision+", foto="+foto+"}";
    }
}
