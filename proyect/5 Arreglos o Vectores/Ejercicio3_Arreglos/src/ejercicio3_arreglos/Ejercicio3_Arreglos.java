/*
    Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación
    realizar la media de los números positivos, la media de los negativos y contar el 
    número de ceros.
*/
package ejercicio3_arreglos;

import java.util.Scanner;

public class Ejercicio3_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_positivos = 0,suma_negativos=0,media_positivos,media_negativos;
        int conteo_positivos = 0,conteo_negativos=0,conteo_ceros=0;
        
        System.out.println("Guardando los números en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i] == 0){
                conteo_ceros++;
            }
            else if(numeros[i] > 0){
                suma_positivos += numeros[i];
                conteo_positivos++;
            }
            else{
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }
        
        //Media de números positivos
        if(conteo_positivos==0){
            System.out.println("No se puede realizar la media de números positivos");
        }
        else{
            media_positivos = suma_positivos/conteo_positivos;
            System.out.println("La media de los números positivos es: "+media_positivos);
        }
        
        //Media de números negativos
        if(conteo_negativos == 0){
            System.out.println("No se puede realizar la media de numeros negativos");
        }
        else{
            media_negativos = suma_negativos/conteo_negativos;
            System.out.println("La media de los números negativos es: "+media_negativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }
    
}
