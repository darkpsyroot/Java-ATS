/*Êjercicio 6: Hacer un programa que calcule el cuadrado de una suma.
    (a+b)^2 = a^2 + b^2 + 2ab
*/

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b, resultado;
        
        System.out.print("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextDouble();
        
        resultado = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);
        
        System.out.println("\nEl resultado es: "+resultado);
        
    }
    
}
