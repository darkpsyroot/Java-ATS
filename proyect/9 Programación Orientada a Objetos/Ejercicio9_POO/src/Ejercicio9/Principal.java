/*
    Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos)
    el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final
    mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 

    
*/
package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        leerPoligonos();
        //Mostrar el area y los datos de cada poligono
        mostrarResultados();
    }
    
    public static void leerPoligonos(){
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Digite el tipo de poligono:\n"+
                        "1. Triangulo\n2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();  
            }while(opcion<1 || opcion>2);
            
            switch(opcion){
                case 1: leerTriangulos();
                        break;
                case 2: leerRectangulos();
                        break;
            }
            
            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s' || respuesta=='S');
    }
    
    public static void leerTriangulos(){
        double lado1,lado2,lado3;
        
        System.out.print("\nDigite el lado1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3 del triangulo: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        //Guardamos el triangulo dentro de nuestro arreglo de poligonos
        poligono.add(triangulo);
    }
    
    public static void leerRectangulos(){
        double lado1,lado2;
        
        System.out.print("\nDigite el lado1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectangulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        //Guardamos el rectangulo dentro de nuestro arreglo de poligonos
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        //Recorremos el arreglo para mostrar los resultados
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.area());
            System.out.println("");
        }
    }
}
