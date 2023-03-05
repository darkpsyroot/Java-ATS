
package Ejercicio3;

import java.util.Scanner;

public class Principal {
    //Método para determinar cual coche es el mas barato
    public static int getIndiceCocheMBarato(Vehiculo coches[]){
        float precio; 
        int indice=0;
        
        precio = coches[0].getPrecio();
        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio; 
        int numeroVehiculos,indiceCocheMBarato;
        
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos un arreglo de objetos
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\nDatos del Vehiculo "+(i+1)+":");
            System.out.print("Introduzca marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceCocheMBarato = getIndiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceCocheMBarato].mostrarDatos());
    }
}
