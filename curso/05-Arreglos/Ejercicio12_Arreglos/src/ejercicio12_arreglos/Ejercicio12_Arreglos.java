/*
    Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros y una 
    posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar 
    huecos.
*/
package ejercicio12_arreglos;

import java.util.Scanner;

public class Ejercicio12_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo para 10 elementos numericos
        int posicion;
        
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ahora, pedimos la posicion del elemento a eliminar
        do{
            System.out.print("\nDigite una posicion del arreglo(0-9): ");
            posicion = entrada.nextInt();
        }while(posicion<0 || posicion>9);
        
     
       //Vamos a eliminar el elemento de la posicion sin dejar hueco
       for(int i=posicion;i<9;i++){ //0-1-3-4-5-6
           arreglo[i] = arreglo[i+1];
       }
       
        System.out.println("\nEl arreglo queda");
        for(int i=0;i<9;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
    }
    
}
