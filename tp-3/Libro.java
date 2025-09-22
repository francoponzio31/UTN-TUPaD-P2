import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    private String getTitulo() { return titulo; }
    private String getAutor() { return autor; }
    private int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        int current = LocalDate.now().getYear();
        if (anio < 1450 || anio > current) {
            System.out.println("Año inválido: " + anio);
            return;
        }
        this.anioPublicacion = anio;
    }

    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
    }

    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        libro.mostrarInfo();
        libro.setAnioPublicacion(3000);
        libro.mostrarInfo();
        libro.setAnioPublicacion(2005);
        libro.mostrarInfo();
    }
}
