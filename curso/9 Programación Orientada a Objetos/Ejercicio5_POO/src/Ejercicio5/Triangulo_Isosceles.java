/*
    Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para ello 
    defina los atributos necesarios que se requieren, proporcione métodos de consulta, un
    método constructor e implemente métodos para calcular el perímetro y el área de un
    triángulo, además implementar un método que a partir de un arreglo de triángulos 
    devuelva el área del triángulo de mayor superficie.
*/
package Ejercicio5;

public class Triangulo_Isosceles {
    private double base;
    private double lado;

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }
    
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }
    
    public String mostrarDatos(){
        return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea()+"\n";
    }
}
