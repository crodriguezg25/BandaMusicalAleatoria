/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.personas;

import bandamusical.instrumentos.InstrumentoCreator;
import bandamusical.instrumentos.Instrumento;

/**
 *
 * @author werinc
 */
public class Musico extends Persona{
    private Instrumento instrumento;
    private boolean disponible;
    private InstrumentoCreator insCreator;
    
    public Musico(int id,String nombre, String imagen) {
        super(id, nombre, imagen);  
        insCreator = new InstrumentoCreator();        
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void estaDisponible() {
        int num = (int) Math.floor(Math.random()*2);
        //System.out.println("num: " + num);
        if( num == 1){
            this.disponible = true;
        }else{
            this.disponible = false;
        }
    }

    private void traerInstrumento(InstrumentoCreator insCreator) {
      this.instrumento = insCreator.traerInstrumento((int)(Math.random()*5)+1);
    }

    public void validarInstrumentos(InstrumentoCreator insCreator) {
        traerInstrumento(insCreator);
    }
    
}
