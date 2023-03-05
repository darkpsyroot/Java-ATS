/*2. Hacer un programa que calcule e imprima el salario semanal de un empleado a 
partir de sus horas semanales trabajadas y de su salario por hora.*/

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        float salarioHora,salario;
        
        //Pedimos los datos
        System.out.print("Digite el numero total de horas trabajadas a la semana: ");
        horas = entrada.nextInt();
        System.out.print("Digite el salario por hora: ");
        salarioHora = entrada.nextFloat();
        
        //Sacamos el salario semanal
        salario = horas * salarioHora;
        
        //Mostramos el resultado
        System.out.println("\nEl salario semanal es: "+salario);
        
    }
    
}
