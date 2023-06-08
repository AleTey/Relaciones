/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import Identidad.Perro;
import Identidad.Persona;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calendar fechaHoy;
        fechaHoy = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.set(Calendar.YEAR, 1988);
        fechaNac.set(Calendar.MONTH, 00);
        fechaNac.set(Calendar.DAY_OF_MONTH, 30);
        Persona p1 = new Persona("Martin", "Ramirez", new GregorianCalendar(fechaNac.get(Calendar.YEAR), fechaNac.get(Calendar.MONTH), fechaNac.get(Calendar.DAY_OF_MONTH)), 33480841);
        System.out.println(p1.toString());
        System.out.println(p1.getFechaNac().get(Calendar.YEAR));
        System.out.println(p1.getFechaNac().get(Calendar.MONTH));
        System.out.println(p1.getFechaNac().get(Calendar.DAY_OF_MONTH));

        fechaNac.set(Calendar.YEAR, 2000);

        System.out.println("-----------------");
        System.out.println(p1.getFechaNac().get(Calendar.YEAR));

        Persona p2 = new Persona("Juan", "Matite", new GregorianCalendar(fechaNac.get(Calendar.YEAR), fechaNac.get(Calendar.MONTH), fechaNac.get(Calendar.DAY_OF_MONTH)), 42042015);

        fechaNac.set(Calendar.YEAR, 2020);
        fechaNac.set(Calendar.MONTH, 05);
        Perro pe1;
        pe1 = new Perro("Firu", "doberman", new GregorianCalendar(fechaNac.get(Calendar.YEAR), fechaNac.get(Calendar.MONTH), fechaNac.get(Calendar.DAY_OF_MONTH)), "grande");

        fechaNac.set(Calendar.YEAR, 2018);
        fechaNac.set(Calendar.MONTH, 11);

        Perro pe2 = new Perro("Coco", "caniche", new GregorianCalendar(fechaNac.get(Calendar.YEAR), fechaNac.get(Calendar.MONTH), fechaNac.get(Calendar.DAY_OF_MONTH)), "chico");

        ArrayList<Perro> dogList = new ArrayList();
        dogList.add(pe1);
        dogList.add(pe2);

        
        for (Perro perro : dogList) {
            System.out.println(perro.toString());
        }
        System.out.println("Elija un perro de la siguiente lista y escriba su nombre");
        String perroElegido = sc.nextLine();
        
        boolean perroEncontrado = false;
        int contPerrosAdquiridos = 0;
        for (Perro perro : dogList) {
            if (perro.getNombre().equalsIgnoreCase(perroElegido)) {
                System.out.println(perro.toString());
                System.out.println("Este es el perro que desa adoptar? S/N");
                String confirmacion = sc.nextLine();
                if (confirmacion.equalsIgnoreCase("s")) {
                    p1.setPerro(perro);
                    System.out.println("El perro ya es suyo");
                    perroEncontrado = true;
                    contPerrosAdquiridos ++;
                }
            }
        }
        if (!perroEncontrado) {
            System.out.println("El perro elegido no fue encontrado");
        }
        if (contPerrosAdquiridos > 0) {
            Iterator<Perro> it = dogList.iterator();

            while (it.hasNext()) {
                Perro perroo = it.next();
                if (perroo.getNombre().equalsIgnoreCase(perroElegido)) {
                    it.remove();
                    
                }
            }
        }
        System.out.println("Persona p1");
        System.out.println(p1.toString());
        
        System.out.println("---------Perror restantes en la lista");
        
        
         for (Perro perro : dogList) {
            System.out.println(perro.toString());
        }
               
    }

}

 //LA PARTE QUE ESTA ABAJO DE ESTO SON LOS RESULTADOS CUANDO SE CORRE EL PROGRAMA
