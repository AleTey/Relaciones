
package identidad;

public class Sala {
    
    private int num;
    private int fil;
    private int col;
    private String[][] asientos;
    private Pelicula pelicula;
    private int precio;

    public Sala() {
    }

    public Sala(int num, int fil, int col, String[][] asientos) {
        this.num = num;
        this.fil = fil;
        this.col = col;
        this.asientos = asientos;
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

    @Override
    public String toString() {
        
       
        
        return "Sala{" + "num=" + num + ", asientos=" + asientos + ", pelicula=" + pelicula + ", precio=" + precio + '}';
        
    }

  
    
    
    
    
}
