/*
    Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente. 
    Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/
package ejercicio14_arreglos;

import java.util.Scanner;

public class Ejercicio14_Arreglos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int a[],b[],c[];
       boolean creciente=true;
       
       a = new int[10]; //Creamos el arreglo a con 10 elementos
       b = new int[10]; //Igual con el arreglo b
       
        System.out.println("Digite el primer arreglo: ");
        do{
            //Digitamos el arreglo
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Digite un numero: ");
                a[i] = entrada.nextInt();
            }
            //Comprobamos si esta ordenado
            for(int i=0;i<9;i++){
                if(a[i] < a[i+1]){ //Creciente: 1-2-3...
                    creciente  = true;
                }
                if(a[i] > a[i+1]){ //Decreciente: 3-2-1
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado, digite de nuevo: ");
            }
        }while(creciente == false);
        
         System.out.println("\nDigite el segundo arreglo: ");
        do{
            //Digitamos el arreglo
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Digite un numero: ");
                b[i] = entrada.nextInt();
            }
            //Comprobamos si esta ordenado
            for(int i=0;i<9;i++){
                if(b[i] < b[i+1]){ //Creciente: 1-2-3...
                    creciente  = true;
                }
                if(b[i] > b[i+1]){ //Decreciente: 3-2-1
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado, digite de nuevo: ");
            }
        }while(creciente == false);
        
        c = new int[20]; //Creamos el arreglo c con 20 elementos
        
        int i=0; //El iterador i es para el arreglo a
        int j=0; //El iterador j es para el arreglo b
        int k=0; //El iterador k es para el arreglo c
        
        //Comenzamos a mezclar a y b dentro de c
        while(i<10 && j<10){
            if(a[i] < b[j]){ //Si el elemento de a es menor
                c[k] = a[i]; //Copiamos el elemento de a
                i++; //Incrementamos i para tomar el siguiente elemento de a
            }
            else{
                c[k] = b[j]; //Copiamos el elemento de b
                j++; //Incrementamos j para tomar el siguiente elemento de b
            }
            k++; //Incrementamos k para copiar en la siguiente posicion de c
        }
        
        //Cuando salimos del while es porque algun arreglo(a o b) ha llegado al final
        
        if(i==10){ //Significa que hemos copiado todo el arreglo a, falta el b
            while(j<10){
                c[k] = b[j]; //Copiamos el arreglo b
                j++; //Incrementamos j para tomar el siguiente elemento de b
                k++; //Incrementamos k para copiar en la siguiente posicion de c
            }
        }
        else{ //Significa que hemos copiado todo el arreglo b, falta el a
            while(i<10){
                c[k] = a[i]; //Copiamos el arreglo a
                i++; //Incrementamos i para tomar el siguiente elemento de a
                k++; //Incrementamos k para copiar en la siguiente posicion de c
            }
        }
        
        //Ahora que a y b estan en c(ordenado), podemos imprimir el arreglo c
        System.out.println("\nLa fusión de ambos arreglos ordenados es: ");
        for(k=0;k<20;k++){
            System.out.print(c[k]+ " - ");
        }
        System.out.println("");
    }
    
}
