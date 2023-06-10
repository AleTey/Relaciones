/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package relaciones02extra;

import Service.CineService;
import identidad.Cine;


public class Relaciones02Extra {


    public static void main(String[] args) {

        CineService cs = new CineService();
        
        Cine cine = cs.armarCine();
        
        cs.mostrarCine(cine);
        
        
    }

}
