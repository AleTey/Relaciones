package Service;

import identidad.Cine;
import identidad.Espectador;
import identidad.Sala;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CineService {

    Scanner sc = new Scanner(System.in);
    SalaService ss = new SalaService();
    PeliculaService ps = new PeliculaService();
    EspectadorService es = new EspectadorService();

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
                    ventaTiket(cine);
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

    public void ventaTiket(Cine cine) {

        LinkedHashSet<Espectador> filaVenta = new LinkedHashSet();
        filaVenta = es.listaEspectadores();
        Iterator<Espectador> it = filaVenta.iterator();
        
        boolean salir = false;
        while (it.hasNext() && !salir) {
            Espectador espec = it.next();
            //MUESTRA CARTELERA
            for (Sala sala : cine.getSalas()) {
                System.out.println("----------------------");
                System.out.println("SALA " + sala.getNum());
                System.out.println(sala.getPelicula().getTitulo());
                System.out.println("Duracion: " + sala.getPelicula().getDuracion());
                System.out.println("Director: " + sala.getPelicula().getDirector());
                System.out.println("Para mayores de: " + sala.getPelicula().getEdadMin());
                System.out.println("Precio: " + sala.getPrecio());

                
            }
            // MUESTRA INFO ESPECTADOR
            System.out.println("                                                               nombre: " + espec.getNombre());
            System.out.println("                                                               edad: " + espec.getEdad());
            System.out.println("                                                               dineroDisponible" + espec.getDineroDsp());

            System.out.println("");
            System.out.println("Ingrese numero de sala elegida");
            int peliculaSeleccionada = sc.nextInt();
            peliculaSeleccionada = peliculaSeleccionada - 1;
            System.out.println("Asientos disponibles en la sala: " + cine.getSalas().get(peliculaSeleccionada).getAsientosLibre());
            
            if (espec.getEdad() >= cine.getSalas().get(peliculaSeleccionada).getPelicula().getEdadMin() && espec.getDineroDsp() >= cine.getSalas().get(peliculaSeleccionada).getPrecio() && cine.getSalas().get(peliculaSeleccionada).getAsientosLibre() > 0) {
                
                //RESTA DINERO ESPECTADOR
//                espec.setDineroDsp(espec.getDineroDsp() - cine.getSalas().get(peliculaSeleccionada - 1).getPrecio());
                //PRUEBA QUE SE RESTE EL DINERO AL ESPECTADOR
                                
                //BUSCADOR DE ASIENTOS!!!!
                String ubicacion = ss.asientoAleatorio(cine, peliculaSeleccionada);
                
                System.out.println("Ubicacion: " + ubicacion);
//                String filaAsignada = ubicacion.substring(0, 1);
//                String colAsignada = ubicacion.substring(1, 2);
                
                
                        
                
                ///PRUEBA la sala seleccionada es la correcta?
//                System.out.println("peliculaSELECCIONADA: " + peliculaSeleccionada);
//                System.out.println(cine.getSalas().get(peliculaSeleccionada - 1));
                System.out.println("VENDIDA");
            } else {
                System.out.println("Adioooosss");
            }

            System.out.println("Seguir atendiendo? S/N");
            String rta = sc.nextLine();
            rta = sc.nextLine();
            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            }
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
