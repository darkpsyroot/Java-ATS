/*
    Ejercicio 10: Crear un programa para simular un equipo de futbol (futbolista, 
    entrenador y doctor), para lo cual tendremos lo siguiente: 

    - Una super clase Persona, que tendrá los siguientes datos: nombre, apellido, edad.
    - La sub clase Futbolista tendrá los siguientes datos: dorsal y posición.
    - La sub clase Entrenador tendrá de dato la estrategia que utiliza.
    - La sub clase Doctor, la titulación y los años de experiencia.
    
    Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo, 
    entrenamiento, partido de futbol, planificar entrenamiento, entrevista, 
    curar lesión.
*/
package Ejecicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Persona> persona = new ArrayList<Persona>();

    static Persona futbolista1 = new Futbolista(9,"Delantero","Gonzalo","Higuain",29);
    static Persona futbolista2 = new Futbolista(21,"Delantero","Paulo","Dybala",23);
    static Persona entrenador = new Entrenador("Defensiva","Massimiliano","Allegri",49);
    static Persona medico = new Medico("Licenciado en fisioterapia",20,"Alex","Marroni",55);
    
    public static void main(String[] args){        
       persona.add(futbolista1);
       persona.add(futbolista2);
       persona.add(entrenador);
       persona.add(medico);
       
       menu();
    }
    
   public static void menu(){
       int opcion; 
       do{
           System.out.println("\t.:MENU:.");
           System.out.println("1. Viaje de equipo");
           System.out.println("2. Entrenamiento");
           System.out.println("3. Partido de futbol");
           System.out.println("4. Planificar entrenamiento");
           System.out.println("5. Dar entrevista");
           System.out.println("6. Curar lesion");
           System.out.println("7. salir");
           System.out.print("Opcion: ");
           opcion = entrada.nextInt();
           
           switch(opcion){
               case 1: System.out.println("");
                       viajeEquipo(); //Viaje de equipo
                       break;
               case 2: System.out.println("");
                       entrenamientoEquipo(); //Entrenamiento
                       break;
               case 3: System.out.println("");
                       partidoFutbolEquipo(); //partido de futbol
                       break;
               case 4: System.out.println("");
                       planificarEntrenamientoEquipo();//Planificar entrenamiento
                       break;
               case 5: System.out.println("");
                       darEntrevistaEquipo();//Dar entrevista
                       break;
               case 6: System.out.println("");
                       curarLesionEquipo();//Curar lesion
                       break;
               case 7: break;
               default: System.out.println("Se equivoco de opcion de menu"); break;
           }
           System.out.println("");
       }while(opcion!=7);
   }
   
   public static void viajeEquipo(){  
       for(Persona equipo: persona){
           System.out.print(equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
           equipo.viajar();
       }
   }
   
   public static void entrenamientoEquipo(){
       for(Persona equipo: persona){
           System.out.print(equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
           equipo.entrenamiento();
       }
   }
   
   public static void partidoFutbolEquipo(){
       for(Persona equipo: persona){
           System.out.print(equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
           equipo.partidoFutbol();
       }
   }
   
   public static void planificarEntrenamientoEquipo(){
       System.out.print(entrenador.getNombre()+" "+entrenador.getApellidos()+" -> ");
       ((Entrenador)entrenador).planificarEntrenamiento();
   }
   
   public static void darEntrevistaEquipo(){
       System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellidos()+" -> ");
       ((Futbolista)futbolista1).entrevista();
       System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellidos()+" -> ");
       ((Futbolista)futbolista2).entrevista();
   }
   
   public static void curarLesionEquipo(){
       System.out.print(medico.getNombre()+" "+medico.getApellidos()+" -> ");
       ((Medico)medico).curarLesion();
   }
}
