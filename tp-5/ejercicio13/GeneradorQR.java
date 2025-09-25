package ejercicio13;

public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario){
        CodigoQR qr = new CodigoQR(valor + "-para-" + usuario);
        System.out.println("Generando QR para usuario: " + usuario);
        return qr;
    }
}
