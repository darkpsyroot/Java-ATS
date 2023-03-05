/*
    Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de 
    la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
*/
package ejercicio5_arreglos;

import java.util.Scanner;

public class Ejercicio5_Arreglos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 
       int a[],b[],c[];
       
       a = new int[10]; //Arreglo a[] de 10 elementos
       b = new int[10]; //Arreglo b[] de 10 elementos
       c = new int[20]; //c[] almacenara a[] y b[]
       
       //Pedimos el arreglo a
        System.out.println("Digitando el primer arreglo: ");
       for(int i=0;i<10;i++){
           System.out.print((i+1)+". Digite un numero: ");
           a[i] = entrada.nextInt();
       }
       
       //Pedimos el arreglo b
        System.out.println("\nDigitamos el segundo arreglo");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //Ahora mezclaremos los 2 arreglo en el arreglo c[]
        //para los arreglos a y b utilizaremos como indice i
        //y para el arreglo c utilizaremos como indice j
        int j=0;
        
        for(int i=0;i<10;i++){
            c[j] = a[i]; //1°A, 2°B,...
            j++; 
            c[j] = b[i]; //1°B, 2°B,...
            j++;
        }
        
        System.out.print("\nEl tercer arreglo es: ");
        for(int i=0;i<20;i++){
            System.out.print(c[i]+" ");
        }
        
        System.out.println();
    }
    
}
