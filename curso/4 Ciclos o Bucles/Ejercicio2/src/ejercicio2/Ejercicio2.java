/*
    Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
*/
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIgite un numero: "));
        
        while(numero != 0){
            if(numero>0){ //mayor a cero: positivo
                System.out.println("El numero "+numero+" es Positivo");
            }
            else{ //Caso contrario : negativo
                System.out.println("El numero "+numero+" es Negativo");
            }
            
            //pedimos otro numero
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIgite otro numero: "));
        }
    }
    
}
