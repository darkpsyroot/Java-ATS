/*
    Ordenamientos: Método Burbuja 
*/
package metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de elementos del arreglo: "));
        
        //Creamos el arreglo
        arreglo = new int[nElementos];
        
        //Pedimos el arreglo
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamos con el método Burbuja
        for(int i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j]>arreglo[j+1]){ //Número actual > Número siguiente - Cambio
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        //Por ultimo imprimimos el arreglo ordenado
        System.out.print("\nArreglo Ordenado: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
}
