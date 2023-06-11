
package Service;

import identidad.Pelicula;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PeliculaService {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public void listadoPeliculas() {
    
        
        //LinkedHashSet listaPeliculas = null;
        
        Pelicula transformer = new Pelicula("TRANSFORMERS: EL DESPERTAR DE LAS BESTIAS", 127, 13, "Seven Caple Jr.");
        Pelicula maremoto = new Pelicula("MAREMOTO", 104, 13, "John Andreas Andersen");
        Pelicula rapidosYFuriosos = new Pelicula("RAPIDOS Y FURIOSOS X", 140, 13, "Louis Leterrier");
        Pelicula guardianesDeLaGalaxia = new Pelicula("GUARDIANES DE LA GALAXIA VOL 3", 149, 13, "James Gunn");
        Pelicula marioBross = new Pelicula("SUPER MARIO BROS: LA PELICULA", 93, 0, "Aaron Horvath, Michael Jelenic");
        
        listaPeliculas.add(transformer);
        listaPeliculas.add(maremoto);
        listaPeliculas.add(rapidosYFuriosos);
        listaPeliculas.add(guardianesDeLaGalaxia);
        listaPeliculas.add(marioBross);
                
        
    }
    
    public Pelicula eleccionPelicula() {
    
        int contLista = 1;
        
        listadoPeliculas();
        for (Pelicula pelicula : listaPeliculas ) {
            
            System.out.println("------ OPCION: " + contLista + " -------");
            System.out.println(pelicula.getTitulo());
            System.out.println("--------------");
            System.out.println("Duracion: " + pelicula.getDuracion());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Clasificacion: Mayores de " + pelicula.getEdadMin());
            System.out.println("");
            System.out.println("");
            contLista ++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrece la opcion deseada");
        int option = sc.nextInt();
        
        Pelicula peliculaElegida = listaPeliculas.get(option - 1);
        
        return peliculaElegida;
    }
    
    
}
