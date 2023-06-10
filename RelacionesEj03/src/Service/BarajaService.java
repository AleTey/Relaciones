
package Service;

import Identidad.Baraja;
import Identidad.Carta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class BarajaService {
    
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<Carta> monton = new LinkedHashSet();
    
    public Baraja crearMazo() {
        LinkedHashSet nuevoMazo = new LinkedHashSet();
        
        for (int p = 0; p < 4; p++) {
                        
            String palo;
            switch (p) {
                case 0:
                    palo = "Espada";
                    break;
                case 1:
                    palo = "Basto";
                    break;
                case 2:
                    palo = "Oro";
                    break;
                default:
                    palo = "Copa";
                    break;
            }
            for (int i = 1; i <= 12; i++) {
                if (i != 9 && i != 8) {
                    Carta carta = new Carta(i, palo);
                    nuevoMazo.add(carta);
                }
            }
        }
        monton.clear();
        return new Baraja(nuevoMazo);
    }
    
    public void barajar(Baraja b) {
        
         ArrayList listaCartas = new ArrayList(b.getCartas());
         
         Collections.shuffle(listaCartas);
         
         b.getCartas().clear();
         b.getCartas().addAll(listaCartas);
                 
    }
    
    public Carta siguienteCarta(Baraja b) {
        Carta sig;
        Iterator<Carta> it = b.getCartas().iterator();
        
        if (it.hasNext()) {
            sig = it.next();
//            System.out.println(b.getCartas());
            monton.add(sig);
            it.remove();
            return sig;
        }else {
            System.out.println("No quedam cartas en la baraja");
            return null;
        }
                
    }
    
    public int cartasDisponibles(Baraja b) {
        
        return b.getCartas().size();
    }
    
    public void darCartas(Baraja b) {
        
        System.out.println("Cuantas cartas quiere?");
        int cant = sc.nextInt();
        
        if (cant > b.getCartas().size()) {
            System.out.println("No hay suficientes cartas. Restan " + b.getCartas().size() + " en la baraja");
        }else {
            
            Iterator<Carta> it = b.getCartas().iterator();
            
            int cont = 0;
            while (cont < cant) {
                Carta sig = it.next();
                System.out.println(sig);
                monton.add(sig);
                it.remove();
                cont ++;
            }
        }
    }
    
    public void cartasMonton() {
        
        if (monton.size() > 0) {
            Iterator<Carta> it = monton.iterator();
            
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }else {
            System.out.println("No quedan cartas en la baraja");
        }
    }
    
    public void mostrarBaraja(Baraja b) {
        
        if (b.getCartas().size() > 0) {
            
            Iterator<Carta> it = b.getCartas().iterator();
            
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }else {
            System.out.println("No quedan cartas en la baraja");
        }
    }
    
    public void mostrarCartas(Baraja b) {
        
        for (Carta object : b.getCartas()) {
            System.out.println(object);
        }
    }
}
