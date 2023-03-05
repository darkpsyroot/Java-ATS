/*
    Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha
    es correcta. Suponiendo que todos los meses son de 30 días.
*/
package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
    
        if((dia>=1) && (dia<=30)){ //Verificamos el dia
            if((mes>=1) && (mes<=12)){ //Verificamos el mes
                if(año != 0){ //Verificamos el año
                    JOptionPane.showMessageDialog(null,"Fecha Correcta");
                }
                else{ //Caso contrario del año
                    JOptionPane.showMessageDialog(null,"El año es incorrecto");
                }
            }
            else{//Caso contrario del mes
                JOptionPane.showMessageDialog(null,"El mes es incorrecto");
            }
        }
        else{ //Caso contrario del dia
            JOptionPane.showMessageDialog(null,"El dia es incorrecto");
        }
    }
}
