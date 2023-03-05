/*
    Ejercicio 1: Hacer un programa que lea un número entero y muestre si el número es 
    múltiplo de 10.
*/

package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        int numero;
        
        //Pedimos el numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        //Comprobamos si es multiplo de 10
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" es múltiplo de 10");
        }
        else{ //Caso contrario
            JOptionPane.showMessageDialog(null,"El numero no es múltiplo de 10");
        }
    }
    
}
