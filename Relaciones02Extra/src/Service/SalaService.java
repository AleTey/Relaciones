package Service;

import identidad.Cine;
import identidad.Sala;
import java.util.Random;
import java.util.Scanner;

public class SalaService {

    Scanner sc = new Scanner(System.in);

    public Sala crearSala(int num, int fil, int col) {

        String[][] asientos = new String[fil][col];
        // Sala sala = new Sala(asientos);
        String letra = "";
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
        int asientosLibres = (fil) * (col);
        return new Sala(num, fil, col, asientos, asientosLibres);
    }

    public int cambiarPrecioTiket() {

        System.out.println("Ingrese precio de la entrada");
        int precioEntrada = sc.nextInt();

        return precioEntrada;

    }

    public String asientoAleatorio(Cine cine, int nroSala) {

        Random random = new Random();
        int nroFila = random.nextInt(cine.getSalas().get(nroSala).getFil());
        int nroCol = random.nextInt(cine.getSalas().get(nroSala).getCol());

        //PRUEBA NRO ALEATORIO
        System.out.println("fila" + nroFila);
        System.out.println("col " + nroCol);
        
        while (!verificarDisponibilidadAsiento(cine, nroSala, nroFila, nroCol)) {

            String newAsiento = cambioAsiento(cine, nroSala, nroFila, nroCol);
            String fila = newAsiento.substring(0, 1);
            String col = newAsiento.substring(1, 2);
            nroFila = Integer.parseInt(fila);
            nroCol = Integer.parseInt(col);
            System.out.println(nroFila + 0);
            System.out.println(nroCol + 0);
        }

        String resultado = cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol];
        resultado = resultado.substring(0, 2);
        
        //CAMBIO A ASIENTO OCUPADO
        String ubicacionDisponible = cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol];
        String ubicacionOcupada = ubicacionDisponible.substring(0, 3) + "X" + ubicacionDisponible.substring(4);
        System.out.println("ubicacionDisponi: " + ubicacionDisponible);
        System.out.println("ubicacionOcupada: " + ubicacionOcupada);
        cine.getSalas().get(nroSala).setAsiento(nroFila, nroCol, ubicacionOcupada);
        System.out.println("res final: " + cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol]);
        cine.getSalas().get(nroSala).setAsientosLibre(cine.getSalas().get(nroSala).getAsientosLibre() - 1);
        
        for (int i = 0; i < cine.getSalas().get(nroSala).getFil(); i++) {
            for (int j = 0; j < cine.getSalas().get(nroSala).getCol(); j++) {
                System.out.print(cine.getSalas().get(nroSala).getAsientos()[i][j]);
            }
            System.out.println("");
        }
        System.out.println(cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol].indexOf("X"));
        return resultado;
    }

    public boolean verificarDisponibilidadAsiento(Cine cine, int nroSala, int nroFila, int nroCol) {
        boolean igual = false;

//        for (int i = 0; i < cine.getSalas().get(nroSala).getFil(); i++) {
//            for (int j = 0; j < cine.getSalas().get(nroSala).getCol(); j++) {
//                System.out.print(cine.getSalas().get(nroSala).getAsientos()[i][j]);
//            }
//            System.out.println("");
//        }
        System.out.println("Sala: " + nroSala);
        System.out.println("Fila: " + nroFila);
        System.out.println("Col: " + nroCol);
//        System.out.println(cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol]);
//        System.out.println(cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol].indexOf("_"));
        String asiento = cine.getSalas().get(nroSala).getAsientos()[nroFila][nroCol].substring(3, 4);
        System.out.println("seleccion de x : " + asiento);
        if (asiento.equalsIgnoreCase("_")) {
            System.out.println("true");
            return true;
            
        }
        System.out.println("OCUPADOOO!!!!");
        return false;

    }

    public String cambioAsiento(Cine cine, int nroSala, int nroFila, int nroCol) {

        if (nroCol < cine.getSalas().get(nroSala).getCol() - 1) {
            System.out.println("NUMERO DE COLUMNA EN PASAR ASIENTO: " + nroCol);
            System.out.println("NUMERO CINE.GET COL: " + cine.getSalas().get(nroSala).getCol());
            nroCol = nroCol + 1;

            String asiento = "";
            asiento = asiento.concat(String.valueOf(nroFila).concat(String.valueOf(nroCol)));
            return asiento;
            
        }else if (nroFila < cine.getSalas().get(nroSala).getFil() - 1) {
            
            nroFila = nroFila + 1;
            nroCol = 0;
            
            String filaString = String.valueOf(nroFila);
            String colString = String.valueOf(nroCol);
            String asientoString = "";
            asientoString = asientoString.concat(filaString).concat(colString);
            return asientoString;
                
        }else {
        
            nroFila = 0;
            nroCol = 0;
            
            String fila = String.valueOf(nroFila);
            String col = String.valueOf(nroCol);
            String asientoString = "";
            asientoString = asientoString.concat(fila).concat(col);
            return asientoString;
        }
        
    }
}
