
package Service;

import identidad.Cine;
import identidad.Sala;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CineService {
    
    Scanner sc = new Scanner(System.in);
    SalaService ss = new SalaService();
    
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
            contNroSala ++;
            System.out.println("Ingrese cantidad de filas de la sala " + i + 1);
            int cantFilas = sc.nextInt();
            System.out.println("Ingrese cantidad de columnas de la sala " + i + 1);
            int cantCol = sc.nextInt();
            
            Sala newSala = ss.crearSala(contNroSala, cantFilas, cantCol);
            salas.add(newSala);
            
        }
        
        return salas;
    }
    
    public void mostrarCine(Cine cine) {
        System.out.println(cine.toString());
        
        Iterator<Sala> it = cine.getSalas().iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}
