/*
    Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
*/
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        int numero, contador = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero>=0){ //mientras el numero sea positivo
            contador++; //aumentamos en uno el contador
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
        System.out.println("Se han introducido "+contador+" numeros positivos");
    }
    
}
