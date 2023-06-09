
package Service;

import Identidad.Revolver;


public class RevolverService {
    
    Revolver r = new Revolver();
    
    public Revolver llenarRevolver() {
                
        int posActual = (int)(Math.random() * 6) + 1;
        int posAgua = (int)(Math.random() * 6) + 1;
        
        r.setPosActual(posActual);
        r.setPosAgua(posAgua);
        
        return r;
    }
    
    public void mostrar() {
        System.out.println(r.getPosActual());
        System.out.println(r.getPosAgua());
    }
    
    public boolean mojar(Revolver r) {
      
        boolean mojar = false;
//        System.out.println("POSICIONES DENTRO DE MET REVOLVER");
//        System.out.println("POS ACTUAL: " + r.getPosActual());
//        System.out.println("POS AGUA: " + r.getPosAgua());
        if (r.getPosActual() == r.getPosAgua()) {
            mojar = true;
        }
        
        return mojar;
    }
    
    public void siguienteChorro()  {
    
        if (r.getPosActual() < 6) {
            r.setPosActual(r.getPosActual() + 1);
        }else {
            r.setPosActual(1);
        }
    }
            
        
            
    
    
}
