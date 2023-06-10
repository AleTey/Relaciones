
package Service;

import identidad.Sala;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SalaService {
    
    Scanner sc = new Scanner(System.in);
    
    
    
    
    public Sala crearSala(int num, int fil, int col) {
    
        
        String[][] asientos = new String[fil][col];
       // Sala sala = new Sala(asientos);
        
        return new Sala(num, asientos);
    }
}
