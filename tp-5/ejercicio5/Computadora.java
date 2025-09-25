package ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa; // composición
    private Propietario propietario; // asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placa){
        this.marca = marca; this.numeroSerie = numeroSerie; this.placa = placa;
    }

    public void setPropietario(Propietario p){ this.propietario = p; if (p.getComputadora()!=this) p.setComputadora(this); }
}
