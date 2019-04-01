/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.instrumentos;

/**
 *
 * @author daza
 */
public class Guitarra extends Instrumento{

    private String tipoCuerdas;

    public Guitarra(String imagen) {
        super(imagen);
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
    
}
