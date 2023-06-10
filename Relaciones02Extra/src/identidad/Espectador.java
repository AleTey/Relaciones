
package identidad;


public class Espectador {
    
    private String nombre;
    private int edad;
    private int dineroDsp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dineroDsp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDsp = dineroDsp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDsp() {
        return dineroDsp;
    }

    public void setDineroDsp(int dineroDsp) {
        this.dineroDsp = dineroDsp;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDsp=" + dineroDsp + '}';
    }
    
    
}
