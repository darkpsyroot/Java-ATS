/*
    Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden 
    inverso al introducido.
*/
package ejercicio2_arreglos;

import java.util.Scanner;

public class Ejercicio2_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos del arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nLos elementos del arreglo en orden inverso son:");
        for(int i=4;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
    
}
