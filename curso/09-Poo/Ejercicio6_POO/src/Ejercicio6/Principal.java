
package Ejercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*
            numero1 = a + bi
            numero2 = c + di
        */
        int opcion,numero;
        double a,b,c,d;
        NumeroComplejo numero1,numero2,suma,multiplicacion;
        
        do{
            System.out.println("\t.:Operaciones con Números Complejos.:");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar 2 números complejos");
            System.out.println("3. Comparar 2 números complejos (iguales o no)");
            System.out.println("4. Multiplicar un número complejos por un entero");
            System.out.println("5. Salir");
            System.out.print("Digite la opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.println("\nDigite el primer numero complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.println("\nDigite el segundo numero complejo");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        suma = numero1.calcularSuma(numero2);
                        System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+"i");
                        break;
                case 2: System.out.println("\nDigite el primer numero complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.println("\nDigite el segundo numero complejo");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        multiplicacion = numero1.calcularProducto(numero2);
                        System.out.println("\nLa multiplicacion es: "+multiplicacion.getA()+" + "+multiplicacion.getB()+"i");
                        break;
                case 3: System.out.println("\nDigite el primer numero complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.println("\nDigite el segundo numero complejo");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        if(numero1.comprobarIgualdad(numero2)){
                            System.out.println("\nLos numeros complejos son iguales");
                        }
                        else{
                            System.out.println("\nLos numeros complejos NO son iguales");
                        }
                        break;
                case 4: System.out.println("\nDigite el numero complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.print("Ahora digite el valor entero: ");
                        numero = entrada.nextInt();
                        
                        numero1 = new NumeroComplejo(a, b);
                        multiplicacion = numero1.multicarPorEntero(numero);
                        System.out.println("\nLa multiplicacion es: "+multiplicacion.getA()+" + "+multiplicacion.getB()+"i");
                        break;
                case 5: break;
                default: System.out.println("Error, se equivoco de opcion de menu");
            }
            System.out.println("");
        }while(opcion != 5);
    }
}
