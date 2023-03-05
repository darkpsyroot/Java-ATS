
package Proyecto_Aeropuerto;

import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int numAeropuertos = 4; //Numero de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];
    
    public static void main(String []args){

        insertarDatosAeropuerto(aeropuertos); 
        menu();
    }
    
    public static void menu(){
        int opcion;
        String nombreAeropuerto,nombreCompañia,origen,destino;
        Aeropuerto aeropuerto;
        Compañia compañia;
        
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ver aeropuertos (Publicos o Privados)");
            System.out.println("2. Mostrar empresas(Privados) o subvencion(Publicos) - Aeropuertos");
            System.out.println("3. Mostrar compañias de un determinado aeropuerto");
            System.out.println("4. Listar vuelos de una compañia");
            System.out.println("5. Mostrar vuelo de origen a destino");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: mostrarDatosAeropuertos(aeropuertos);//Ver aeropuertos
                        break;
                case 2: mostrarPatrocinio(aeropuertos); //Mostrar empresas(Privados) o subvencion(Publicos) - Aeropuertos
                        break;
                case 3: //Mostrar compañias de un determinado aeropuerto
                        entrada.nextLine();
                        System.out.print("\nIntroduzca nombre Aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if(aeropuerto==null){
                            System.out.println("El aeropuerto no existe");
                        }
                        else{
                            mostrarCompañias(aeropuerto);
                        }
                        break;
                case 4: //Listar vuelos de una compañia
                        entrada.nextLine();
                        System.out.print("\nIntroduzca nombre del aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        
                        if(aeropuerto==null){
                            System.out.println("El Aeropuerto no existe");
                        }
                        else{
                            System.out.print("Introduzca nombre de la compañia: ");
                            nombreCompañia = entrada.nextLine();
                            compañia = aeropuerto.getCompañia(nombreCompañia);
                            if(compañia==null){
                                System.out.println("La compañia no existe");
                            }
                            else{
                                mostrarVuelos(compañia);
                            }
                        }
                        break;
                case 5: //Mostrar vuelo de origen a destino
                        entrada.nextLine();
                        System.out.print("\nIntroduzca ciudad origen: ");
                        origen = entrada.nextLine();
                        System.out.print("Introduzca ciudad destino: ");
                        destino = entrada.nextLine();
                        mostrarVueloOrigenDestino(origen, destino, aeropuertos);
                        break;
                case 6: break;
                default: System.out.println("Error! se confundio de opcion de menu");
            }
            System.out.println("");
        }while(opcion!=6);
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(80000000, "Jorge Chavez", "Lima", "Peru");
        aero[0].insertarCompañia(new Compañia("Iberia"));
        aero[0].insertarCompañia(new Compañia("Lufthansa"));
        aero[0].getCompañia("Iberia").insertarVuelo(new Vuelo("IB2022","Lima","Londres",287.50,150));
        aero[0].getCompañia("Iberia").getVuelo("IB2022").insertarPasajero(new Pasajero("Emilio","384794GH","Española"));
        aero[0].getCompañia("Iberia").getVuelo("IB2022").insertarPasajero(new Pasajero("Arturo","77999EE","Peruana"));
        
        aero[1] = new AeropuertoPrivado("Central Ciudad Real","Ciudad Real","España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        String empresas[] = {"Cobresol","Anguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025","Madrid","Buenos Aires",150.50,120));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Juan Pablo","EA384794","Mexicana"));
        
        aero[2] = new AeropuertoPublico(20000000,"Aeropuerto Bogota","Bogota","Colombia");
        aero[2].insertarCompañia(new Compañia("AirAmerica"));
        aero[2].insertarCompañia(new Compañia("VuelaBogota"));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE030","Bogota","Lima",130.90,110));
        aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Damaris","000AA4G5","Colombiana"));
        
        aero[3] = new AeropuertoPublico(40000000,"Aeropuerto Mexico","Mexico","Mexico");
        aero[3].insertarCompañia(new Compañia("AeroMexico"));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2040","Mexico","Nueva York",130.90,140));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2042","Mexico","Lima",100.80,150));
        aero[3].getCompañia("AeroMexico").getVuelo("IB2040").insertarPasajero(new Pasajero("Maria","AA4794H","Inglesa"));
    }
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for(int i=0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){ //con instanceof conocemos si un objeto es de una clase determinada
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }
            else{
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }
    
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        
        for(int i=0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getEmpresas();
                System.out.println("Aeropuerto Privado: "+aeropuertos[i].getNombre());
                System.out.println("Empresas: ");
                for(int j=0;j<empresas.length;j++){
                    System.out.println(empresas[j]);
                }
            }
            else{
                System.out.println("Aeropuerto Publico: "+aeropuertos[i].getNombre());
                System.out.println("Subvencion: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre,Aeropuerto aeropuertos[]){
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero=null;
        while((!encontrado) && (i<aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        
        return aero;
    }
    
    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("\nCompañias que operan en el aeropuerto: "+aeropuerto.getNombre());
        for(int i=0;i<aeropuerto.getNumCompañia();i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }
    
    public static void mostrarVuelos(Compañia compañia){
        Vuelo vuelo;
        
        System.out.println("\nVuelos para la compañia: "+compañia.getNombre());
        for(int i=0;i<compañia.getNumVuelo();i++){
            vuelo = compañia.getVuelo(i);
            System.out.println("Identificador: "+vuelo.getIdentificador());
            System.out.println("Origen: "+vuelo.getCiudadOrigen());
            System.out.println("Destino: "+vuelo.getCiudadDestino());
            System.out.println("Precio: $"+vuelo.getPrecio());
            System.out.println("");
        }
    }
    
    public static Vuelo[] buscarVueloOrigenDestino(String origen,String destino,Aeropuerto aeropuerto[]){
        Vuelo vuelo = null;
        int contador=0;
        Vuelo listaVuelos[];
        
        for(int i=0;i<aeropuerto.length;i++){
            for(int j=0;j<aeropuerto[i].getNumCompañia();j++){
                for(int k=0;k<aeropuerto[i].getCompañia(j).getNumVuelo();k++){
                    vuelo = aeropuerto[i].getCompañia(j).getVuelo(k);
                    if(origen.equals(vuelo.getCiudadOrigen()) && destino.equals(vuelo.getCiudadDestino())){
                        contador++;
                    }
                }
            }
        }
        
        listaVuelos = new Vuelo[contador];
        int q=0;
        
        for(int i=0;i<aeropuerto.length;i++){
            for(int j=0;j<aeropuerto[i].getNumCompañia();j++){
                for(int k=0;k<aeropuerto[i].getCompañia(j).getNumVuelo();k++){
                    vuelo = aeropuerto[i].getCompañia(j).getVuelo(k);
                    if(origen.equals(vuelo.getCiudadOrigen()) && destino.equals(vuelo.getCiudadDestino())){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        
        return listaVuelos;
    }
    
    public static void mostrarVueloOrigenDestino(String origen,String destino,Aeropuerto aeropuerto[]){
        Vuelo vuelos[];
        vuelos = buscarVueloOrigenDestino(origen, destino, aeropuerto);
        if(vuelos.length == 0){
            System.out.println("No existen vuelos");
        }
        else{
            System.out.println("\nVuelos Encontrados:");
            for(int i=0;i<vuelos.length;i++){
                System.out.println("Identificador: "+vuelos[i].getIdentificador());
                System.out.println("Ciudad Origen: "+vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: "+vuelos[i].getCiudadDestino());
                System.out.println("Precio: $"+vuelos[i].getPrecio());
            }
        }
    }
}
