/*5. La calificación final de un estudiante de Informática se calcula con base a las 
calificaciones de cuatro aspectos de su rendimiento académico: participación, 
primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con 
ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la 
calificación final obtenida por un estudiante.*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamenParcial, segundoExamenParcial, examenFinal, notaFinal;
        
        //Pedimos los datos 
        System.out.print("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la nota del primer Examen parcial:  ");
        primerExamenParcial = entrada.nextFloat();
        System.out.print("Digite la nota del segundo Examen parcial: ");
        segundoExamenParcial = entrada.nextFloat();
        System.out.print("Digite la nota del Examen final: ");
        examenFinal = entrada.nextFloat();
        
        //Sacamos los calculos
        participacion *= 0.10f;
        primerExamenParcial *= 0.25f;
        segundoExamenParcial *= 0.25f;
        examenFinal *= 0.40f;
        
        //Sacamos la nota final
        notaFinal = participacion + primerExamenParcial + segundoExamenParcial + examenFinal;
        
        System.out.println("\nLa nota final es: "+notaFinal);
    }
    
}
