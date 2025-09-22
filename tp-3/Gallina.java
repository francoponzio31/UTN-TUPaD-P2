public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edadInicial);
        this.huevosPuestos = 0;
    }

    public void envejecer() {
        this.edad += 1;
    }

    public void ponerHuevo() {
        this.huevosPuestos += 1;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina g1 = new Gallina("G1", 1);
        Gallina g2 = new Gallina("G2", 1);
        g1.envejecer();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
