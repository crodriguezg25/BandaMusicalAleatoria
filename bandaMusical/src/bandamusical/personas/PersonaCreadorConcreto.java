/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.personas;

import bandamusical.personas.Musico;
import bandamusical.personas.Persona;

/**
 *
 * @author werinc
 */
public class PersonaCreadorConcreto extends PersonaCreadorAbstracto{

    @Override
    public Persona factoryMethod(int id, String nombre, String imagen) {
        return new Musico(id, nombre, imagen);
    }
    
}
