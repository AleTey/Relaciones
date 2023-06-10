
package Identidad;

import java.util.LinkedHashSet;



public class Baraja {
    
    private LinkedHashSet<Carta> cartas;

    public Baraja() {
    }

    public Baraja(LinkedHashSet<Carta> cartas) {
        this.cartas = cartas;
    }

    public LinkedHashSet<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(LinkedHashSet<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

  
    
    
    
}
