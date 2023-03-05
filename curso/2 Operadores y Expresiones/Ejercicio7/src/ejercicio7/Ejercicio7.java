/*Ejercicio 7: Construir un programa que, dado un número total de horas, 
devuelve el número de semanas, días y horas equivalentes. Por ejemplo, 
dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.*/

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales,semanas,dias,horas;
        
        System.out.print("Digite el numero de horas totales: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales/168; //Hallamos las semanas
        dias = horasTotales%168 /24; //Hallamos los dias
        horas = horasTotales % 24; //Hallamos las horas
        
        System.out.println("\nSemanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        
    }
    
}
