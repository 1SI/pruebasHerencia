/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author jorge
 */
public class Persona {
    private int dni;
    protected String nombre;
    

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    public String personaToString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    


}
