package ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, FirmaDigital firma){
        this.titulo = titulo; this.contenido = contenido; this.firma = firma;
    }
}
