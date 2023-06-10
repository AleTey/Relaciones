
package Identidad;

public class Carta {
    
    private int num;
    private String palo;

    public Carta() {
    }

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

//    @Override
//    public String toString() {
//        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
//    }
    @Override
    public String toString() {
        return num + " " + palo;
    }
    
}
