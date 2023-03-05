/*
    Ejercicio 8: Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.
*/
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero < 10){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 1 cifra");
        }
        else if(numero<100){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 2 cifras");
        }
        else if(numero < 1000){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 3 cifras");
        }
        else if(numero < 10000){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 4 cifras");
        }
        else if(numero < 100000){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene 5 cifras");
        }
    }
    
}
