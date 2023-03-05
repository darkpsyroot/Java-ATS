
package clasefile;

import java.io.File;

public class ClaseFile {

    public static void main(String[] args) {
        File directorio = new File("carpetaPrueba");
        
        if(directorio.exists()){ //Si el archivo existe
            System.out.println("El directorio si existe");
            System.out.println("Ruta Absoluta: "+directorio.getAbsolutePath());
            System.out.println("¿Es un directorio? "+ directorio.isDirectory());
            System.out.println("¿Se puede leer? "+directorio.canRead());
        }
        else{
            System.out.println("No existe");
        }
    }
    
}
