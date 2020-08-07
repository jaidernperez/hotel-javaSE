package co.edu.usta.hotel.views;

import co.edu.usta.hotel.controllers.RoomController;
import co.edu.usta.hotel.entities.Room;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormShowRooms extends javax.swing.JInternalFrame {

    private DefaultTableModel tableModel;

    public FormShowRooms() {
        initComponents();
        load();
    }

    private void load() {
        loadTable();
        RoomController roomController = new RoomController();
        List<Room> rooms = roomController.showRooms();
        loadRoom(rooms);
    }

    private void loadRoom(List<Room> rooms) {
        String[] array;
        for (Room room : rooms) {
            array = new String[5];
            array[0] = room.getName();
            array[1] = room.getFloor().getName();
            array[2] = room.getType().getName();
            array[3] = room.getState().getName();
            array[4] = room.getPrice()+"";
            tableModel.addRow(array);
        }
        myTable.setModel(tableModel);
    }


    private void loadTable() {
        tableModel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Piso");
        tableModel.addColumn("Tipo");
        tableModel.addColumn("Estado");
        tableModel.addColumn("Precio");
        myTable.setModel(tableModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
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

        lbSubtitle.setText("Listar habitaciones");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(myTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbSubtitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbNameSoft;
    private javax.swing.JLabel lbProfile;
    private javax.swing.JLabel lbProfileIcon;
    private javax.swing.JLabel lbSubtitle;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable myTable;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
