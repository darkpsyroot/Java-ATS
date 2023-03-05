/*
    Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto 
    dentro de un tablero y actualice su posición dentro del mismo. Los movimientos posibles
    son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa mostrará la 
    nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
*/
package Ejercicio2;

public class Tablero {
    private int x;
    private int y;

    //Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba(int incremento){
        y += incremento;
    }
    
    public void moverAbajo(int incremento){
        y -= incremento;
    }
    
    public void moverDerecha(int incremento){
        x += incremento;
    }
    
    public void moverIzquierda(int incremento){
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
