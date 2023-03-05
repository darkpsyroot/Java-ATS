/*
    Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
*/
package ejercicio3_matrices;

import java.util.Scanner;

public class Ejercicio3_Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMatriz Original: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        int aux;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        
        System.out.println("\nMatriz Transpuesta");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
