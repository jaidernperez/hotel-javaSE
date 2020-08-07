package co.edu.usta.hotel.views;

import co.edu.usta.hotel.controllers.FloorController;
import co.edu.usta.hotel.controllers.RoomController;
import co.edu.usta.hotel.controllers.StateController;
import co.edu.usta.hotel.controllers.TypeController;
import co.edu.usta.hotel.entities.Floor;
import co.edu.usta.hotel.entities.Room;
import co.edu.usta.hotel.entities.State;
import co.edu.usta.hotel.entities.Type;
import co.edu.usta.hotel.utilities.Validate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Objects;

public class FormUpdateRoom extends javax.swing.JInternalFrame {

    private  RoomController roomController;
    private FloorController floorController;
    private TypeController typeController;
    private StateController stateController;

    private DefaultComboBoxModel<String> modelFloor;
    private DefaultComboBoxModel<String> modelState;
    private DefaultComboBoxModel<String> modelType;

    private Room roomUpdate;

    public FormUpdateRoom() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boxPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboBoxFloor = new javax.swing.JComboBox<>();
        comboBoxType = new javax.swing.JComboBox<>();
        comboBoxState = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        boxOldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        lbTitle.setText("HABITACIONES");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        lbSubtitle.setText("Actualizar Habitación");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Precio:");

        jLabel3.setText("Piso:");

        jLabel4.setText("Tipo:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/room.jpg"))); // NOI18N

        jLabel6.setText("Estado:");

        jLabel8.setText("Nombre:");

        comboBoxFloor.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        comboBoxType.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        comboBoxState.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        jLabel1.setText("Nombre:");

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
                .addGap(27, 27, 27)
                .addComponent(btnUpdate)
                .addGap(217, 217, 217))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSubtitle))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(boxOldName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxOldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnClean))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Copyright © Jaider Pérez 2020");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (validateFields()) {
            String name, floorName, typeName, stateName;
            float price;

            name = boxName.getText();
            price = Float.parseFloat(boxPrice.getText());
            floorName = Objects.requireNonNull(comboBoxFloor.getSelectedItem()).toString();
            typeName = Objects.requireNonNull(comboBoxType.getSelectedItem()).toString();
            stateName = Objects.requireNonNull(comboBoxState.getSelectedItem()).toString();

            floorController = new FloorController();
            typeController = new TypeController();
            stateController = new StateController();

            Floor floor = floorController.getFloorByName(floorName);
            Type type = typeController.getTypeByName(typeName);
            State state = stateController.getStateByName(stateName);

            roomController = new RoomController();
            boolean b = roomController.updateRoom(roomUpdate.getId(), floor, type, state, name, price);

            if (b) {
                JOptionPane.showMessageDialog(null, "La habitación se ha actualizado con exito");
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(null, "La habitación no se ha actualizado con exito");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSearchActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String name = boxOldName.getText();
        roomController = new RoomController();
        roomUpdate = roomController.getOneRoom(name);
        if (roomUpdate == null) {
            JOptionPane.showMessageDialog(null, "El nombre de la habitacion no coincide");
        } else {
            boxName.setText(roomUpdate.getName());
            boxPrice.setText(roomUpdate.getPrice() + "");
            comboBoxFloor.setSelectedItem(roomUpdate.getFloor().getName());
            comboBoxType.setSelectedItem(roomUpdate.getType().getName());
            comboBoxState.setSelectedItem(roomUpdate.getState().getName());
            disableForm(true);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void loadComboBox() {
        floorController = new FloorController();
        typeController = new TypeController();
        stateController = new StateController();

        List<Floor> floors = floorController.showFloors();
        loadComboFloor(floors);
        List<Type> types = typeController.showTypes();
        loadComboType(types);
        List<State> states = stateController.showStates();
        loadComboState(states);
    }

    private void loadComboFloor(List<Floor> floors) {
        modelFloor = new DefaultComboBoxModel<>();
        modelFloor.addElement("-- Seleccionar --");
        for (Floor floor : floors) {
            modelFloor.addElement(floor.getName());
        }
        comboBoxFloor.setModel(modelFloor);
    }

    private void loadComboState(List<State> states) {
        modelState = new DefaultComboBoxModel<>();
        modelState.addElement("-- Seleccionar --");
        for (State state : states) {
            modelState.addElement(state.getName());
        }
        comboBoxState.setModel(modelState);
    }

    private void loadComboType(List<Type> types) {
        modelType = new DefaultComboBoxModel<>();
        modelType.addElement("-- Seleccionar --");
        for (Type type : types) {
            modelType.addElement(type.getName());
        }
        comboBoxType.setModel(modelType);
    }

    private boolean validateFields() {
        int floorName, typeName, stateName;
        String name, price;
        boolean validate = true;

        name = boxName.getText();
        price = boxPrice.getText();
        floorName = comboBoxFloor.getSelectedIndex();
        typeName = comboBoxType.getSelectedIndex();
        stateName = comboBoxState.getSelectedIndex();

        if (!Validate.isValidString(name, 2)) {
            JOptionPane.showMessageDialog(null, "El nombre debe tener mínimo 2 caracteres");
            requestFocus();
            validate = false;
        } else if ((!Validate.isValidDouble(price))) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número");
            requestFocus();
            validate = false;
        } else if (Float.parseFloat(boxPrice.getText()) < 20000) {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 20000");
            requestFocus();
            validate = false;
        } else if (floorName == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un piso");
            validate = false;
        } else if (typeName == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo");
            validate = false;
        } else if (stateName == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estado");
            requestFocus();
            validate = false;
        }
        return validate;
    }

    private void cleanFields() {
        disableForm(false);
        boxOldName.setText("");
        boxName.setText("");
        boxPrice.setText("");
        comboBoxFloor.setSelectedIndex(0);
        comboBoxType.setSelectedIndex(0);
        comboBoxState.setSelectedIndex(0);
    }

    private void disableForm(boolean show) {
        boxName.setEnabled(show);
        boxPrice.setEnabled(show);
        comboBoxFloor.setEnabled(show);
        comboBoxType.setEnabled(show);
        comboBoxState.setEnabled(show);
        btnClean.setEnabled(show);
        btnUpdate.setEnabled(show);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxName;
    private javax.swing.JTextField boxOldName;
    private javax.swing.JTextField boxPrice;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxFloor;
    private javax.swing.JComboBox<String> comboBoxState;
    private javax.swing.JComboBox<String> comboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
