/*
    Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la 
    desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el 
    tercero y así sucesivamente. El último pasa a ser el primero.
*/
package ejercicio9_arreglos;

import java.util.Scanner;

public class Ejercicio9_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos un arreglo de 10 elementos enteros
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        ultimo = arreglo[9]; //Guardamos el ultimo elemento
        
        for(int i=8;i>=0;i--){ //desplazamos hacia abajo una posicion
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo; //El ultimo valor pasa a ser el primero
        
        System.out.println("\nEl arreglo queda");
        for(int i=0;i<10;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
    }
    
}
