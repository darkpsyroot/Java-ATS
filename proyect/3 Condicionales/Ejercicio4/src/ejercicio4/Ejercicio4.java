/*
    Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes 
	cuya compra supere los $300 
	¿Cual será la cantidad que pagara una persona por su compra? 
*/
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        float precio,descuento; 
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio de compra: "));
        
        if(precio > 300){
            descuento = precio * 0.20f;
            precio -= descuento;
            JOptionPane.showMessageDialog(null,"El precio final es: "+precio);
        }
        else{
            JOptionPane.showMessageDialog(null,"El precio final es: "+precio);
        }
    }
    
}
