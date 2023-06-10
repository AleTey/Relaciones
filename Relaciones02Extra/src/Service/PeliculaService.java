
package Service;

import identidad.Pelicula;
import java.util.LinkedHashSet;

public class PeliculaService {
    
    
    
    public LinkedHashSet listadoPeliculas() {
    
        LinkedHashSet<Pelicula> listaPeliculas = new LinkedHashSet();
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
                
        return listaPeliculas;
    }
}
