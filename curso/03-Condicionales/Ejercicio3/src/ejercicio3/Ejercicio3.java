/*
    Ejercicio 3: Programa que lea un carácter por teclado y compruebe si 
    es una letra mayúscula
*/
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){ //utilizamos el método isUpperCase de la clase Character
            JOptionPane.showMessageDialog(null,"La letra "+letra+" es mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"La letra esta en minuscula");
        }
           
    }
    
}
