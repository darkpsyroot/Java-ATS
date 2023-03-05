/*
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo 
    cual tendremos 2 clases (Cliente y Cuenta). Considerar que un cliente se caracteriza
    por su nombre, apellido y DNI. El cliente puede consultar saldo, así como ingresar y
    retirar dinero de sus cuentas. Además cada cuenta se caracteriza por un número de 
    cuenta y un saldo.
*/
package Ejercicio7;

import java.util.Scanner;

public class Principal {
    public static int buscarNumeroCuenta(int n,Cuenta cuentas[]){
        //Búsqueda secuencial
        int i=0,indice = 0;
        boolean encontrado = false;
        
        while((i<cuentas.length) && (encontrado == false)){
            if(cuentas[i].getNumeroCuenta() == n){
                encontrado = true;
                indice = i;
            }
            i++;
        }
        
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido,dni;
        int numeroCuentas,opcion,numeroCuenta,indiceCuenta;
        Cliente cliente;
        Cuenta cuentas[];
        double saldo,cantidad;
        
        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Digite el dni del cliente: ");
        dni = entrada.nextLine();
        System.out.print("Digite el numero de cuentas del cliente: ");
        numeroCuentas = entrada.nextInt();
                        
        cuentas = new Cuenta[numeroCuentas];
                        
        for(int i=0;i<cuentas.length;i++){
            System.out.println("\nDigite los datos de la cuenta "+(i+1)+":");
            System.out.print("Digite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();
                            
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }
        
        cliente = new Cliente(nombre, apellido, dni, cuentas);
        
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ingresar dinero en cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar dinero de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion de menu: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.print("\nDigite el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(numeroCuenta, cuentas);
                        
                        if(indiceCuenta == -1){
                            System.out.println("\nEl numero de cuenta no existe");
                        }
                        else{
                            System.out.print("\nDigite la cantidad de dinero a ingresar: ");
                            cantidad = entrada.nextDouble();
                            
                            cliente.ingresar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nDinero Ingresado correctamente");
                            System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                        }
                        break;
                case 2: System.out.print("\nDigite el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(numeroCuenta, cuentas);
                        
                        if(indiceCuenta == -1){
                            System.out.println("\nEl numero de cuenta no existe");
                        }
                        else{
                            System.out.print("\nDigite la cantidad de dinero retirar: ");
                            cantidad = entrada.nextDouble();
                            
                            if(cantidad > cliente.consultar_saldo(indiceCuenta)){
                                System.out.println("\nSaldo Insuficiente");
                            }
                            else{
                               cliente.retirar_dinero(indiceCuenta, cantidad);
                                System.out.println("\nDinero retirado correctamente");
                                System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta)); 
                            }                            
                        }
                        break;  
                case 3: System.out.print("\nDigite el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(numeroCuenta, cuentas);
                        
                        if(indiceCuenta == -1){
                            System.out.println("\nEl numero de cuenta no existe");
                        }
                        else{
                            System.out.println("\nSaldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                        }
                        break;
                case 4: break;
                default: System.out.println("Se equivoco de opcion de menu");
            }
            System.out.println("");
        }while(opcion != 4);
        
        
    }    
    
}
