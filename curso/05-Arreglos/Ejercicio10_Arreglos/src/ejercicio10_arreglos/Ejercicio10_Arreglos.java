/*
    Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros, 
    y desplazar N posiciones en el arreglo (N es introducido por el usuario).
*/
package ejercicio10_arreglos;

import java.util.Scanner;

public class Ejercicio10_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int arreglo[] = new int[10]; //Creamos el arreglo para 10 elementos enteros
        int n_posiciones,ultimo;
        
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("\nDigite la cantidad de posiciones a desplazar: ");
        n_posiciones = entrada.nextInt();
        
        for(int vuelta=1;vuelta<=n_posiciones;vuelta++){
            ultimo = arreglo[9]; //Guardamos el ultimo elemento del arreglo
            for(int i=8;i>=0;i--){ //Avanzamos una posicion en el arreglo
                arreglo[i+1] = arreglo[i];
            }
            arreglo[0] = ultimo; //por ultimo ponemos el ultimo elemento como primero
        }
        
        System.out.println("\nEl arreglo queda: ");
        for(int i=0;i<10;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
    }
    
}
