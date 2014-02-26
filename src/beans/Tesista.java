/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author jorge
 */
public class Tesista extends Alumno{
    private String nb;

    public Tesista(String nombre, int codAlum, int dni, String nb) {
        super(codAlum, dni, nombre);
        this.nb = nb;
    }

    @Override
    public String toString() {
        return super.toString()+"Tesista{" + "nb=" + nb + '}';
    }

    






}
