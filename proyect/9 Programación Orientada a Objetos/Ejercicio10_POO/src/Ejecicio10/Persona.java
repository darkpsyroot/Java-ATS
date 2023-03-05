
package Ejecicio10;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    public void viajar(){
        System.out.println("Viajar");
    }
    
    //Declaramos el método abstracto partidoFutbol()
    public abstract void partidoFutbol();
    
    //Declaramos el metodo abstracto entrenamiento()
    public abstract void entrenamiento();
}
