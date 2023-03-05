/*
    Ordenamientos: Ordenamiento por Selección 
*/

package ordenamientoseleccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,min,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        
        arreglo = new int[nElementos]; //Creamos el arreglo con el numero de elementos exactos
        
        System.out.println("Rellene el arreglo: ");
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por Seleccion
        for(int i=0;i<nElementos;i++){
            min = i;
            for(int j=i+1;j<nElementos;j++){
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
        
        System.out.print("\nOrden Creciente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
}
