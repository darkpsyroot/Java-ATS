/*
    Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial 
    de 1000 Dólares, con el siguiente menú de opciones: 

    1. Ingresar dinero a la cuenta
    2. Retirar dinero de la cuenta
    3. Salir
*/
package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
       final int saldo_inicial = 1000;
       float saldoActual,ingreso,retiro;
       int opcion;
       
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero Automatico\n"
               + "1. Ingresar dinero a la cuenta\n"
               + "2. Retirar dinero de la cuenta\n"
               + "3. Salir"));
       
       switch(opcion){
           case 1: 
               ingreso = Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero desea ingresar a la cuenta: "));
               saldoActual = saldo_inicial + ingreso;
               JOptionPane.showMessageDialog(null,"Saldo Actual "+saldoActual);
               break;
           case 2:  
               retiro = Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero desea retirar de la cuenta: "));
               
               if(retiro > saldo_inicial){
                   JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente para hacer ese retiro");
               }
               else{
                   saldoActual = saldo_inicial - retiro;
                   JOptionPane.showMessageDialog(null,"Saldo Actual "+saldoActual);
               }
               break;
           case 3: break;
           default: JOptionPane.showMessageDialog(null,"Se equivoco de opcion de menú"); break;
       }
       
       
    }
    
}
