/*
    Ejercicio 6: Leer los datos correspondiente a dos tablas de 12 elementos numéricos, 
    y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A,
    otros 3 de la B, etc.
*/
package ejercicio6_arreglos;

import java.util.Scanner;

public class Ejercicio6_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        
        a = new int[12]; //Arreglo a[] de 12 elementos
        b = new int[12]; //Arreglo b[] de 12 elementos
        c = new int[24]; //Arreglo c[] contrendra a a[] y b[]
        
        //Pedimos el arreglo a
        System.out.println("Digite el primer arreglo: ");
        for(i=0;i<12;i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        //Pedimos el arreglo b
        System.out.println("\nDigite el segundo arreglo: ");
        for(i=0;i<12;i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //Ahora, mezclamos en el arreglo c[] 3-3 de a[] y b[]
        //el indice i sera para los arreglos a[] y b[]
        //y el indice j sera para el arreglo c[]
        
        i=0;
        j=0;
        
        while(i<12){
            //Copiamos 3 elementos de a[]
            for(int k=0;k<3;k++){
                c[j] = a[i+k];
                j++;
            }
            
            //Copiamos 3 elementos de b[]
            for(int k=0;k<3;k++){
                c[j] = b[i+k];
                j++;
            }
            
            //Como hemos copiado 3 de a[] y b[], incrementamos en 3 a i
            i+= 3;
        }
        
        System.out.print("\nEl arreglo resultante es: ");
        for(i=0;i<24;i++){
            System.out.print(c[i]+" - ");
        }
        System.out.println();
    }
    
}
