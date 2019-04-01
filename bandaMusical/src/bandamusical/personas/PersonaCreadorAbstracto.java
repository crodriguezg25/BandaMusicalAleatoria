/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.personas;

import bandamusical.personas.Persona;

/**
 *
 * @author werinc
 */
public abstract class PersonaCreadorAbstracto {
   public Persona crearPersona(int id, String nombre, String imagen){
        return factoryMethod(id, nombre, imagen);
    }
    
    public abstract Persona factoryMethod(int id, String nombre, String imagen);
}
