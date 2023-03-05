/*
    Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la
    diagonal principal sean 1 y el resto 0.
*/
package ejercicio4_matrices;

public class Ejercicio4_Matrices {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
        
        //Ahora mostramos la matriz
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
