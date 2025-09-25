package ejercicio14;

public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto){
        Render r = new Render(formato);
        System.out.println("Exportando proyecto " + proyecto + " a formato " + formato);
        return r;
    }
}
