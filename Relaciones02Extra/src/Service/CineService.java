package Service;

import identidad.Cine;
import identidad.Sala;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CineService {

    Scanner sc = new Scanner(System.in);
    SalaService ss = new SalaService();
    PeliculaService ps = new PeliculaService();

    public Cine armarCine() {

        //LinkedHashSet salas = new LinkedHashSet();
        System.out.println("Cuantas salas tiene su cine?");
        int cantSalas = sc.nextInt();

        //salas.add(ss.crearSala(cant))
        return new Cine(crearListaSalas(cantSalas));
    }

    public ArrayList crearListaSalas(int cantSalas) {
        int contNroSala = 0;
        ArrayList salas = new ArrayList();

        for (int i = 0; i < cantSalas; i++) {
            contNroSala++;
            System.out.println("Ingrese cantidad de filas de la sala " + i + 1);
            int cantFilas = sc.nextInt();
            System.out.println("Ingrese cantidad de columnas de la sala " + i + 1);
            int cantCol = sc.nextInt();

            Sala newSala = ss.crearSala(contNroSala, cantFilas, cantCol);
            salas.add(newSala);

        }

        return salas;
    }

    public void menu(Cine cine) {

        boolean exit = false;

        while (!exit) {

            int option;
            System.out.println("--------------------");
            System.out.println("1. Vender tiket");
            System.out.println("--------------------");
            System.out.println("2. Salas");
            System.out.println("--------------------");
            option = sc.nextInt();

            switch (option) {
                case 1:

                    break;

                case 2:
                    menuSalas(cine);
                    break;
            }
        }
    }

    public void venderTiket(Cine cine) {

    }

    public void menuSalas(Cine cine) {

        int option;
        System.out.println("");
        System.out.println("Elija una sala");
        System.out.println("");
        for (Sala sala : cine.getSalas()) {
            System.out.println("---------------------");
            System.out.println("   SALA" + sala.getNum());
            System.out.println("---------------------");
        }
        option = sc.nextInt();

        menuSalaElegida(cine, option);
    }

    public void menuSalaElegida(Cine cine, int option) {

        System.out.println("----------");
        System.out.println("INFO SALA");
        System.out.println("----------");
        System.out.println("");
        System.out.println("Nro sala: " + cine.getSalas().get(option - 1).getNum());
        System.out.println("Pelicula: " + cine.getSalas().get(option - 1).getPelicula());
        System.out.println("Precio: " + cine.getSalas().get(option - 1).getPrecio());

//        for (Sala sala : cine.getSalas()) {
        for (int i = 0; i < cine.getSalas().get(option - 1).getFil(); i++) {
            for (int j = 0; j < cine.getSalas().get(option - 1).getCol(); j++) {
                System.out.print(cine.getSalas().get(option - 1).getAsientos()[i][j]);
            }
            System.out.println("");
        }
//        }

        System.out.println("1. CAMBIAR PELICULA");
        System.out.println("2. CAMBIAR PRECIO ENTRADA");

        int optionMenu = sc.nextInt();
        while (optionMenu != 1 && optionMenu != 2) {
            System.out.println("Ingrese una opcion valida");
            System.out.println("1. CAMBIAR PELICULA");
            System.out.println("2. CAMBIAR PRECIO ENTRADA");
            optionMenu = sc.nextInt();
        }
        switch (optionMenu) {
            case 1:
                cine.getSalas().get(option - 1).setPelicula(ps.eleccionPelicula());
                break;
            case 2:
                cine.getSalas().get(option - 1).setPrecio(ss.cambiarPrecioTiket());
                break;
        }
    }

    public void mostrarCine(Cine cine) {
        System.out.println(cine.toString());

        for (Sala object : cine.getSalas()) {
            for (int i = 0; i < object.getFil(); i++) {
                for (int j = 0; j < object.getCol(); j++) {
                    System.out.print(object.getAsientos()[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
        }

//        Iterator<Sala> it = cine.getSalas().iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().toString());
////            Sala sala = it.next();
//            for (int i = 0; i < it.next().getFil(); i++) {
//                for (int j = 0; j < it.next().getCol(); j++) {
//                    System.out.print(it.next().getAsientos()[i][j]);
//                }
//                System.out.println("");
//            }
//        }
//        for (int i = 0; i < cine.getSalas().size(); i++) {
//            
//        }
    }

}
