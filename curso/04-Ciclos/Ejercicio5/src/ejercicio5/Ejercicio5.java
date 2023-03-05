/*
    Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego ir 
    pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. El proceso termina
    cuando el usuario acierta y mostrar el número de intentos.
*/
package ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        int aleatorio, numero,contador=0;
        
        aleatorio = (int)(Math.random()*100); //Generar un aleatorio entre 0-100
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(aleatorio > numero){
                System.out.println("Digite un numero mayor");
            }
            else if(aleatorio < numero){
                System.out.println("Digite un numero menor");
            }
            
            contador++; //Aumentamos el contador de intentos
        }while(numero != aleatorio);
        
        JOptionPane.showMessageDialog(null,"Genial!! Número encontrado\nNúmero de Intentos: "+contador);
    }
    
}
