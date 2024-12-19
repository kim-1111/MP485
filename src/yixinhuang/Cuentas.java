/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yixinhuang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emhua
 */
public class Cuentas {

    public static void crearCuentas(ArrayList<Account> cuenta) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el nombre del titular de la cuenta " + num + ": ");
            String name = sc.next();

            System.out.print("Ingrese el saldo inicial de la cuenta " + num + ": ");
            int saldo = sc.nextInt();

            Account account = new Account(num, saldo, name);
            cuenta.add(account);

            num += 1;

        }

    }

    public static void consulatarSaldo(ArrayList<Account> cuenta) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular: ");
        String name = sc.next();

        Account account = null;
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getHolder().equals(name)) {
                account = cuenta.get(i);
                break;
            }
        }
        if (account != null) {
            System.out.println("El saldo de la cuenta es: " + account.getBalance());
        } else {
            System.out.println("No existe el titular");
        }
    }

    public static void ingresarDinero(ArrayList<Account> cuenta) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular: ");
        String name = sc.next();

        Account account = null;
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getHolder().equals(name)) {
                account = cuenta.get(i);
                break;
            }
        }
        if (account != null) {
            System.out.print("Ingrese la cantidad a ingresar: ");
            int ingreso = sc.nextInt();
            account.setBalance(account.getBalance() + ingreso);
            System.out.println("El dinero ha sido ingresado");

        } else {
            System.out.println("No existe el titular");
        }

    }

    public static void sacarDinero(ArrayList<Account> cuenta) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular: ");
        String name = sc.next();

        Account account = null;
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getHolder().equals(name)) {
                account = cuenta.get(i);
                break;
            }
        }

        if (account != null) {
            System.out.print("Ingrese la cantidad a retirar: ");
            int sacar = sc.nextInt();
            if (account.getBalance() >= sacar) {
                account.setBalance(account.getBalance() - sacar);
                System.out.println("El dinero ha sido retirado de la cuenta");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("No existe el titular");
        }

    }

    public static void tranferir(ArrayList<Account> cuenta) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular origen: ");
        String origen = sc.next();

        Account account1 = null;
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getHolder().equals(origen)) {
                account1 = cuenta.get(i);
                break;
            }
        }

        if (account1 != null) {
            System.out.print("Ingrese el nombre del titular destino: ");
            String destino = sc.next();

            Account account2 = null;
            for (int i = 0; i < cuenta.size(); i++) {
                if (cuenta.get(i).getHolder().equals(destino)) {
                    account2 = cuenta.get(i);
                    break;
                }
            }

            if (account2 != null) {
                System.out.print("Ingrese la cantidad a tranferir: ");
                int sacar = sc.nextInt();
                if (account1.getBalance() >= sacar) {
                    account2.setBalance(account2.getBalance() + sacar);
                    account1.setBalance(account1.getBalance() - sacar);
                    System.out.println("La tranferencia se reaizo con exito");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                System.out.println("No existe el titular");
            }

        } else {
            System.out.println("No existe el titular");
        }

    }

    public static int menu() {
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Principal");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Ingresar dinero");
        System.out.println("3- Sacar dinero");
        System.out.println("4- Realizar transferencia");
        System.out.println("5- Salir");
        System.out.print("Ingrese una opcion: ");
        opc = sc.nextInt();
        if (opc < 0 || opc > 5) {
            System.out.println("Opcion no valida, intenta de nuevo.");
        }
        return opc;

    }
}
