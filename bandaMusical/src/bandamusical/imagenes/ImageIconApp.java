/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.imagenes;

import java.awt.Image;

/**
 *
 * @author werinc
 */
public class ImageIconApp implements ImagenIconAppLigera{
    
    public Image imageIcon;
    public String resources;

    public ImageIconApp(Image imageIcon, String resources){
        this.imageIcon = imageIcon;
        this.resources = resources;
    }
    @Override
    public Image getImageIcon() {
        return this.imageIcon;
    }

    @Override
    public String getResources() {
        return this.resources;
    }

}
