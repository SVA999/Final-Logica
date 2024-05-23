package bookingair;

import java.awt.BorderLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import java.time.*;
import javax.swing.JPanel;



public class f_Reservas extends javax.swing.JFrame {

    int xMouse, yMouse;
    public LocalDate fechaActual= LocalDate.now();
    public Date fechaIda, fechaVuelta;
    public String clase;
    
    public f_Reservas() {
        setUndecorated(true);
        initComponents();
        l_hoy.setText(fechaActual.toString()); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_trayecto = new javax.swing.ButtonGroup();
        backG = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        bExit = new javax.swing.JButton();
        info = new javax.swing.JPanel();
        l_TReserva = new javax.swing.JLabel();
        l_hoy = new javax.swing.JLabel();
        selection = new javax.swing.JPanel();
        opsVuelos = new javax.swing.JPanel();
        rb_dosVuelos = new javax.swing.JRadioButton();
        rb_unVuelo = new javax.swing.JRadioButton();
        l_FechaIda = new javax.swing.JLabel();
        selectFechas = new javax.swing.JPanel();
        selectVuelos = new javax.swing.JPanel();
        TableVuelos = new javax.swing.JScrollPane();
        TablaVuelos = new javax.swing.JTable();
        ProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backG.setBackground(new java.awt.Color(22, 26, 29));
        backG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(11, 9, 10));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bExit.setBackground(new java.awt.Color(11, 9, 10));
        bExit.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        bExit.setForeground(new java.awt.Color(232, 237, 223));
        bExit.setText("X");
        bExit.setAlignmentY(0.0F);
        bExit.setBorder(null);
        bExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExitMouseExited(evt);
            }
        });
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        header.add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        backG.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        info.setBackground(new java.awt.Color(186, 24, 27));
        info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_TReserva.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        l_TReserva.setForeground(new java.awt.Color(255, 255, 255));
        l_TReserva.setText("RESERVA TU VUELO");
        info.add(l_TReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        l_hoy.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        l_hoy.setForeground(new java.awt.Color(255, 255, 255));
        l_hoy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_hoy.setText("---");
        l_hoy.setToolTipText("");
        info.add(l_hoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 162, -1));

        backG.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 560));

        selection.setBackground(new java.awt.Color(11, 9, 10));
        selection.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 26, 29), 2, true));
        selection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opsVuelos.setBackground(new java.awt.Color(11, 9, 10));
        opsVuelos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 26, 29), 2, true));
        opsVuelos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb_dosVuelos.setBackground(new java.awt.Color(11, 9, 10));
        bg_trayecto.add(rb_dosVuelos);
        rb_dosVuelos.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        rb_dosVuelos.setForeground(new java.awt.Color(255, 255, 255));
        rb_dosVuelos.setText("Ida y vuela");
        rb_dosVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_dosVuelosActionPerformed(evt);
            }
        });
        opsVuelos.add(rb_dosVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        rb_unVuelo.setBackground(new java.awt.Color(11, 9, 10));
        bg_trayecto.add(rb_unVuelo);
        rb_unVuelo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        rb_unVuelo.setForeground(new java.awt.Color(255, 255, 255));
        rb_unVuelo.setText("Solo ida");
        rb_unVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_unVueloActionPerformed(evt);
            }
        });
        opsVuelos.add(rb_unVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        l_FechaIda.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda.setForeground(new java.awt.Color(255, 255, 255));
        l_FechaIda.setText("Trayecto");
        opsVuelos.add(l_FechaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        selection.add(opsVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 80));

        selectFechas.setBackground(new java.awt.Color(11, 9, 10));
        selectFechas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 26, 29), 2, true));

        javax.swing.GroupLayout selectFechasLayout = new javax.swing.GroupLayout(selectFechas);
        selectFechas.setLayout(selectFechasLayout);
        selectFechasLayout.setHorizontalGroup(
            selectFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        selectFechasLayout.setVerticalGroup(
            selectFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        selection.add(selectFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 400));

        selectVuelos.setBackground(new java.awt.Color(11, 9, 10));
        selectVuelos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 26, 29), 2, true));
        selectVuelos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaVuelos.setAutoCreateRowSorter(true);
        TablaVuelos.setBackground(new java.awt.Color(245, 243, 244));
        TablaVuelos.setForeground(new java.awt.Color(255, 255, 255));
        TablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Trayecto", "Hora", "Precio"
            }
        ));
        TablaVuelos.setEnabled(false);
        TablaVuelos.setGridColor(new java.awt.Color(11, 9, 10));
        TableVuelos.setViewportView(TablaVuelos);

        selectVuelos.add(TableVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 490));

        selection.add(selectVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 360, 490));

        ProgressBar.setBackground(new java.awt.Color(245, 243, 244));
        ProgressBar.setForeground(new java.awt.Color(229, 56, 59));
        selection.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 620, 10));

        backG.add(selection, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 660, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backG, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        dispose();
    }//GEN-LAST:event_bExitActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void bExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseEntered
        bExit.setBackground(new java.awt.Color(186, 24, 27));
    }//GEN-LAST:event_bExitMouseEntered

    private void bExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseExited
        bExit.setBackground(new java.awt.Color(11, 9, 10));
    }//GEN-LAST:event_bExitMouseExited

    private void rb_dosVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_dosVuelosActionPerformed
        PanelTrayecto1 p1 = new PanelTrayecto1();
        ShowPanelFechas(p1);
        ProgressBar.setValue(20);
    }//GEN-LAST:event_rb_dosVuelosActionPerformed

    private void rb_unVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_unVueloActionPerformed
        PanelTrayecto2 p2 = new PanelTrayecto2();
        ShowPanelFechas(p2);
        ProgressBar.setValue(20);
    }//GEN-LAST:event_rb_unVueloActionPerformed


    
    
    //Funciones
    
    private void ShowPanelFechas(JPanel p){
        p.setSize(240,400);
        p.setLocation(0, 0);
        selectFechas.removeAll();
        selectFechas.add(p, BorderLayout.CENTER);
        selectFechas.revalidate();
        selectFechas.repaint();
    }

    public void ShowPanelVuelos(JPanel p){
        p.setSize(360,490);
        p.setLocation(0, 0);
        selectVuelos.removeAll();
        selectVuelos.add(p, BorderLayout.CENTER);
        selectVuelos.revalidate();
        selectVuelos.repaint();
    }
    
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
            java.util.logging.Logger.getLogger(f_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f_Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JTable TablaVuelos;
    private javax.swing.JScrollPane TableVuelos;
    private javax.swing.JButton bExit;
    private javax.swing.JPanel backG;
    private javax.swing.ButtonGroup bg_trayecto;
    private javax.swing.JPanel header;
    private javax.swing.JPanel info;
    private javax.swing.JLabel l_FechaIda;
    private javax.swing.JLabel l_TReserva;
    private javax.swing.JLabel l_hoy;
    private javax.swing.JPanel opsVuelos;
    private javax.swing.JRadioButton rb_dosVuelos;
    private javax.swing.JRadioButton rb_unVuelo;
    private javax.swing.JPanel selectFechas;
    public static javax.swing.JPanel selectVuelos;
    private javax.swing.JPanel selection;
    // End of variables declaration//GEN-END:variables
}