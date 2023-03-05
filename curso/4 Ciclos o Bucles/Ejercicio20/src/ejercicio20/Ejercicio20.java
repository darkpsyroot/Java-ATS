/*
    Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
*/
package ejercicio20;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
       int numeroSueldos;
       float sueldo,mayorSueldo=0;
       
       numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de sueldos: "));
       
       for(int i=1 ; i<=numeroSueldos ; i++){
           sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo N°"+i+": "));
           if(sueldo > mayorSueldo){
               mayorSueldo = sueldo; //Obtenemos el mayor Sueldo
           }
       }
       
        System.out.println("El sueldo maximo es: "+mayorSueldo);
    }
    
}
