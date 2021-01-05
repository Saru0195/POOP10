/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroV2;

import Cajero.*;

/**
 *
 * @author Sarahi
 */
public class Cajero {
    public static void main(String[] args){
        KeyboardInput input = new KeyboardInput();
        Cuenta cuenta = new Cuenta();
        int v = 1;
        while (v == 1) { 
            System.out.println("Que accion va a realizar");
            System.out.println("(1)Depositar\n(2)Retirar");
            int a = input.readInteger();
        
            switch (a) {
                case 1:
                    System.out.println("Ingrese monto a depositar");
                    int m = input.readInteger();
                    cuenta.depositar(m);
                    break;
                case 2: 
                    try {
                    System.out.println("Ingrese dinero a retirar");
                    int r = input.readInteger();
                    cuenta.retirar(r);
                    } catch (SaldoInsuficienteException ex) {
                    System.out.println("Saldo insuficiente");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
            System.out.println("\nQuiere realizar otra accion?");
            System.out.println("(1)Si\n(2)no");
                v = input.readInteger();
        }
    }
}
