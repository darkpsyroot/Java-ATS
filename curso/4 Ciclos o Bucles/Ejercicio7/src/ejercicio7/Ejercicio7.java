/*
    Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular la media.
*/
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
       int numero,elementos=0,suma=0;
       float media;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       while(numero>=0){
           suma += numero; //Sumamos todos los elementos
           elementos++; //Contamos cuantos elementos hay
           
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       }
       
       if(elementos == 0){ //La division por cero saldria error
           System.out.println("Imposible hacer la media");
       }
       else{
           media = (float) suma/elementos;
           System.out.println("La media es: "+media);
       }
    }
    
}
