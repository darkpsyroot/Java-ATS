/*
    Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora 
        que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, 
        producto y división) con valores numéricos enteros. El usuario debe especificar 
        la operación con el primer carácter del primer parámetro de la línea de comandos:
        S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d 
        para la división.
*/
package ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {
        int numero1,numero2,suma,resta,mult,div;
        char opcion;
        
        //Pedimos los numeros
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        //Pedimos la operacion aritmética
        opcion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);
        
        //Calculamos la operación
        switch(opcion){
            case 's':
            case 'S': suma = numero1+numero2;
                      JOptionPane.showMessageDialog(null,"La suma es: "+suma);
                      break;
            case 'r':
            case 'R': resta = numero1-numero2;
                      JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                      break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero1*numero2;
                      JOptionPane.showMessageDialog(null,"La multiplicacion es: "+mult); 
                      break;
            case 'd':
            case 'D': div = numero1/numero2;
                      JOptionPane.showMessageDialog(null,"La división es: "+div);
                      break;
            default: JOptionPane.showMessageDialog(null,"Se confundio de operacion aritmetica");
                     break;                       
        }
    }
    
}
