/*
    Ejercicio 16: Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un 
    centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas 
    del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media 
    del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee 
    por teclado).
*/

package ejercicio16_arreglos;

import java.util.Scanner;

public class Ejercicio16_Arreglos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float primer[],segundo[],tercer[];
       float sumaPrimer=0,sumaSegundo=0,sumaTercer=0,sumaAlumno=0;
       float promedioPrimer,promedioSegundo,promedioTercer,promedioAlumno;
       int posicion;
       
       primer = new float[5];
       segundo = new float[5];
       tercer = new float[5];
       
        System.out.println("Digite las notas del primer trimestre: ");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            primer[i] = entrada.nextFloat();
            
            sumaPrimer += primer[i]; //Sumamos las notas del primer trimestre
        }
        
        System.out.println("\nDigite las notas del segundo trimestre: ");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            segundo[i] = entrada.nextFloat();
            
            sumaSegundo += segundo[i];
        }
        
        System.out.println("\nDigite las notas del tercer trimestre: ");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            tercer[i] = entrada.nextFloat();
            
            sumaTercer += tercer[i];
        }
        
        //Sacamos el promedio de las notas de cada trimestre
        promedioPrimer = sumaPrimer /5;
        promedioSegundo = sumaSegundo/5;
        promedioTercer = sumaTercer/5;
        
        //Ahora pedimos la posicion de un alumno
        do{
           System.out.print("\nDigite la posicion del alumno (0-4): ");
           posicion = entrada.nextInt();
        }while(posicion<0 || posicion>4);
        
        sumaAlumno = primer[posicion]+segundo[posicion]+tercer[posicion];
        promedioAlumno = sumaAlumno/3;
        
        System.out.println("\nImprimiendo Datos requeridos");
        System.out.println("Promedio del primer trimestre: "+promedioPrimer);
        System.out.println("Promedio del segundo trimestre: "+promedioSegundo);
        System.out.println("Promedio del tercer trimestre: "+promedioTercer);
        System.out.println("Promedio del Alumno: "+promedioAlumno);
    }
    
}
