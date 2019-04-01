/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.common;

import bandamusical.personas.PersonaCreadorConcreto;
import bandamusical.personas.Musico;
import java.util.List;
import java.util.ArrayList;

public class Constantes {

    public static int ID_CANTANTE = 1;
    public static int ID_VIOLIN = 2;
    public static int ID_GUITARRA = 3;
    public static int ID_BATERIA = 4;
    public static int ID_ACORDEON = 5;
    
    public static int ANCHO_IMAGEN_DEFAULT = 70;
    public static int ALTO_IMAGEN_DEFAULT = 70;

    public static List<Musico> listaAmigosMusicos = amigosMusicos();

    private static List<Musico> amigosMusicos() {
        List<Musico> listaMusicos = new ArrayList();
        PersonaCreadorConcreto fabricaAmigos = new PersonaCreadorConcreto();

        listaMusicos.add((Musico) fabricaAmigos.crearPersona(1, "Jose1", "https://www.clipartmax.com/png/middle/2-24162_thinking-clipart-png-small-book-of-modern-and-innovative-business-ideas.png"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(2, "Miguel1", "https://media.canalnet.tv/2018/08/Homero-Simpson.jpeg"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(3, "Juan1", "http://kevart.net/data/out/181/1414279.jpg"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(4, "Andres1", "https://img1.cgtrader.com/items/642249/05fb311cc8/large/cartoon-office-man-3d-model-animated-rigged-max-obj-fbx-ma-mb-mtl-tga.jpg"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(5, "Adrian1", "https://theundefeated.com/wp-content/uploads/2016/08/cleveland-brown.jpg?w=700"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(6, "Jose2", "https://www.clipartmax.com/png/middle/2-24162_thinking-clipart-png-small-book-of-modern-and-innovative-business-ideas.png"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(7, "Miguel2", "https://media.canalnet.tv/2018/08/Homero-Simpson.jpeg"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(8, "Juan2", "http://kevart.net/data/out/181/1414279.jpg"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(9, "Andres2", "https://img1.cgtrader.com/items/642249/05fb311cc8/large/cartoon-office-man-3d-model-animated-rigged-max-obj-fbx-ma-mb-mtl-tga.jpg"));
        listaMusicos.add((Musico) fabricaAmigos.crearPersona(10, "Adrian2", "https://theundefeated.com/wp-content/uploads/2016/08/cleveland-brown.jpg?w=700"));
        
        return listaMusicos;
    }

}
