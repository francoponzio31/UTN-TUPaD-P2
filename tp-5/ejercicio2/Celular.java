package ejercicio2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    // agregación: referencia a Bateria, puede existir independiente
    private Bateria bateria;
    // asociación bidireccional
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria){ this.bateria = bateria; }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario.getCelular() != this) usuario.setCelular(this);
    }
    public String toString(){ return "Celular{"+imei+", "+marca+", "+modelo+"}"; }
}
