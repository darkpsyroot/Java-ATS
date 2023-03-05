/*
    Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
*/
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        int numero,i;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        i = 1; //Iniciamos el iterador
        while(i<=numero){
            System.out.println(i);
            i++; //Aumentamos el contador
        }
    }
    
}
