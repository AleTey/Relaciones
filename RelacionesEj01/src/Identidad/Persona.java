
package Identidad;

import java.util.Calendar;

public class Persona {
    
    private String nombre;
    private String apellido;
    private Calendar fechaNac;
    private int dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Calendar fechaNac, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.dni = dni;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public Perro getPerro() {
        return perro;
    }
    

    
    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        int year = fechaNac.get(Calendar.YEAR);
        int month = fechaNac.get(Calendar.MONTH) + 1;
        int day = fechaNac.get(Calendar.DAY_OF_MONTH);
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + year + "/" + month + "/" + day + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
    
}
