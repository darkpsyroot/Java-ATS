
package archivosbinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosBinarios {

    private void escribirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            Persona persona1 = new Persona("Alejandro", 22);
            Persona persona2 = new Persona("Estefany",21);
            Persona persona3 = new Persona("Maria",22);
            
            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            
            escritura.close(); //Cerramos el archivo binario
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    private void añadirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin",true);
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            Persona persona1 = new Persona("Juan", 17);
            Persona persona2 = new Persona("Luz",24);
                        
            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            
            escritura.close(); //Cerramos el archivo binario
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    private void leerBinario(){
        Persona objetoPersona;
        
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){ //Recorremos el archivo binario
                objetoPersona = (Persona)lectura.readObject();
                objetoPersona.mostrarDatos();
            }
            
        } catch(EOFException ex){
            return; //Finalizó de leer todo el archivo binario
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    public static void main(String[] args) {
        ArchivosBinarios archivos = new ArchivosBinarios();
        
        //archivos.escribirBinario();
        archivos.añadirBinario();
        archivos.leerBinario();
    }
    
}
