package ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular titular; 

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave){
        this.cbu = cbu; this.saldo = saldo; this.clave = clave;
    }

    public void setTitular(Titular t){ this.titular = t; if (t.getCuenta()!=this) t.setCuenta(this); }
}
