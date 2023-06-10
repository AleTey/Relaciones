
package Service;

import identidad.Espectador;
import java.util.LinkedHashSet;


public class EspectadorService {
    
    
    public LinkedHashSet listaEspectadores() {
        
        LinkedHashSet<Espectador> listaEspectadores = new LinkedHashSet();
        
        Espectador espectador1 = new Espectador("Martin", 24, 1000);
        Espectador espectador2 = new Espectador("Juan", 15, 800);
        Espectador espectador3 = new Espectador("Migue", 8, 900);
        Espectador espectador4 = new Espectador("Lucas", 16, 900);
        Espectador espectador5 = new Espectador("Alcides", 42, 3000);
        Espectador espectador6 = new Espectador("Edu", 32, 3000);
        Espectador espectador7 = new Espectador("Luci", 12, 2000);
        Espectador espectador8 = new Espectador("Maca", 30, 2000);
        Espectador espectador9 = new Espectador("Marga", 50, 2500);
        Espectador espectador10 = new Espectador("Romi", 40, 3000);
        Espectador espectador11 = new Espectador("Pepe", 15, 1500);
        Espectador espectador12 = new Espectador("Juli", 28, 2000);
        Espectador espectador13 = new Espectador("Fer", 35, 3500);
        
        listaEspectadores.add(espectador1);
        listaEspectadores.add(espectador2);
        listaEspectadores.add(espectador3);
        listaEspectadores.add(espectador4);
        listaEspectadores.add(espectador5);
        listaEspectadores.add(espectador6);
        listaEspectadores.add(espectador7);
        listaEspectadores.add(espectador8);
        listaEspectadores.add(espectador9);
        listaEspectadores.add(espectador10);
        listaEspectadores.add(espectador11);
        listaEspectadores.add(espectador12);
        listaEspectadores.add(espectador13);
        
        return listaEspectadores;
        
    }
}
