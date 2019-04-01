/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.instrumentos;

import bandamusical.common.Constantes;
import java.util.logging.Level;
import java.util.logging.Logger;
import bandamusical.instrumentos.Acordeon;
import bandamusical.instrumentos.Bateria;
import bandamusical.instrumentos.Violin;
import bandamusical.instrumentos.Cantante;
import bandamusical.instrumentos.Guitarra;
import bandamusical.instrumentos.Instrumento;

/**
 *
 * @author daza
 */
public class InstrumentoCreator {

    private Cantante cantante;
    private Violin violin;
    private Guitarra guitarra;
    private Acordeon acordeon;
    private Bateria bateria;

    public InstrumentoCreator() {

        cantante = new Cantante("https://s3-us-west-2.amazonaws.com/devcodepro/media/blog/batalla-por-inteligencia-artificial-en-reconocimiento-de-voz.png");
        violin = new Violin("https://cdn.shopify.com/s/files/1/2235/9983/products/CV3468-A-violin_1024x1024@2x.jpg?v==1503513980");
        guitarra = new Guitarra("https://www.musicopolix.com/56806-thickbox_default/guitarra-electroclasica-valencia-vc104cebk-negra.jpg");
        acordeon = new Acordeon("http://cdn.shopify.com/s/files/1/0787/6455/products/HOHNER_CORONAII_ROJO_grande.png?v==1445618293");
        bateria = new Bateria("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Platin_Drums_PTCL2016_AF.jpg/220px-Platin_Drums_PTCL2016_AF.jpg");

        cantante.setNombre("Cantante");
        cantante.setTipo("Voz");

        violin.setNombre("Violin");
        violin.setTipo("Cuerdas");

        guitarra.setNombre("Guitarra");
        guitarra.setTipo("Cuerdas");

        acordeon.setNombre("Acordeon");
        acordeon.setTipo("Aire");

        bateria.setNombre("Batería");
        bateria.setTipo("Percusion");

    }

    public Instrumento traerInstrumento(int idInstrumento) {
        try {
            if (Constantes.ID_ACORDEON == idInstrumento) {
                return (Instrumento) acordeon.clone();
            } else if (Constantes.ID_BATERIA == idInstrumento) {
                return (Instrumento) bateria.clone();
            } else if (Constantes.ID_CANTANTE == idInstrumento) {
                return (Instrumento) cantante.clone();
            } else if (Constantes.ID_GUITARRA == idInstrumento) {
                return (Instrumento) guitarra.clone();
            } else if (Constantes.ID_VIOLIN == idInstrumento) {
                return (Instrumento) violin.clone();
            }
        } catch (Exception ex) {
            Logger.getLogger(InstrumentoCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
