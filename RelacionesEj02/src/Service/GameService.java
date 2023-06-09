package Service;

import Identidad.Game;
import Identidad.Jugador;
import Identidad.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameService {
    
    JugadorService js = new JugadorService();
    RevolverService rs = new RevolverService();
    private final Scanner sc = new Scanner(System.in);

    Game game;

    public Game llennarJuego() {

        System.out.println("Ingrese cantidad de jugadores (EL MAXIMO PERMITIDO ES 6)");
        int cantJug = sc.nextInt();

        if (cantJug > 6) {
            cantJug = 6;
        }
        List<Jugador> jugadores = new ArrayList();
        for (int i = 1; i <= cantJug; i++) {
            Jugador j = new Jugador(i, "jugador " + i, false);
            jugadores.add(j);
//            game.setJugadores(jugadores);
        }
        return new Game(rs.llenarRevolver(), jugadores);
    }

    public void ronda(Jugador jugador, Revolver r) {
        
        js.disparo(jugador, r);
        System.out.println(jugador.isMojado());
        rs.siguienteChorro();
    }

    public void mostrarArray() {

//        for (Jugador jugador : game.getJugadores()) {
//            System.out.println("juegooooo===-----");
//            System.out.println(jugador);
//        }
        
//        List<Jugador> jugadores =  game.getJugadores();
//        
//        for (Jugador jugadore : jugadores) {
//            System.out.println(jugadore);
//        }
    }

}
