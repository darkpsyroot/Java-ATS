
package Ejercicio1;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Cuadrilatero c1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
        
        if(lado1 == lado2){ //Es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else{ //Es otro cuadrilatero
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro del cuadrilatero es: "+c1.getPerimetro());
        System.out.println("El area del cuadrilatero es: "+c1.getArea());
    }
}
