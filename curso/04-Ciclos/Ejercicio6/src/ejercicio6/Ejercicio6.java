/*
    Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
*/
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        int numero,suma=0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            suma += numero; //Sumamos todos los numeros
        }while(numero != 0); //mientras sea diferente de cero
        
        System.out.println("La suma de todos los números es: "+suma);
    }
    
}
