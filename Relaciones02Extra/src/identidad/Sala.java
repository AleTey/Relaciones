
package identidad;

import java.util.Arrays;

public class Sala {
    
    private int num;
    private int fil;
    private int col;
    private String[][] asientos;
    private Pelicula pelicula;
    private int precio;
    private int asientosLibre;

    public Sala() {
    }

    public Sala(int num, int fil, int col, String[][] asientos, int asientosLibres) {
        this.num = num;
        this.fil = fil;
        this.col = col;
        this.asientos = asientos;
        this.asientosLibre = asientosLibres;
    }
    

    public Sala(int num, String[][] asientos, Pelicula pelicula, int precio) {
        this.num = num;
        this.asientos = asientos;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAsientosLibre() {
        return asientosLibre;
    }

    public void setAsientosLibre(int asientosLibre) {
        this.asientosLibre = asientosLibre;
    }
    

   public void setAsiento(int fila, int col, String valor) {
       this.asientos[fila][col] = valor;
       
   }
//     public String[][] setAsientos() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    

    @Override
    public String toString() {
        
       
        
        return "Sala{" + "num=" + num + ", asientos=" + Arrays.toString(asientos) + ", pelicula=" + pelicula + ", precio=" + precio + '}';
        
    }

   

  
    
    
    
    
}
