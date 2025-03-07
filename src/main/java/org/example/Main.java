package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        CuentaBnacaria cuenta1 = new CuentaBnacaria("Laura Gutierrez", 600000, 1558);
        CuentaBnacaria cuenta2 = new CuentaBnacaria("Carlos Giraldo", 1200000, 1560);
        CuentaBnacaria cuenta3 = new CuentaBnacaria("Manuela Sierra", 100000, 1578);

        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        cuenta3.mostrarInfo();

       
        System.out.print("Ingrese monto a depositar en la cuenta de Laura: ");
        int depositoLaura = scanner.nextInt();
        cuenta1.depositarDinero(depositoLaura);

        System.out.print("Ingrese monto a depositar en la cuenta de Carlos: ");
        int depositoCarlos = scanner.nextInt();
        cuenta1.depositarDinero(depositoCarlos);


        System.out.print("Ingrese monto a retirar de la cuenta de Laura: ");
        int retiroLaura = scanner.nextInt();
        cuenta2.retirarDinero(retiroLaura);

        System.out.print("Ingrese monto a retirar de la cuenta de Carlos: ");
        int retiroCarlos = scanner.nextInt();
        cuenta2.retirarDinero(retiroCarlos);



        System.out.println("\nEstado final de las cuentas:");
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        cuenta3.mostrarInfo();

*/
        System.out.println("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();

        System.out.println("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el saldo inicial: ");
        int saldo = scanner.nextInt();

        CuentaBnacaria cuenta = new CuentaBnacaria(titular, numeroCuenta, saldo);

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar información de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->{
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int deposito = scanner.nextInt();
                    cuenta.depositarDinero(deposito);
                }
                case 2 ->{
                    System.out.print("Ingrese la cantidad a retirar: ");
                    int retiro = scanner.nextInt();
                    cuenta.retirarDinero(retiro);
                }
                case 3 ->
                    cuenta.mostrarInfo();

                case 4 ->
                    System.out.println("Saliendo del sistema.");

                default ->
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 4);

    }
    }