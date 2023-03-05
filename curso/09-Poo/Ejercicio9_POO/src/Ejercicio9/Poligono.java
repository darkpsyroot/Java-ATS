
package Ejercicio9;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    //Sobre escritura del metodo toString() heredado de Object
    @Override
    public String toString() {
        return "Numero de lados=" + numeroLados;
    }
    
    //Declaracion del metodo abstracto area()
    public abstract double area();
}
