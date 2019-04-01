/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.instrumentos;

/**
 *
 * @author daza
 */
public class Violin extends Instrumento{

    private String marca;

    public Violin(String imagen) {
        super(imagen);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
