public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(0, edad);
    }

    public void cumplirAnios() {
        this.edad += 1;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre +
                " | Especie: " + especie +
                " | Edad: " + edad + " año(s)");
    }

    public static void main(String[] args) {
        Mascota m = new Mascota("Oli", "Perro", 2);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
    }
}
