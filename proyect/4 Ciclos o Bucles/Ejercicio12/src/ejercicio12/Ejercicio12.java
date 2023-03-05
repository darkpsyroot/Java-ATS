/*
    Ejercicio 12: Pedir un número y calcular su factorial.
*/
package ejercicio12;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int numero;
        long factorial = 1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for(int i=1;i<=numero;i++){
            factorial *= i; //Sacamos el factorial
        }
        
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
    
}
