/*
    Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
*/
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero; 
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero != 0){
            if(numero%2 == 0){ //Si el numero es par
                System.out.println("El numero "+numero+" es PAR");
            }
            else{
                System.out.println("El numero "+numero+" es IMPAR");
            }
            
            //Repetimos el proceso de leer un numero
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    }
    
}
