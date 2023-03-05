
package Proyecto_Aeropuerto;

public class AeropuertoPrivado extends Aeropuerto{
    private String empresas[] = new String[10];
    private int numEmpresas=0;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String empresas[]) {
        super(nombre, ciudad, pais, c);
        this.empresas = empresas;
        numEmpresas = empresas.length;
    }
    
    public void insertarEmpresas(String empresas[]){
        this.empresas = empresas;
        numEmpresas = empresas.length;
    }

    public void insertarEmpresa(String empresa){
        empresas[numEmpresas] = empresa;
        numEmpresas++;
    }

    public String[] getEmpresas() {
        return empresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
    
}
