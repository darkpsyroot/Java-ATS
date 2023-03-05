/*
    Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por
    litro. Solo existen tres productos con precios:
        1- 0,6 $/litro
        2- 3 $/litro 
        3- 1,25 €/litro.
*/
package ejercicio18;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    public static void main(String[] args) {
        int codigo,litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro=0,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++){
            do{
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura N°"+i+"\nDigite su codigo: "));
            }while(codigo<1 || codigo>3); //el codigo debe estar entre 1-3            
            litros = Integer.parseInt(JOptionPane.showInputDialog("Factura N°"+i+"\nDigite la cantidad en litros: "));
        
            switch(codigo){
                case 1: precioLitro = 0.6f; break;
                case 2: precioLitro = 3; break;
                case 3: precioLitro = 1.25f; break;
            }
            
            importeFactura = (float) litros*precioLitro;
            facturacionTotal += importeFactura; //Suma iterativa para la facturacion total
            
            if(codigo == 1){ //Si es el artivulo 1 
                litrosArticulo1 += litros; //Suma iterativa de la cantidad de litros 
            }
            if(importeFactura > 600){ //Si el importe de factura supera a $600 
                conteoMas600++; //Aumentamos uno al contador
            }
        }
        
        System.out.println("Resumen de Ventas: ");
        System.out.println("Facturación Total: $"+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: "+litrosArticulo1);
        System.out.println("Facturas se emitieron de más de $600: "+conteoMas600);
    }
    
}
