package ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    public Titular(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setCuenta(CuentaBancaria c){ this.cuenta = c; if (c!=null && c!=this.cuenta) c.setTitular(this); }
    public CuentaBancaria getCuenta(){ return cuenta; }
}
