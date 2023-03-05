
package ventanas;

public class Persona {
    private String nombre,correo,celular;

    public Persona(String nombre, String correo, String celular) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }
    
    
}
