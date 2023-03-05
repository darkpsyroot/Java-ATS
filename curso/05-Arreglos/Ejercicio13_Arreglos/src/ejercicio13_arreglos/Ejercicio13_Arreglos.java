/*
    Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares 
    de la primera, y a continuación los elementos impares.
*/
package ejercicio13_arreglos;

import java.util.Scanner;

public class Ejercicio13_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo para 10 elementos enteros
        int conteo_pares=0,conteo_impares=0;
        
        System.out.println("Llenamos el arreglo: ");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            
            if(arreglo[i] % 2 == 0){ //Si el numero es par
                conteo_pares++;
            }
            else{ //Si el numero es impar
                conteo_impares++;
            }
        }
        
        int par[] = new int[conteo_pares]; //Creamos el arreglo para los numeros pares
        int impar[] = new int[conteo_impares]; //y para los numeros impares
    
        conteo_pares=0;
        conteo_impares=0;
        
        for(int i=0;i<10;i++){
           if(arreglo[i] % 2 == 0){ //Si el numero es par
               par[conteo_pares] = arreglo[i];
               conteo_pares++;
           }
           else{ //Si el numero es impar
               impar[conteo_impares] = arreglo[i];
               conteo_impares++;
           }
        }
        
        System.out.println("\nTabla pares: ");
        for(int i=0;i<conteo_pares;i++){
            System.out.print(par[i]+" - ");
        }
        System.out.println("");
    
        System.out.println("\nTabla impares: ");
        for(int i=0;i<conteo_impares;i++){
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");
    }
    
}
