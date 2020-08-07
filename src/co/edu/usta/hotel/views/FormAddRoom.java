package co.edu.usta.hotel.views;

import co.edu.usta.hotel.controllers.FloorController;
import co.edu.usta.hotel.controllers.RoomController;
import co.edu.usta.hotel.controllers.StateController;
import co.edu.usta.hotel.controllers.TypeController;
import co.edu.usta.hotel.entities.Floor;
import co.edu.usta.hotel.entities.State;
import co.edu.usta.hotel.entities.Type;
import co.edu.usta.hotel.utilities.Validate;

import javax.swing.*;
import java.util.List;
import java.util.Objects;

public class FormAddRoom extends javax.swing.JInternalFrame {

    private FloorController floorController;
    private TypeController typeController;
    private StateController stateController;

    private DefaultComboBoxModel<String> modelFloor;
    private DefaultComboBoxModel<String> modelState;
    private DefaultComboBoxModel<String> modelType;

    public FormAddRoom() {
        initComponents();
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
        boxName = new javax.swing.JTextField();
        boxPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboBoxFloor = new javax.swing.JComboBox<>();
        comboBoxState = new javax.swing.JComboBox<>();
        comboBoxType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
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
        lbTitle.setText("HABITACIÓN");

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
        lbSubtitle.setText("Agregar habitación");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Precio:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/room.jpg"))); // NOI18N

        comboBoxFloor.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        comboBoxState.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N

        comboBoxType.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N
        comboBoxType.setBorder(null);

        jLabel6.setText("Piso:");

        jLabel8.setText("Tipo:");

        jLabel9.setText("Estado:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxFloor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(boxName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxState, javax.swing.GroupLayout.Alignment.LEADING, 0, 270, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/btnAdd.png"))); // NOI18N
        btnCreate.setText("Crear");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usta/hotel/images/btnBrush.png"))); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbSubtitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(btnClean)
                .addGap(33, 33, 33)
                .addComponent(btnCreate)
                .addGap(235, 235, 235))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbSubtitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
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
                .addGap(242, 242, 242)
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

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
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

            RoomController roomController = new RoomController();
            boolean b = roomController.addRoom(floor, type, state, name, price);

            if (b) {
                JOptionPane.showMessageDialog(null, "La habitación se ha guardado con exito");
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(null, "La habitación no se ha guardado con exito");
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnCleanActionPerformed

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
        } else if ((!Validate.isValidNumber(price)) || Float.parseFloat(boxPrice.getText()) < 5000) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número menor a 5000");
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
        boxName.setText("");
        boxPrice.setText("");
        comboBoxFloor.setSelectedIndex(0);
        comboBoxType.setSelectedIndex(0);
        comboBoxState.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxName;
    private javax.swing.JTextField boxPrice;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comboBoxFloor;
    private javax.swing.JComboBox<String> comboBoxState;
    private javax.swing.JComboBox<String> comboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
