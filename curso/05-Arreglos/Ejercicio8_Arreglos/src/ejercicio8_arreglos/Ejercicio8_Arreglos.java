/*
    Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer 
    mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
    posición indicada, desplazando los que estén detrás.
*/
package ejercicio8_arreglos;

import java.util.Scanner;

public class Ejercicio8_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos un arreglo de 10 elementos enteros
        int numero,posicion;
        
        System.out.println("Llenar el arreglo");
        for(int i=0;i<8;i++){
            System.out.print((i)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("\nDigite un nuevo numero: ");
        numero = entrada.nextInt();
        //Pedimos una posicion en el rango de 0-8
        do{
            System.out.print("Digite una posicion: ");
            posicion = entrada.nextInt();
        }while(posicion<0 || posicion>8);
        
        //Corremos una posicion los elementos de atras
        for(int i=7;i>=posicion;i--){
            arreglo[i+1] = arreglo[i];
        }
        //Insertamos el numero en la posicion 
        arreglo[posicion] = numero;
        
        System.out.println("\nEl arreglo queda: ");
        for(int i=0;i<9;i++){
            System.out.println("Posicion "+i+": "+arreglo[i]);
        }
    }
    
}
