
package Ejecicio10;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Dirige un entrenamiento");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica un entrenamiento");
    }
}
