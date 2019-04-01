/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.banda;

import bandamusical.personas.Musico;
import bandamusical.common.Constantes;
import java.util.ArrayList;
import java.util.List;
import bandamusical.instrumentos.InstrumentoCreator;

/**
 *
 * @author werinc
 */
public class Banda {

    private List<Musico> listaMusicos;
    private InstrumentoCreator insCreator;

    public Banda() {
        llamarMusicos();
        this.insCreator = new InstrumentoCreator();        
    }

    public void llamarMusicos() {
        System.out.println("LLamando a los amigos musicos...Listo");
        listaMusicos = new ArrayList();    
        listaMusicos.addAll(Constantes.listaAmigosMusicos);
    }

    public List<Musico> getListaMusicos() {
        return listaMusicos;
    }

    public void setListaMusicos(List<Musico> listaMusicos) {
        this.listaMusicos = listaMusicos;
    }

    public void gestionarDisponibilidadMusicos() {
        System.out.println("Mirando quien esta disponible...Listo");
        for(Musico mus: listaMusicos){
            mus.estaDisponible();
        }        
    }

    public void validarInstrumentos(InstrumentoCreator insCreator) {
        System.out.println("Tomando los instrumentos a llevar...Listo");
        for(Musico mus: listaMusicos){
            mus.validarInstrumentos(insCreator);
        }
    }

}
