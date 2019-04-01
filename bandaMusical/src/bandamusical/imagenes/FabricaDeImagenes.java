/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical.imagenes;

import bandamusical.imagenes.ImagenIconAppLigera;
import bandamusical.imagenes.ImageIconApp;
import java.util.List;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author werinc
 */
public class FabricaDeImagenes {

    private List<ImagenIconAppLigera> listImages ;
    
    public FabricaDeImagenes(){
        this.listImages = new ArrayList<ImagenIconAppLigera>();
    }
    
    public ImagenIconAppLigera getImagenIconApp(String resources, int w, int h){
        for(ImagenIconAppLigera imgInd: this.listImages){
            if(imgInd.getResources().equals(resources)){
                //System.out.println("esa Imagen SIIII la tengo =)");
                return imgInd;
            }
        }
        
        ImagenIconAppLigera imgInd = null;
        try {
            imgInd = new ImageIconApp(getScaledImage(ImageIO.read(new URL(resources)),w,h), resources);        
            this.listImages.add(imgInd);
            System.out.println("cargando imagen que no se tenia...Listo");
        } catch (Exception ex) {
            Logger.getLogger(FabricaDeImagenes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imgInd;
    }
    
    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }    
}
