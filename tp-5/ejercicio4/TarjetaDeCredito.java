package ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // asociación bidireccional
    private Banco banco; // agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
        this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente.getTarjeta() != this) cliente.setTarjeta(this);
    }
}
