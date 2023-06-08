package Identidad;

import java.util.Calendar;

public class Perro {

    private String nombre;
    private String raza;
    private Calendar fechaNac;
    private String size;

    public Perro() {
    }

    public Perro(String nombre, String raza, Calendar fechaNac, String size) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public String toString() {
        int year = fechaNac.get(Calendar.YEAR);
        int month = fechaNac.get(Calendar.MONTH) + 1;
        int day = fechaNac.get(Calendar.DAY_OF_MONTH);
        
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", fechaNac=" + year + "/" + month + "/" + day + ", size=" + size + '}';
    }

}
