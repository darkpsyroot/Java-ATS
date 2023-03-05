/*
    Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
    Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
*/
package ejercicio15_arreglos;

import java.util.Scanner;

public class Ejercicio15_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],numero;
        boolean creciente = true; 
        
        arreglo = new int[10]; //Creamos el arreglo con 10 posiciones
        
        do{
            //Pedimos el arreglo
            System.out.println("Rellene el arreglo: ");
            for(int i=0;i<10;i++){
                System.out.print(i+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //Verificamso si esta ordenado
            for(int i=0;i<9;i++){
                if(arreglo[i] < arreglo[i+1]){ //Creciente: 1-2-3..
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){ //Decreciente: 3-2-1
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, digita nuevamente: \n");
            }
        }while(creciente == false);
        
        //Guardamos el numero a buscar en el arreglo
        System.out.print("\nDIgite un número a buscar: ");
        numero = entrada.nextInt();
        
        //Ahora buscamos el numero en el arreglo
        int i=0;
        while(i<10 && arreglo[i]<numero){
            i++; //Aumentamos el iterador, y seguimos en el arreglo
        }
        
        if(i==10){ //Hemos llegado al final y no encontrado nada
            System.out.println("\nNúmero no encontrado");
        }
        else{
            if(arreglo[i] == numero){
                System.out.println("\nNúmero encontrado, en la posicion: "+i);
            }
            else{
                System.out.println("\nNúmero no encontrado");
            }
        }
    }
    
}
