/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author jorge
 */
public class Alumno extends Persona {
    
    private int codAlum;

    public Alumno(int codAlum, int dni, String nombre) {
        super(dni, nombre);
        this.codAlum = codAlum;
    }

    public String toString() {
        return super.toString()+"Alumno{" + "codAlum=" + codAlum + '}';
    }
    
}
