/*
    Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo el país. 
    Cada sucursal esta definida por su número de sucursal, dirección y ciudad. Para calcular el 
    precio que cuesta enviar cada paquete, las sucursales tienen en cuenta el precio del paquete y 
    la prioridad, sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es alta y 
    20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona 
    que lo envía.
*/
package Ejercicio8;

import java.util.Scanner;

public class Principal {
    public static int buscarNumeroPaquete(Paquete p[],int numeroPaquete,int contadorPaquete){
        int indice = 0;
        boolean encontrado = false;
        
        for(int i=0;i<contadorPaquete;i++){
            if(p[i].getNumeroPaquete() == numeroPaquete){
                encontrado = true;
                indice = i;
            }
        }
        
        if(encontrado == false){
            indice = -1;
        }
        
        return indice;
    }
    
    public static int buscarNumeroSucursal(Sucursal t[],int numeroSucursal,int contadorSucursal){
        int indice=0;
        boolean encontrado =false;
        
        for(int i=0;i<contadorSucursal;i++){
            if(t[i].getNumeroSucursal() == numeroSucursal){
                encontrado = true;
                indice = i;
            }
        }
        
        if(encontrado == false){
            indice = -1;
        }
        
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int contadorSucursal=0,contadorPaquete=0,opcion;
        int numeroSucursal,indiceSucursal,numeroPaquete,prioridad,indicePaquete;
        String direccion,ciudad,dni;
        double peso;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];
        
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Crear nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las surcursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Difite la opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.print("\nDigite el numero de sucursal: ");
                        numeroSucursal = entrada.nextInt();
                        entrada.nextLine(); //limpiar el buffer
                        System.out.print("Digite direccion: ");
                        direccion = entrada.nextLine();
                        System.out.print("Digite ciudad: ");
                        ciudad = entrada.nextLine();
                        sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                        contadorSucursal++;
                        break;
                case 2: System.out.print("\nDigite el numero de Sucursal: ");
                        numeroSucursal = entrada.nextInt();
                        indiceSucursal = buscarNumeroSucursal(sucursal, numeroSucursal,contadorSucursal);
                        
                        if(indiceSucursal == -1){
                            System.out.println("La sucursal no existe");
                        }
                        else{
                            System.out.print("\nDigite numero de paquete: ");
                            numeroPaquete = entrada.nextInt();
                            entrada.nextLine();
                            System.out.print("Digite DNI: ");
                            dni = entrada.nextLine();
                            System.out.print("Digite peso: ");
                            peso = entrada.nextDouble();
                            System.out.print("Digite prioridad (0=normal, 1=alta, 2= express): ");
                            prioridad = entrada.nextInt();
                            
                            paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
                            
                            System.out.println("\nEl precio es: $"+sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]));
                            
                            contadorPaquete++;
                        }
                        break;
                case 3: System.out.print("\nDigite el numero de la sucursal: ");
                        numeroSucursal = entrada.nextInt();
                        
                        indiceSucursal = buscarNumeroSucursal(sucursal, numeroSucursal,contadorSucursal);
                        
                        if(indiceSucursal == -1){
                            System.out.println("La sucursal no exite");
                        }
                        else{
                            System.out.println("\nLos datos de la sucursal son: ");
                            System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                        }
                        break;
                case 4: System.out.print("\nDigite el numero de Paquete: ");
                        numeroPaquete = entrada.nextInt();
                        
                        indicePaquete = buscarNumeroPaquete(paquete, numeroPaquete,contadorPaquete);
                        
                        if(indicePaquete == -1){
                            System.out.println("El paquete no existe");
                        }
                        else{
                            System.out.println("Los datos del paquete son: ");
                            System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                        }
                        break;
                case 5: 
                        for(int i=0;i<contadorSucursal;i++){
                            System.out.println("\nMostrando datos de la Sucursal N°"+(i+1)+":");
                            System.out.println(sucursal[i].mostrarDatosSucursal());
                        }
                        break;
                case 6: 
                        for(int i=0;i<contadorPaquete;i++){
                            System.out.println("\nMostrando datos del paquete N°"+(i+1)+":");
                            System.out.println(paquete[i].mostrarDatosPaquete());
                        }
                        break;
                case 7: break;
                default: System.out.println("Se equivoco de opcion de menu"); break;
            }
            System.out.println("");
        }while(opcion != 7);
    }

    
}
