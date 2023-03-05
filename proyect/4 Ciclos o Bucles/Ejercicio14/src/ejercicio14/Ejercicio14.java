/*
    Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
*/
package ejercicio14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        float sueldo,suma = 0;
        int conteo=0;
        
        for(int i=1;i<=10;i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite un sueldo: "));
            if(sueldo > 1000){ 
                conteo++; //Contamos cuantos sueldos mayores a 1000 existen
            }  
            suma += sueldo; //Suma iterativa de sueldos
        }
        
        System.out.println("La suma de todos los sueldos es: $"+suma);
        System.out.println("La cantidad de sueldos que superan a $1000 es: "+conteo);
    }
    
}
