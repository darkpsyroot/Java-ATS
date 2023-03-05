/*
    Ordenamientos: Ordenamiento por Inserción
*/
package ordenamientoporinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoPorInsercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        
        arreglo = new int[nElementos]; //Creamos el arreglo con el numero de elementos exactos
        
        System.out.println("Digite el arreglo: ");
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por Inserción
        for(int i=0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];
            while((pos>0) && (arreglo[pos-1] > aux)){ //numeroIzq > numeroActual
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        
        System.out.print("\nArreglo ordenado: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
}
