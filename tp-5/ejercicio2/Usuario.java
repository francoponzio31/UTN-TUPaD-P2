package ejercicio2;

public class Usuario {
    private String nombre;
    private String dni;
    // asociación bidireccional
    private Celular celular;

    public Usuario(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular){
        this.celular = celular;
        if (celular != null && celular != this.celular) celular.setUsuario(this);
    }
    public Celular getCelular(){ return celular; }
    public String toString(){ return "Usuario{"+nombre+", "+dni+"}"; }
}
