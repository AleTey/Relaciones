package relacionesej03;

import Identidad.Baraja;
import Identidad.Carta;
import Service.BarajaService;
import java.util.Scanner;

public class RelacionesEj03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BarajaService bs = new BarajaService();
        // CREAR MAZO
        Baraja nuevaBaraja = bs.crearMazo();

        boolean salir = false;
        int option;

        while (!salir) {

            System.out.println("1. Nueva baraja");
            System.out.println("2. Barajar");
            System.out.println("3. Siguiente carta");
            System.out.println("4. Cartas disponibles");
            System.out.println("5. Dar x cartas");
            System.out.println("6. Mostrar cartas del monton");
            System.out.println("7. Mostrar baraja");
            System.out.println("8. Salir");
            
            option = sc.nextInt();

            switch (option) {

                case 1:
                    nuevaBaraja = bs.crearMazo();
                    System.out.println("");
                    break;

                case 2:
                    bs.barajar(nuevaBaraja);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println(bs.siguienteCarta(nuevaBaraja));                   
                    System.out.println("");
                    break;

                case 4:                  
                    System.out.println(bs.cartasDisponibles(nuevaBaraja));
                    System.out.println("");
                    break;

                case 5:
                    bs.darCartas(nuevaBaraja);
                    System.out.println("");
                    break;

                case 6:
                    bs.cartasMonton();
                    System.out.println("");
                    break;

                case 7:
                    bs.mostrarBaraja(nuevaBaraja);
                    System.out.println("");
                    break;
                    
                case 8:
                    System.out.println("Salir");
                    System.out.println("SI    NO");
                    String rta = sc.nextLine();
                    while (!rta.equalsIgnoreCase("si") && !rta.equalsIgnoreCase("no")) {
                        System.out.println("Salir");
                        System.out.println("SI    NO");
                        rta = sc.nextLine();
                                
                    }
                    if (rta.equalsIgnoreCase("si")) {
                        salir = true;
                    }
            }
        }

    }

}
