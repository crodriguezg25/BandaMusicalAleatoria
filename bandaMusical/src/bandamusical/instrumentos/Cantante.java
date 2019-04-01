/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.instrumentos;

/**
 *
 * @author daza
 */
public class Cantante extends Instrumento {
 
    private String tipodeVoz;

    public Cantante(String imagen) {
        super(imagen);
    }

    public String getTipodeVoz() {
        return tipodeVoz;
    }

    public void setTipodeVoz(String tipodeVoz) {
        this.tipodeVoz = tipodeVoz;
    }
            
            
    
}
