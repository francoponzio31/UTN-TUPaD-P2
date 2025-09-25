package ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setTarjeta(TarjetaDeCredito tarjeta){ this.tarjeta = tarjeta; if (tarjeta != null) tarjeta.setCliente(this); }
    public TarjetaDeCredito getTarjeta(){ return tarjeta; }
}
