/*Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raíces de la 
ecuación de segundo grado de coeficientes reales. */ 

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,resultado1,resultado2; 
        
        System.out.print("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Digite el valor de c: ");
        c = entrada.nextDouble();
        
        resultado1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        resultado2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        
        System.out.println("\nLa ecuacion: "+a+"x^2 + "+b+"x + "+c);
        System.out.println("Solucion 1: "+resultado1);
        System.out.println("Solucion 2: "+resultado2);
        
    }
    
}
