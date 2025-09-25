package ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // unidireccional
    private Mesa mesa; // agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa){
        this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa;
    }
}
