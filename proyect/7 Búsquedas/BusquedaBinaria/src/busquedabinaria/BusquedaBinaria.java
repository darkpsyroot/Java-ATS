/*
    Búsqueda Binaria
*/
package busquedabinaria;

import javax.swing.JOptionPane;

public class BusquedaBinaria {

    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5};
        int dato,inf,sup,mitad,i;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));
        
        //Busqueda Binaria
        inf=0;
        sup=5;
        i=0;
        
        mitad = (inf+sup)/2;
        while(inf<=sup && i<5){
            if(arreglo[mitad] == dato){
                band = true;
                break;
            }
            if(arreglo[mitad]>dato){
                sup = mitad;
                mitad = (inf+sup)/2;
            }
            if(arreglo[mitad]<dato){
                inf = mitad;
                mitad = (inf+sup)/2;
            }
            i++;
        }
        
        if(band == true){
            JOptionPane.showMessageDialog(null,"El numero ha sido encontrado en la posicion: "+mitad);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no ha sido encontrado");
        }
    }
    
}
