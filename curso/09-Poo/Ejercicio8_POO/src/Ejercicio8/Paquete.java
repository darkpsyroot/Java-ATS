
package Ejercicio8;

public class Paquete {
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad; // 0=normal, 1=alta, 2=express

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }
    
    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete(){
        return "Numero Paquete: "+numeroPaquete
                +"\nDNI: "+dni
                +"\nPeso: "+peso
                +"\nPrioridad: "+prioridad;
    }
}
