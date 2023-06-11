
package Service;

import identidad.Cine;
import identidad.Sala;
import java.util.Scanner;

public class SalaService {
    
    Scanner sc = new Scanner(System.in);
    
    
    
    
    public Sala crearSala(int num, int fil, int col) {
    
        
        String[][] asientos = new String[fil][col];
       // Sala sala = new Sala(asientos);
        String letra ="";
        for (int i = fil - 1, l = 1; i >= 0; i--, l++) {
            for (int j = 0; j < col; j++) {
                
                switch (j) {
                    
                    case 0:
                        letra = "A";
                        break;
                    case 1:
                        letra = "B";
                        break;
                    case 2:
                        letra = "C";
                        break;
                    case 3:
                        letra = "D";
                        break; 
                    case 4:
                        letra = "E";
                        break;
                    case 5:
                        letra = "F";
                        break;
                    case 6:
                        letra = "G";
                        break;
                    case 7:
                        letra = "H";
                        break;
                    case 8:
                        letra = "I";
                        break;
                    case 9:
                        letra = "J";
                        break;   
                                             
                }
               
                
                String parce = String.valueOf(l);
                
                asientos[i][j] = parce + letra + "(_)" + "|";
            }
        }
        
        return new Sala(num, fil, col, asientos);
    }
    
    public int cambiarPrecioTiket() {
        
        System.out.println("Ingrese precio de la entrada");
        int precioEntrada = sc.nextInt();
        
        return precioEntrada;
    }
}
