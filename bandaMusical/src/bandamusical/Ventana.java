/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical;

import bandamusical.imagenes.FabricaDeImagenes;
import bandamusical.instrumentos.InstrumentoCreator;
import bandamusical.common.Constantes;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import bandamusical.banda.Banda;
import bandamusical.personas.Musico;

/**
 *
 * @author werinc
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana Global = this;
    private Banda banda;
    private InstrumentoCreator insCrea;
    FabricaDeImagenes fabricaImagenes;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        banda = new Banda();
        insCrea = new InstrumentoCreator();
        fabricaImagenes = new FabricaDeImagenes();
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDeMusicos.removeAll();
                llamarBanda();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelDeMusicos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Contratar Banda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeMusicosLayout = new javax.swing.GroupLayout(panelDeMusicos);
        panelDeMusicos.setLayout(panelDeMusicosLayout);
        panelDeMusicosLayout.setHorizontalGroup(
            panelDeMusicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        panelDeMusicosLayout.setVerticalGroup(
            panelDeMusicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelDeMusicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDeMusicos;
    // End of variables declaration//GEN-END:variables

    private void llamarBanda() {
        System.err.println("-------------------------------------");
        banda.validarInstrumentos(insCrea);
        banda.gestionarDisponibilidadMusicos();
        int contDisp = 0;
        for (Musico musico : banda.getListaMusicos()) {
            if (musico.isDisponible()) {
                JLabel nombreMusico = new JLabel(musico.getNombre());
                nombreMusico.setSize(new Dimension(20, 20));
                panelDeMusicos.add(nombreMusico);
                JLabel fotoMusico = new JLabel(new ImageIcon(fabricaImagenes.getImagenIconApp(musico.getFoto(), Constantes.ALTO_IMAGEN_DEFAULT, Constantes.ANCHO_IMAGEN_DEFAULT).getImageIcon()));
                fotoMusico.setSize(new Dimension(40, 40));
                panelDeMusicos.add(fotoMusico);
                JLabel fotoIntrumento = new JLabel(new ImageIcon(fabricaImagenes.getImagenIconApp(musico.getInstrumento().getImagen(), Constantes.ALTO_IMAGEN_DEFAULT, Constantes.ANCHO_IMAGEN_DEFAULT).getImageIcon()));
                fotoIntrumento.setSize(new Dimension(40, 40));
                panelDeMusicos.add(fotoIntrumento);
                JLabel nombreIntrumento = new JLabel(musico.getInstrumento().getNombre());
                panelDeMusicos.add(nombreIntrumento);
                contDisp++;
            }
        }
        panelDeMusicos.setLayout(new GridLayout(contDisp, 4));
        panelDeMusicos.revalidate();
        panelDeMusicos.repaint();

        this.revalidate();
        this.repaint();

    }    

}
