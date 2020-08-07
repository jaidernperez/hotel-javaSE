package co.edu.usta.hotel.views;

import co.edu.usta.hotel.controllers.ClientController;
import co.edu.usta.hotel.utilities.Validate;

import javax.swing.*;

public class StartPage extends javax.swing.JInternalFrame {

    private final ClientController clientController;

    public StartPage() {
        initComponents();
        clientController = new ClientController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelFont = new javax.swing.JLabel();

        setBorder(null);
        setFocusable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        labelFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/StartPage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelFont;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
