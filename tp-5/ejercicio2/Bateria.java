package ejercicio2;

public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad){
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    public String toString(){ return "Bateria{"+modelo+", "+capacidad+"mAh}"; }
}
