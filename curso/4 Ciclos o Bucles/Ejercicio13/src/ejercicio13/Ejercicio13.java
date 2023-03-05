/*
    Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
    la cantidad de ceros.
*/
package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        int numero,cont_pos=0,cont_neg=0,cont_ceros=0,suma_pos=0,suma_neg=0;
        float media_pos,media_neg;
        
        for(int i=1;i<=10;i++){ //El bucle debe repetirse 10 veces
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero==0){ //Si el numero es cer
                cont_ceros++; //Aumentamos uno al contador de ceros
            }
            else if(numero>0){ //Si el numero es positivo
                suma_pos += numero; //Suma iterativa de positivos
                cont_pos++; //Conteo de positivos
            }
            else{ //Si el numero es negativo
                suma_neg += numero; //Suma iterativa de negativos
                cont_neg++; //Conteo de negativos
            }
        }
        
        System.out.println("La cantidad de ceros es: "+cont_ceros);
        
        //Tratamos con los positivos
        if(cont_pos==0){
            System.out.println("No se puede hacer la media de los positivos");
        }
        else{
            media_pos = (float) suma_pos / cont_pos;
            System.out.println("Media de los positivos: "+media_pos);
        }
        
        //Tratamos con los negativos
        if(cont_neg==0){
            System.out.println("No se puede hacer la media de los negativos");
        }
        else{
            media_neg = (float) suma_neg/cont_neg;
            System.out.println("Media de los negativos: "+media_neg);
        }
    }
    
}
