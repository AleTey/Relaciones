
package identidad;

public class Sala {
    
    private int num;
    private String[][] asientos;
    private Pelicula pelicula;
    private int precio;

    public Sala() {
    }

    public Sala(int num, String[][] asientos) {
        this.num = num;
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
        return "Sala{" + "asientos=" + asientos + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }
    
    
    
}
