/*
    Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
    facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
    Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
    y cuantas facturas se emitieron de más de $600.
*/
package ejercicio17;

import javax.swing.JOptionPane;

public class Ejercicio17 {

    public static void main(String[] args) {
        int codigo,litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura N°"+i+"\nDigite su codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Factura N°"+i+"\nDigite la cantidad en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Factura N°"+i+"\nDigite el precio por litro: "));
            
            importeFactura = (float) litros*precioLitro; //Sacamos el importe por cada factura
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
