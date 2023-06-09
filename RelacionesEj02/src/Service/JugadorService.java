
package Service;

import Identidad.Jugador;
import Identidad.Revolver;


public class JugadorService {
    
        RevolverService rv = new RevolverService();
    
    public void disparo(Jugador jugador, Revolver r) {
        if (rv.mojar(r)) {
            jugador.setMojado(true);
        }
        
    }
}
