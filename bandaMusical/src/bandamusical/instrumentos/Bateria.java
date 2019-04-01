/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.instrumentos;

/**
 *
 * @author daza
 */
public class Bateria extends Instrumento{

    private int cantPiezas;

    public Bateria(String imagen) {
        super(imagen);
    }

    public int getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }
    
}
