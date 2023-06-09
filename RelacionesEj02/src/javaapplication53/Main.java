/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

import Identidad.Game;
import Identidad.Jugador;
import Service.GameService;
import Service.JugadorService;
import Service.RevolverService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RevolverService rs = new RevolverService();
        GameService gs = new GameService();
        JugadorService js = new JugadorService();

//        System.out.println("Llenar juego");
//        Game nuevoJuego = gs.llennarJuego();
//        gs.toString();
////        gs.mostrarArray();
//        System.out.println(nuevoJuego.toString());
//        
//        System.out.println("---------------");
//        rs.llenarRevolver();
//        rs.toString();
//        rs.mostrar();
//        System.out.println("------------");
//        gs.mostrarArray();
        Game game1 = gs.llennarJuego();
//        System.out.println(game1.toString());
//        gs.mostrarArray();
//        System.out.println(game1.getJugadores());

        boolean endGame = false;

        while (!endGame) {
            for (Jugador arg : game1.getJugadores()) {
//            System.out.println(game1.getR());
//            System.out.println(arg.isMojado());
                System.out.println("------------------------------");
                System.out.println("   TURNO: " + arg.getNombre());
                System.out.println("------------------------------");

                System.out.println("Ingrese una tecla para disparar");
                sc.nextLine();
                gs.ronda(arg, game1.getR());
                
                if (arg.isMojado()) {
                    System.out.println(arg.getNombre() + " PIERDE LA PARTIDA");
                    endGame = true;
                    break;
                }
            }
        }
        
        System.out.println("GAME OVER");
    }

}
