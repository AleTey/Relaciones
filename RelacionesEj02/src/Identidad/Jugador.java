
package Identidad;


public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    
    public boolean isMojado() {
        return mojado;
    }

    
    
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
