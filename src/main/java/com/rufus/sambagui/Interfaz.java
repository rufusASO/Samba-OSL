/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rufus.sambagui;
//implementacion
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author julio
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        configureTable(shareTable);
        configureTable(userTable);
        winsOptions.add(onSettings);
        winsOptions.add(offSettings);
    }
    
    public static void configureTable(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setResizable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winsOptions = new javax.swing.ButtonGroup();
        principalPanel = new javax.swing.JPanel();
        sambaTabs = new javax.swing.JTabbedPane();
        Inicio = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        subtitulo1 = new javax.swing.JLabel();
        opciones1 = new javax.swing.JComboBox<>();
        subtitulo2 = new javax.swing.JLabel();
        opciones2 = new javax.swing.JComboBox<>();
        Compartir = new javax.swing.JPanel();
        shareScroll = new javax.swing.JScrollPane();
        shareTable = new javax.swing.JTable();
        addShareButton = new javax.swing.JButton();
        editShareButton = new javax.swing.JButton();
        deleteShareButton = new javax.swing.JButton();
        Trabajo = new javax.swing.JPanel();
        groupSambaName = new javax.swing.JLayeredPane();
        titleGroup = new javax.swing.JLabel();
        groupName = new javax.swing.JTextField();
        winsSettings = new javax.swing.JLayeredPane();
        titleServer = new javax.swing.JLabel();
        onSettings = new javax.swing.JRadioButton();
        offSettings = new javax.swing.JRadioButton();
        Usuarios = new javax.swing.JPanel();
        userScroll = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(900, 600));

        principalPanel.setBackground(new java.awt.Color(30, 30, 30));
        principalPanel.setPreferredSize(new java.awt.Dimension(900, 600));

        sambaTabs.setBackground(new java.awt.Color(30, 30, 30));
        sambaTabs.setForeground(new java.awt.Color(255, 255, 255));

        Inicio.setBackground(new java.awt.Color(45, 45, 45));

        titulo1.setBackground(new java.awt.Color(255, 255, 255));
        titulo1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Configuracion del servicio");

        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 255, 255));
        estado.setText("Estado actual: inactivo");

        subtitulo1.setBackground(new java.awt.Color(255, 255, 255));
        subtitulo1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        subtitulo1.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo1.setText("Despues de escribir la configuracion");

        opciones1.setBackground(new java.awt.Color(62, 62, 62));
        opciones1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        opciones1.setForeground(new java.awt.Color(255, 255, 255));
        opciones1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detener", "Reiniciar", "Recargar", "Mantener el estado actual" }));

        subtitulo2.setBackground(new java.awt.Color(255, 255, 255));
        subtitulo2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        subtitulo2.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo2.setText("Despues de reiniciar");

        opciones2.setBackground(new java.awt.Color(62, 62, 62));
        opciones2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        opciones2.setForeground(new java.awt.Color(255, 255, 255));
        opciones2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciar al arrancar", "No arrancar" }));

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtitulo2)
                    .addComponent(opciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtitulo1)
                    .addComponent(estado)
                    .addComponent(titulo1))
                .addContainerGap(587, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titulo1)
                .addGap(18, 18, 18)
                .addComponent(estado)
                .addGap(18, 18, 18)
                .addComponent(subtitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subtitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        sambaTabs.addTab("Inicio", Inicio);

        Compartir.setBackground(new java.awt.Color(45, 45, 45));

        shareScroll.setBackground(new java.awt.Color(62, 62, 62));
        shareScroll.setForeground(new java.awt.Color(255, 255, 255));

        shareTable.setBackground(new java.awt.Color(62, 62, 62));
        shareTable.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        shareTable.setForeground(new java.awt.Color(255, 255, 255));
        shareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Read-Only", "Name", "Path", "Guest Acces", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        shareScroll.setViewportView(shareTable);

        addShareButton.setBackground(new java.awt.Color(62, 62, 62));
        addShareButton.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        addShareButton.setForeground(new java.awt.Color(255, 255, 255));
        addShareButton.setText("Añadir");

        editShareButton.setBackground(new java.awt.Color(62, 62, 62));
        editShareButton.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        editShareButton.setForeground(new java.awt.Color(255, 255, 255));
        editShareButton.setText("Editar");

        deleteShareButton.setBackground(new java.awt.Color(62, 62, 62));
        deleteShareButton.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        deleteShareButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteShareButton.setText("Borrar");

        javax.swing.GroupLayout CompartirLayout = new javax.swing.GroupLayout(Compartir);
        Compartir.setLayout(CompartirLayout);
        CompartirLayout.setHorizontalGroup(
            CompartirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompartirLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(shareScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(CompartirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editShareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteShareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addShareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        CompartirLayout.setVerticalGroup(
            CompartirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompartirLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(CompartirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CompartirLayout.createSequentialGroup()
                        .addComponent(addShareButton)
                        .addGap(18, 18, 18)
                        .addComponent(editShareButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteShareButton))
                    .addComponent(shareScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        sambaTabs.addTab("Compartir", Compartir);

        Trabajo.setBackground(new java.awt.Color(45, 45, 45));

        groupSambaName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        groupSambaName.setPreferredSize(new java.awt.Dimension(300, 100));

        titleGroup.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        titleGroup.setForeground(new java.awt.Color(255, 255, 255));
        titleGroup.setText("Nombre del grupo de trabajo");

        groupName.setBackground(new java.awt.Color(45, 45, 45));
        groupName.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        groupName.setForeground(new java.awt.Color(255, 255, 255));
        groupName.setText("WORKGROUP");

        groupSambaName.setLayer(titleGroup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        groupSambaName.setLayer(groupName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout groupSambaNameLayout = new javax.swing.GroupLayout(groupSambaName);
        groupSambaName.setLayout(groupSambaNameLayout);
        groupSambaNameLayout.setHorizontalGroup(
            groupSambaNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupSambaNameLayout.createSequentialGroup()
                .addGroup(groupSambaNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groupSambaNameLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(groupSambaNameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(titleGroup)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        groupSambaNameLayout.setVerticalGroup(
            groupSambaNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupSambaNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleGroup)
                .addGap(18, 18, 18)
                .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        winsSettings.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        titleServer.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        titleServer.setForeground(new java.awt.Color(255, 255, 255));
        titleServer.setText("WINS");

        onSettings.setBackground(new java.awt.Color(45, 45, 45));
        onSettings.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        onSettings.setForeground(new java.awt.Color(255, 255, 255));
        onSettings.setText("Encendido");

        offSettings.setBackground(new java.awt.Color(45, 45, 45));
        offSettings.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        offSettings.setForeground(new java.awt.Color(255, 255, 255));
        offSettings.setText("Apagado");

        winsSettings.setLayer(titleServer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        winsSettings.setLayer(onSettings, javax.swing.JLayeredPane.DEFAULT_LAYER);
        winsSettings.setLayer(offSettings, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout winsSettingsLayout = new javax.swing.GroupLayout(winsSettings);
        winsSettings.setLayout(winsSettingsLayout);
        winsSettingsLayout.setHorizontalGroup(
            winsSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winsSettingsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(winsSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offSettings)
                    .addComponent(onSettings))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winsSettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleServer)
                .addGap(80, 80, 80))
        );
        winsSettingsLayout.setVerticalGroup(
            winsSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winsSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onSettings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offSettings)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TrabajoLayout = new javax.swing.GroupLayout(Trabajo);
        Trabajo.setLayout(TrabajoLayout);
        TrabajoLayout.setHorizontalGroup(
            TrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrabajoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(groupSambaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(winsSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        TrabajoLayout.setVerticalGroup(
            TrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrabajoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(TrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(winsSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupSambaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        sambaTabs.addTab("Trabajo", Trabajo);

        Usuarios.setBackground(new java.awt.Color(45, 45, 45));

        userScroll.setBackground(new java.awt.Color(62, 62, 62));
        userScroll.setForeground(new java.awt.Color(255, 255, 255));

        userTable.setBackground(new java.awt.Color(62, 62, 62));
        userTable.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        userTable.setForeground(new java.awt.Color(255, 255, 255));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "UID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        userScroll.setViewportView(userTable);

        jButton1.setBackground(new java.awt.Color(62, 62, 62));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir");

        jButton2.setBackground(new java.awt.Color(62, 62, 62));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 25));

        jButton3.setBackground(new java.awt.Color(62, 62, 62));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Borrar");

        javax.swing.GroupLayout UsuariosLayout = new javax.swing.GroupLayout(Usuarios);
        Usuarios.setLayout(UsuariosLayout);
        UsuariosLayout.setHorizontalGroup(
            UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(userScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(70, 70, 70))
        );
        UsuariosLayout.setVerticalGroup(
            UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(userScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        sambaTabs.addTab("Usuarios", Usuarios);

        saveButton.setBackground(new java.awt.Color(62, 62, 62));
        saveButton.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Guardar");

        cancelButton.setBackground(new java.awt.Color(62, 62, 62));
        cancelButton.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addContainerGap(638, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(40, 40, 40)
                .addComponent(saveButton)
                .addGap(31, 31, 31))
            .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(principalPanelLayout.createSequentialGroup()
                    .addComponent(sambaTabs)
                    .addContainerGap()))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton))
                .addGap(50, 50, 50))
            .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(principalPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(sambaTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(144, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int result = javax.swing.JOptionPane.showConfirmDialog(
            null,
            "¿Estás seguro que deseas cancelar?\nToda la información que se haya agregado, editado o eliminado no se guardará.",
            "Confirmación",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (result == javax.swing.JOptionPane.YES_OPTION) {
            // Si se presiona "Aceptar", cerrar la ventana
            dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });*/
        java.awt.EventQueue.invokeLater(() -> {
        Interfaz interfaz = new Interfaz();
        interfaz.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        interfaz.setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Compartir;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel Trabajo;
    private javax.swing.JPanel Usuarios;
    private javax.swing.JButton addShareButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteShareButton;
    private javax.swing.JButton editShareButton;
    private javax.swing.JLabel estado;
    private javax.swing.JTextField groupName;
    private javax.swing.JLayeredPane groupSambaName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JRadioButton offSettings;
    private javax.swing.JRadioButton onSettings;
    private javax.swing.JComboBox<String> opciones1;
    private javax.swing.JComboBox<String> opciones2;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JTabbedPane sambaTabs;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane shareScroll;
    private javax.swing.JTable shareTable;
    private javax.swing.JLabel subtitulo1;
    private javax.swing.JLabel subtitulo2;
    private javax.swing.JLabel titleGroup;
    private javax.swing.JLabel titleServer;
    private javax.swing.JLabel titulo1;
    private javax.swing.JScrollPane userScroll;
    private javax.swing.JTable userTable;
    private javax.swing.ButtonGroup winsOptions;
    private javax.swing.JLayeredPane winsSettings;
    // End of variables declaration//GEN-END:variables
}
