/*
    Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
*/
package ejercicio21;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {
        int numero;
        boolean hay_negativo = false;
        
        for(int i=1;i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero < 0){ //Si el numero es menor a cero
                hay_negativo = true;
            }
        }
        
        if(hay_negativo == true){
            System.out.println("Si hay almenos un número negativo");
        }
        else{
            System.out.println("No hay números negativos");
        }
    }
    
}
