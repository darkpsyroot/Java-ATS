/*
    Ejercicio 10: Pedir 10 números y escribir la suma total.
*/
package ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {
        int numero, suma = 0;
        
        for(int i=1; i<= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digire un numero: ")); //Pedimos un numero
            
            suma += numero; //Sumamos todos los numeros
        }
        
        System.out.println("La suma total es: "+suma); //Mostramos el resultado
    }
    
}
