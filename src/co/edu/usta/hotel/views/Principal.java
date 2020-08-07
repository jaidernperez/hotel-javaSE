package co.edu.usta.hotel.views;

import co.edu.usta.hotel.utilities.OpenWindow;

import javax.swing.*;
import java.beans.PropertyVetoException;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/Icon.png")).getImage());
        try {
            OpenWindow.openWindow(StartPage.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        myDesktop = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        itemInicio = new javax.swing.JMenuItem();
        menuClient = new javax.swing.JMenu();
        itemAddClient = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        itemUpdateClient = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        itemShowClient = new javax.swing.JMenuItem();
        menuRoom = new javax.swing.JMenu();
        itemAddRoom = new javax.swing.JMenuItem();
        separator3 = new javax.swing.JPopupMenu.Separator();
        itemUpdateRoom = new javax.swing.JMenuItem();
        separator4 = new javax.swing.JPopupMenu.Separator();
        itemShowRoom = new javax.swing.JMenuItem();
        menuReservation = new javax.swing.JMenu();
        itemAddReservation = new javax.swing.JMenuItem();
        separator5 = new javax.swing.JPopupMenu.Separator();
        itemUpdateReservation = new javax.swing.JMenuItem();
        separator6 = new javax.swing.JPopupMenu.Separator();
        itemShowReservation = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout myDesktopLayout = new javax.swing.GroupLayout(myDesktop);
        myDesktop.setLayout(myDesktopLayout);
        myDesktopLayout.setHorizontalGroup(
            myDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        myDesktopLayout.setVerticalGroup(
            myDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        pnlMain.add(myDesktop);

        getContentPane().add(pnlMain);

        menuHome.setText("Hotel");

        itemInicio.setText("Inicio");
        itemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInicioActionPerformed(evt);
            }
        });
        menuHome.add(itemInicio);

        menuBar.add(menuHome);

        menuClient.setText("Cliente");

        itemAddClient.setText("Agregar");
        itemAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddClientActionPerformed(evt);
            }
        });
        menuClient.add(itemAddClient);
        menuClient.add(separator1);

        itemUpdateClient.setText("Actualizar");
        itemUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateClientActionPerformed(evt);
            }
        });
        menuClient.add(itemUpdateClient);
        menuClient.add(separator2);

        itemShowClient.setText("Listar");
        itemShowClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemShowClientActionPerformed(evt);
            }
        });
        menuClient.add(itemShowClient);

        menuBar.add(menuClient);

        menuRoom.setText("Habitación");

        itemAddRoom.setText("Agregar");
        itemAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddRoomActionPerformed(evt);
            }
        });
        menuRoom.add(itemAddRoom);
        menuRoom.add(separator3);

        itemUpdateRoom.setText("Actualizar");
        itemUpdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateRoomActionPerformed(evt);
            }
        });
        menuRoom.add(itemUpdateRoom);
        menuRoom.add(separator4);

        itemShowRoom.setText("Listar");
        itemShowRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemShowRoomActionPerformed(evt);
            }
        });
        menuRoom.add(itemShowRoom);

        menuBar.add(menuRoom);

        menuReservation.setText("Reserva");

        itemAddReservation.setText("Agregar");
        itemAddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddReservationActionPerformed(evt);
            }
        });
        menuReservation.add(itemAddReservation);
        menuReservation.add(separator5);

        itemUpdateReservation.setText("Actualizar");
        itemUpdateReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateReservationActionPerformed(evt);
            }
        });
        menuReservation.add(itemUpdateReservation);
        menuReservation.add(separator6);

        itemShowReservation.setText("Listar");
        itemShowReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemShowReservationActionPerformed(evt);
            }
        });
        menuReservation.add(itemShowReservation);

        menuBar.add(menuReservation);

        menuAbout.setText("Acerca de");
        menuBar.add(menuAbout);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(844, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddClientActionPerformed
        try {
            OpenWindow.openWindow(FormAddClient.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemAddClientActionPerformed

    private void itemShowClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemShowClientActionPerformed
        try {
            OpenWindow.openWindow(FormShowClients.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemShowClientActionPerformed

    private void itemAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddRoomActionPerformed
        try {
            OpenWindow.openWindow(FormAddRoom.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemAddRoomActionPerformed

    private void itemShowRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemShowRoomActionPerformed
        try {
            OpenWindow.openWindow(FormShowRooms.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemShowRoomActionPerformed

    private void itemUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateClientActionPerformed
        try {
            OpenWindow.openWindow(FormUpdateClient.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemUpdateClientActionPerformed

    private void itemUpdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateRoomActionPerformed
        try {
            OpenWindow.openWindow(FormUpdateRoom.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemUpdateRoomActionPerformed

    private void itemAddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddReservationActionPerformed
        try {
            OpenWindow.openWindow(FormAddReservation.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemAddReservationActionPerformed

    private void itemUpdateReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateReservationActionPerformed
        try {
            OpenWindow.openWindow(FormUpdateReservation.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemUpdateReservationActionPerformed

    private void itemShowReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemShowReservationActionPerformed
        try {
            OpenWindow.openWindow(FormShowReservations.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemShowReservationActionPerformed

    private void itemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicioActionPerformed
        try {
            OpenWindow.openWindow(StartPage.class, myDesktop);
        } catch (PropertyVetoException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemInicioActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAddClient;
    private javax.swing.JMenuItem itemAddReservation;
    private javax.swing.JMenuItem itemAddRoom;
    private javax.swing.JMenuItem itemInicio;
    private javax.swing.JMenuItem itemShowClient;
    private javax.swing.JMenuItem itemShowReservation;
    private javax.swing.JMenuItem itemShowRoom;
    private javax.swing.JMenuItem itemUpdateClient;
    private javax.swing.JMenuItem itemUpdateReservation;
    private javax.swing.JMenuItem itemUpdateRoom;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuReservation;
    private javax.swing.JMenu menuRoom;
    private javax.swing.JDesktopPane myDesktop;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    private javax.swing.JPopupMenu.Separator separator3;
    private javax.swing.JPopupMenu.Separator separator4;
    private javax.swing.JPopupMenu.Separator separator5;
    private javax.swing.JPopupMenu.Separator separator6;
    // End of variables declaration//GEN-END:variables
}
