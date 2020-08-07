package co.edu.usta.hotel.views;

import co.edu.usta.hotel.controllers.*;
import co.edu.usta.hotel.entities.*;
import co.edu.usta.hotel.utilities.Validate;

import javax.swing.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class FormUpdateReservation extends javax.swing.JInternalFrame {

    private ReservationController reservationController;
    private ClientController clientController;
    private RoomController roomController;
    private Reservation reservationUpdate;

    private DefaultComboBoxModel<String> modelClient;
    private DefaultComboBoxModel<String> modelRoom;

    public FormUpdateReservation() {
        initComponents();
        disableForm(false);
        loadComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbNameSoft = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbProfile = new javax.swing.JLabel();
        lbProfileIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbSubtitle = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxState = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboBoxClient = new javax.swing.JComboBox<>();
        comboBoxRooms = new javax.swing.JComboBox<>();
        datePickerStartDate = new org.jdesktop.swingx.JXDatePicker();
        datePickerFinalDate = new org.jdesktop.swingx.JXDatePicker();
        btnUpdate = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBorder(null);
        setFocusable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/Icon.png"))); // NOI18N

        lbNameSoft.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbNameSoft.setForeground(new java.awt.Color(255, 255, 255));
        lbNameSoft.setText("Hotel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbIcon)
                                .addGap(18, 18, 18)
                                .addComponent(lbNameSoft, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbIcon))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(lbNameSoft)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("RESERVACIÓN");

        lbProfile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProfile.setText("Admin");

        lbProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/Profile.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbProfileIcon)
                                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbProfileIcon)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbSubtitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSubtitle.setText("Actualizar Reservación");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Cliente:");

        jLabel2.setText("Habitación:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/reservation.png"))); // NOI18N

        comboBoxState.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N
        comboBoxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-- Seleccionar --", "Pago", "Pospuesto"}));

        jLabel6.setText("Fecha Inicio:");

        jLabel8.setText("Fecha Salida:");

        jLabel9.setText("Estado:");

        comboBoxClient.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        comboBoxRooms.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel9)))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel6))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboBoxState, javax.swing.GroupLayout.Alignment.LEADING, 0, 270, Short.MAX_VALUE)
                                        .addComponent(comboBoxRooms, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboBoxClient, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(datePickerStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(datePickerFinalDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(comboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(comboBoxRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(datePickerStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(datePickerFinalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/btnAdd.png"))); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/btnBrush.png"))); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel3.setText("ID:");

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClean)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(220, 220, 220))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lbSubtitle)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbSubtitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(boxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearch))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnClean)
                                        .addComponent(btnUpdate)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Copyright © Jaider Pérez 2020");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
                pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMainLayout.setVerticalGroup(
                pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (validateFields()) {
            String clientComboBox, roomComboBox;
            Date startDate, finalDate;
            int state;

            clientComboBox = Objects.requireNonNull(comboBoxClient.getSelectedItem()).toString();
            roomComboBox = Objects.requireNonNull(comboBoxRooms.getSelectedItem()).toString();

            state = comboBoxState.getSelectedIndex();

            clientController = new ClientController();
            roomController = new RoomController();

            Client client = clientController.getByNameClient(clientComboBox);
            Room room = roomController.getByNameRoom(roomComboBox);
            startDate = new java.sql.Date(datePickerStartDate.getDate().getTime());
            finalDate = new java.sql.Date(datePickerFinalDate.getDate().getTime());


            boolean stateBoolean = getBooleanByIndex(state);

            reservationController = new ReservationController();
            boolean b = reservationController.updateReservation(reservationUpdate.getId(), client.getId(),
                    room.getId(), startDate, finalDate, stateBoolean);

            if (b) {
                JOptionPane.showMessageDialog(null, "La reservación se ha guardado con exito");
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(null, "La reservación no se ha guardado con exito");
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String id = boxId.getText();

        if (!Validate.isValidNumber(id)) {
            JOptionPane.showMessageDialog(null, "El código de la reservación debe ser numérico");
        } else {
            reservationController = new ReservationController();
            reservationUpdate = reservationController.getOneReservation(Integer.parseInt(id));
            if (reservationUpdate == null) {
                JOptionPane.showMessageDialog(null, "El id de la reservación no coincide");
            } else {
                comboBoxClient.setSelectedItem(reservationUpdate.getClient().getNames());
                comboBoxRooms.setSelectedItem(reservationUpdate.getRoom().getName());
                datePickerFinalDate.setDate(reservationUpdate.getFinalDate());
                datePickerStartDate.setDate(reservationUpdate.getStartDate());
                comboBoxState.setSelectedIndex(getIndexByBoolean(reservationUpdate.isState()));
                disableForm(true);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void loadComboBox() {
        clientController = new ClientController();
        roomController = new RoomController();

        List<Client> clients = clientController.showClients();
        loadComboClient(clients);
        List<Room> rooms = roomController.showRooms();
        loadComboRooms(rooms);
    }

    private void loadComboClient(List<Client> clients) {
        modelClient = new DefaultComboBoxModel<>();
        modelClient.addElement("-- Seleccionar --");
        for (Client client : clients) {
            modelClient.addElement(client.getNames());
        }
        comboBoxClient.setModel(modelClient);
    }

    private void loadComboRooms(List<Room> rooms) {
        modelRoom = new DefaultComboBoxModel<>();
        modelRoom.addElement("-- Seleccionar --");
        for (Room room : rooms) {
            modelRoom.addElement(room.getName());
        }
        comboBoxRooms.setModel(modelRoom);
    }

    private boolean validateFields() {
        int client, room, state;
        boolean validate = true;
        java.util.Date startDate, finalDate;

        client = comboBoxClient.getSelectedIndex();
        room = comboBoxRooms.getSelectedIndex();
        state = comboBoxState.getSelectedIndex();
        startDate = datePickerStartDate.getDate();
        finalDate = datePickerFinalDate.getDate();

        if (client == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
            requestFocus();
            validate = false;
        } else if (room == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una habitación");
            requestFocus();
            validate = false;
        } else if (datePickerStartDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la fecha de inicio");
            requestFocus();
            validate = false;
        } else if (datePickerFinalDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la fecha de salida");
            requestFocus();
            validate = false;
        } else if (finalDate.before(startDate)) {
            String message = "La fecha de inicio debe estar antes que la fecha de salida";
            JOptionPane.showMessageDialog(null, message);
            requestFocus();
            validate = false;
        } else if (state == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estado");
            requestFocus();
            validate = false;
        }
        return validate;
    }

    private boolean getBooleanByIndex(int index) {
        boolean b = true;
        if (index == 2) {
            b = false;
        }
        return b;
    }

    private int getIndexByBoolean(boolean b) {
        int index;
        if (b) {
            index = 1;
        } else {
            index = 2;
        }
        return index;
    }

    private void cleanFields() {
        disableForm(false);
        comboBoxClient.setSelectedIndex(0);
        comboBoxRooms.setSelectedIndex(0);
        datePickerFinalDate.setDate(null);
        datePickerStartDate.setDate(null);
        comboBoxState.setSelectedIndex(0);
    }

    private void disableForm(boolean show) {
        comboBoxClient.setEnabled(show);
        comboBoxRooms.setEnabled(show);
        datePickerStartDate.setEnabled(show);
        datePickerFinalDate.setEnabled(show);
        comboBoxState.setEnabled(show);
        btnClean.setEnabled(show);
        btnUpdate.setEnabled(show);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxId;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxClient;
    private javax.swing.JComboBox<String> comboBoxRooms;
    private javax.swing.JComboBox<String> comboBoxState;
    private org.jdesktop.swingx.JXDatePicker datePickerFinalDate;
    private org.jdesktop.swingx.JXDatePicker datePickerStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbNameSoft;
    private javax.swing.JLabel lbProfile;
    private javax.swing.JLabel lbProfileIcon;
    private javax.swing.JLabel lbSubtitle;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
