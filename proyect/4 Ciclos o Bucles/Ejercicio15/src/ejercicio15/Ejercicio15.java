/*
    Ejercicio 15:  Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
    alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
*/
package ejercicio15;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {
        int edad,sumaEdad=0,conteoMayor18=0,conteoMayor175=0;
        float altura,mediaAltura,mediaEdad,sumaAltura=0;
        
        for(int i=1;i<=5;i++){ //Nos piden para 5 alumnos
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+":\nDigite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+":\nDigite su altura: "));
            
            sumaEdad += edad; //Suma iterativa de edad
            sumaAltura += altura; //Suma iterativa de altura
            
            if(edad > 18){ //Si el alumno es mayor a 18
                conteoMayor18++; //Aumentamos el conteo para mayores de 18
            }
            if(altura > 1.75){ //Si supera la estatura de 1.75
                conteoMayor175++; //Aumentamos
            }
        }
        
        mediaEdad = (float) sumaEdad / 5;
        mediaAltura = (float) sumaAltura / 5; 
        
        System.out.println("La edad promedio: "+mediaEdad);
        System.out.println("La altura promedio es: "+mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18: "+conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75: "+conteoMayor175);
    }
    
}
