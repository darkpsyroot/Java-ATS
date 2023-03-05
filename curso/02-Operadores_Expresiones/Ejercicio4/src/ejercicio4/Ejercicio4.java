/*4. Una compañia de venta de autos usados, paga a su personal de ventas un salario de 
$1000 mensuales, mas una comisión de $150 por cada auto vendido, más el 5% del valor de
la venta por auto. Cada mes el capturista de la empresa ingresa en la computadora los 
datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado*/

package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int salarioMes = 1000; //El salario es constante
        int nAutosVendidos;
        float precioAuto,salarioFinal;
        
        System.out.print("Digite cuantos autos vendio: ");
        nAutosVendidos = entrada.nextInt();
        System.out.print("Digite el precio de los autos: ");
        precioAuto = entrada.nextFloat();
        
        salarioFinal = salarioMes + (nAutosVendidos*150) + (0.05f*precioAuto*nAutosVendidos);
        
        System.out.println("\nEl salario es: "+salarioFinal);
    }
    
}
