package org.example;

public class CuentaBnacaria {

    private String titular;
    private int saldo;
    private int numeroCuenta;


    public CuentaBnacaria() {
    }

    public CuentaBnacaria(String titular, int saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBnacaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }

public void depositarDinero (int cantidad) {
    if (cantidad > 0) {
        saldo += cantidad;
        System.out.println("Dinero depositado, su saldo es: $" + saldo);
    } else {
        System.out.println("Dinero depositado no aceptado");

    }
}
public void retirarDinero (int retiro){
    if (retiro > saldo) {
        System.out.println("Dinero insuficiente.");
    } else if (retiro > 0) {
        saldo -= retiro;
        System.out.println("Dinero retirado, su saldo es: $" + saldo);
    } else {
        System.out.println("La cantidad a retirar debe ser mayor a 0");
    }
}

    public void mostrarInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
    }


