/*
    Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.

    1 2 3
    4 5 6
    7 8 9
*/
package ejercicio5_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5_Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol,sumaFilas,sumaCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int[nFilas][nCol]; //Declaramos la matriz
        
        System.out.println("Rellene la matriz");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Ahora procedemos a sumar las filas
        for(int i=0;i<nFilas;i++){
            sumaFilas=0;
            for(int j=0;j<nCol;j++){
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de las fila["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        //Por ultimo sumamos las columnas
        for(int j=0;j<nCol;j++){
            sumaCol = 0;
            for(int i=0;i<nFilas;i++){
                sumaCol += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+sumaCol);
        }
        System.out.println("");
    }
    
}
