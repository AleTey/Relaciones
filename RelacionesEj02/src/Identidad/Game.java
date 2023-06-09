
package Identidad;

import java.util.List;

public class Game {
    
     private Revolver r;
    private List<Jugador> jugadores;

    public Game() {
    }

    public Game(Revolver r, List<Jugador> jugadores) {
        this.r = r;
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    

    @Override
    public String toString() {
        return "GameService{" + "r=" + r + ", jugadores=" + jugadores + '}';
    }
    
}
