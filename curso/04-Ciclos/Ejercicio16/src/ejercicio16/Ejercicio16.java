/*
    Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de
    dicho número
*/
package ejercicio16;

import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }while(numero<0 || numero>10);
        
        System.out.println("Tabla de multiplicar de "+numero+":");
        
        for(int i=1;i<=12;i++){
            System.out.println(numero+" * "+i+" = "+numero*i);
        }
    }
    
}
