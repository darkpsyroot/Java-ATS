
package Ejercicio4;

import java.util.Scanner;

public class Principal {
    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for(int i=1;i<atletas.length;i++){
            if(atletas[i].getTiempoCarrera() < tiempoCarrera){
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        String nombre;
        float tiempoCarrera;
        
        System.out.print("Digite el número de atletas a competir: ");
        nAtletas = entrada.nextInt();
        
        //Creamos los objetos para los n Atletas
        Atleta atletas[] = new Atleta[nAtletas];
        
        for(int i=0;i<atletas.length;i++){
            entrada.nextLine();
            System.out.println("\nDigite los datos para el atleta "+(i+1)+": ");
            System.out.print("Introduzca número de atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca nombre de Atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca tiempoCarrera: ");
            tiempoCarrera = entrada.nextFloat();
            
            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }
        
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador de la carrera es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
    }
}
