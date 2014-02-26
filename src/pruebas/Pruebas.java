/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import beans.*;

/**
 *
 * @author jorge
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Tesista("manolo", 123, 123456789, "castaña");
        System.out.println(p.toString());

        Persona c = new Alumno(789, 789987, "nombre");
        System.out.println(c.toString());
    }
}
