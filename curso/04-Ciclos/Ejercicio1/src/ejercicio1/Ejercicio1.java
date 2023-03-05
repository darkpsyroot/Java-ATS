/*
    Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
*/
package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
       int numero,cuadrado;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       while(numero>=0){ //mientras el numero sea positivo o cero
           cuadrado = (int)Math.pow(numero,2); //Elevamos al cuadrado 
           
           JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es: "+cuadrado); //Mostramos el numero
           
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       }
    }
    
}
