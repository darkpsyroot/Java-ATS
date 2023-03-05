/*
    Ejercicio 6: Hacer un programa que tome dos números y diga si ambos 
    son pares o impares.
*/
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        int numero1,numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
    
        if((numero1%2==0) && (numero2%2==0)){
            JOptionPane.showMessageDialog(null,"Ambos números son pares");
        }
        else if((numero1%2 != 0) && (numero2%2 != 0)){
            JOptionPane.showMessageDialog(null,"Ambos numeros son impares");
        }
        else{
            JOptionPane.showMessageDialog(null,"Un numero es par y el otro impar");
        }
            
    }
    
}
