public class NaveEspacial {
    private String nombre;
    private double combustible;
    private double capacidadCombustible;

    public NaveEspacial(String nombre, double capacidadCombustible) {
        this.nombre = nombre;
        this.capacidadCombustible = capacidadCombustible;
        this.combustible = 0;
    }

    public void despegar() {
        double costo = 10.0;
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(double distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > capacidadCombustible) {
            combustible = capacidadCombustible;
        } else {
            combustible += cantidad;
        }
        System.out.println("Combustible actual: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadCombustible);
    }

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Orion", 50);
        nave.mostrarEstado();
        nave.avanzar(10);
        nave.recargarCombustible(30);
        nave.despegar();
        nave.avanzar(15);
        nave.mostrarEstado();
        nave.recargarCombustible(100);
        nave.mostrarEstado();
    }
}
