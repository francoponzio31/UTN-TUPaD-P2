package ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    // asociación unidireccional a Autor
    private Autor autor;
    // agregación a Editorial
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial){
        this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial;
    }
    public String toString(){ return "Libro{"+titulo+", "+isbn+"}"; }
}
