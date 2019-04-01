/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.instrumentos;

/**
 *
 * @author daza
 */
public class Instrumento implements Cloneable {

    private String nombre;
    private String imagen;
    private String Tipo;

    public Instrumento(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public Instrumento clone() {
        Instrumento clonedInstrumento = null;
        try {
            clonedInstrumento = (Instrumento) super.clone();
            clonedInstrumento.setNombre(nombre);            
            clonedInstrumento.setImagen(imagen);
            clonedInstrumento.setTipo(Tipo);            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        return clonedInstrumento;
    }    
}
