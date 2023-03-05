/*
    Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
    Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar 
    adecuado para que la tabla continúe ordenada.
*/
package ejercicio11_arreglos;

import java.util.Scanner;

public class Ejercicio11_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo de 10 elementos enteros
        boolean creciente = true;
        int numero,sitio_num=0,j=0;
        
        System.out.println("Llenar el arreglo");
        do{
           //Introducir los elementos del arreglo
           for(int i=0;i<5;i++){
               System.out.print((i+1)+". Digite un numero: ");
               arreglo[i] = entrada.nextInt();
           }
           
           //Comprobar si el arreglo introducido esta ordenado en forma creciente
           for(int i=0;i<4;i++){
               if(arreglo[i] < arreglo[i+1]){ //Creciente: 1-2-3
                   creciente = true;
               }
               if(arreglo[i] > arreglo[i+1]){ //Decreciente: 3-2-1
                   creciente = false;
                   break; 
               }
           }
           
           if(creciente == false){
               System.out.println("\nEl arreglo no esta en forma creciente, digite otra vez: \n");
           }
        }while(creciente == false); 
        
        System.out.print("\nDigite un numero para insertar: ");
        numero = entrada.nextInt();
        
        //Buscaremos el sitio donde deberia ir numero
        while(arreglo[j]<numero && j<5){
            sitio_num++; //Aumentamos la posicion para numero
            j++;
        }
        
        //Desplazaremos los elementos desde sitio_num hasta el final
        //para hacer un hueco para numero
        for(int i=4;i>=sitio_num;i--){
            arreglo[i+1] = arreglo[i]; 
        }
        
        //Por ultimo ponemos numero en su sitio para que siga ordenado
        arreglo[sitio_num] = numero; 
        
        System.out.print("\nEl arreglo queda: ");
        for(int i=0;i<6;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
        
    }
    
}
