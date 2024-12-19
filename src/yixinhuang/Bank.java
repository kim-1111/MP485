/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yixinhuang;

import java.util.ArrayList;

/**
 *
 * @author emhua
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Account> cuenta = new ArrayList<Account>();
        
        Cuentas.crearCuentas(cuenta);
        
        int opc;
        
        do {
            opc = Cuentas.menu();
            switch (opc) {
                case 1:
                    Cuentas.consulatarSaldo(cuenta);
                    break;
                case 2:
                    Cuentas.ingresarDinero(cuenta);
                    break;
                case 3:
                    Cuentas.sacarDinero(cuenta);
                    break;
                case 4:
                    Cuentas.tranferir(cuenta);
                    break;
            }
        } while (opc != 5);
        
    }
    
}
