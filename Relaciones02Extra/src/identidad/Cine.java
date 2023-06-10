
package identidad;

import java.util.ArrayList;

public class Cine {
   
    private ArrayList<Sala> salas;

    public Cine() {
    }

    public Cine(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return "Cine{" + "salas=" + salas + '}';
    }
    
    
}
