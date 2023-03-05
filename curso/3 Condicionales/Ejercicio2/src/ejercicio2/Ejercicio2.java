/*
    Ejercicio 2: Pedir dos números y decir cual es el mayor o si son iguales.
*/
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
       int numero1,numero2;
       
       //Pedimos los datos
       numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       
       //Comprobamos quien es mayor
       if(numero1 > numero2){
           JOptionPane.showMessageDialog(null,"El mayor es: "+numero1);
       }
       else if(numero2 > numero1){
           JOptionPane.showMessageDialog(null,"El mayor es: "+numero2);
       }
       else{ //Caso contrario son iguales
           JOptionPane.showMessageDialog(null,"Ambos numeros son iguales");
       }
    }
    
}
