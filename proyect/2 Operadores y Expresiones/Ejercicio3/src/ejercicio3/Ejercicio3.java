/*3. Guillermo tiene N dolares. 
     Luis tiene la mitad de lo que posee Guillermo.
     Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
     Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre 
     los tres. */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.print("Digite la cantidad que tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2; //luis tiene la mitad de guillermo
        juan = (guillermo + luis) / 2; //juan tiene la mitad de luis y guillermo juntos
        
        total = guillermo + luis + juan; //Sumamos las 3 cantidades
        
        System.out.println("\nLa cantidad de dinero entre los 3 es: "+total);
        
    }
    
}
