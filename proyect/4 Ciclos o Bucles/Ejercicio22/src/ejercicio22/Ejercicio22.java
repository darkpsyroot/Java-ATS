/*
    Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
*/
package ejercicio22;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {
        float calificacion;
        boolean hay_suspenso = false;
        
        for(int i=1;i<=5;i++){
            do{
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));
            }while(calificacion<0 || calificacion>10);
            
            if(calificacion < 5){
                hay_suspenso = true;
            }
        }
        
        if(hay_suspenso == true){
            System.out.println("Si hay alumnos suspensos");
        }
        else{
            System.out.println("No hay alumnos suspensos");
        }
    }
    
}
