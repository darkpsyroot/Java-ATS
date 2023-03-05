
package Ejercicio5;

import java.util.Scanner;

public class Principal {
    public static int indiceMayorArea(Triangulo_Isosceles triangulos[]){
        double area;
        int indice = 0;
        area = triangulos[indice].obtenerArea();
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
                indice = i;
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int cantidadTriangulos,indiceMayor;
        
        System.out.print("Digite la cantidad de triangulos a ingresar: ");
        cantidadTriangulos = entrada.nextInt();
        
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[cantidadTriangulos];
        
        for(int i=0;i<triangulos.length;i++){
            System.out.println("\nDigite los datos del triangulo "+(i+1)+":");
            System.out.print("Digite la base del triangulo: ");
            base = entrada.nextDouble();
            System.out.print("Digite el lado del triangulo: ");
            lado = entrada.nextDouble();
        
            triangulos[i] = new Triangulo_Isosceles(base, lado);
            
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
            System.out.println("");
        }
        
        indiceMayor = indiceMayorArea(triangulos);
        System.out.println("Los datos del triangulo con mayor Area es: ");
        System.out.println(triangulos[indiceMayor].mostrarDatos());
    }
}
