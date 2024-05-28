package bookingair;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import java.time.*;


public class f_Reservas extends javax.swing.JFrame {

    int xMouse, yMouse;
    public static LocalDate fechaActual= LocalDate.now();
    public Date fechaIda1, fechaIda2, fechaVuelta;
    public  String[] datosVueloForm = new String[5];
    
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
        avionIMG = new javax.swing.JLabel();
        TabsOpciones = new javax.swing.JTabbedPane();
        tab_reservas = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        TabsTrayecto = new javax.swing.JTabbedPane();
        DosTrayectos = new javax.swing.JPanel();
        l_FechaIda1 = new javax.swing.JLabel();
        jdcFechaIda2 = new com.toedter.calendar.JDateChooser();
        l_FechaVuelta = new javax.swing.JLabel();
        jdcFechaVuelta = new com.toedter.calendar.JDateChooser();
        b_buscarVuelos2 = new javax.swing.JButton();
        l_Origen = new javax.swing.JLabel();
        CB_Origen2 = new javax.swing.JComboBox<>();
        l_Destino = new javax.swing.JLabel();
        CB_Destino = new javax.swing.JComboBox<>();
        l_Clase1 = new javax.swing.JLabel();
        CB_Clase2 = new javax.swing.JComboBox<>();
        UnTrayecto = new javax.swing.JPanel();
        l_FechaIda2 = new javax.swing.JLabel();
        jdcFechaIda1 = new com.toedter.calendar.JDateChooser();
        b_buscarVuelos1 = new javax.swing.JButton();
        l_Origen1 = new javax.swing.JLabel();
        CB_Origen1 = new javax.swing.JComboBox<>();
        l_Clase2 = new javax.swing.JLabel();
        CB_Clase1 = new javax.swing.JComboBox<>();
        l_FechaIda = new javax.swing.JLabel();
        tab_vuelos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backG.setBackground(new java.awt.Color(218, 215, 205));
        backG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(52, 78, 65));
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

        bExit.setBackground(new java.awt.Color(52, 78, 65));
        bExit.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        bExit.setForeground(new java.awt.Color(232, 237, 223));
        bExit.setText("X");
        bExit.setAlignmentY(0.0F);
        bExit.setBorder(null);
        bExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bExit.setFocusPainted(false);
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
        header.add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

        backG.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        info.setBackground(new java.awt.Color(88, 129, 87));
        info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_TReserva.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        l_TReserva.setForeground(new java.awt.Color(255, 255, 255));
        l_TReserva.setText("BIENVENID@");
        info.add(l_TReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        l_hoy.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        l_hoy.setForeground(new java.awt.Color(255, 255, 255));
        l_hoy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_hoy.setText("---");
        l_hoy.setToolTipText("");
        info.add(l_hoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 162, -1));

        avionIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookingair/images/Avion01.png"))); // NOI18N
        info.add(avionIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 90, 360, 410));

        backG.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 570));

        TabsOpciones.setBackground(new java.awt.Color(218, 215, 205));
        TabsOpciones.setForeground(new java.awt.Color(52, 78, 65));
        TabsOpciones.setToolTipText("");
        TabsOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabsOpciones.setFocusable(false);
        TabsOpciones.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        tab_reservas.setBackground(new java.awt.Color(218, 215, 205));
        tab_reservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar.setBackground(new java.awt.Color(245, 243, 244));
        ProgressBar.setForeground(new java.awt.Color(88, 129, 87));
        tab_reservas.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 620, 10));

        TabsTrayecto.setBackground(new java.awt.Color(218, 215, 205));
        TabsTrayecto.setForeground(new java.awt.Color(52, 78, 65));
        TabsTrayecto.setToolTipText("");
        TabsTrayecto.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TabsTrayecto.setFocusable(false);
        TabsTrayecto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        TabsTrayecto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabsTrayectoStateChanged(evt);
            }
        });

        DosTrayectos.setBackground(new java.awt.Color(218, 215, 205));
        DosTrayectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_FechaIda1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda1.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaIda1.setText("Fecha de salida");
        DosTrayectos.add(l_FechaIda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 20));

        jdcFechaIda2.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaIda2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        DosTrayectos.add(jdcFechaIda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 30));

        l_FechaVuelta.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaVuelta.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaVuelta.setText("Fecha de regreso");
        DosTrayectos.add(l_FechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 20));

        jdcFechaVuelta.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaVuelta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        DosTrayectos.add(jdcFechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 30));

        b_buscarVuelos2.setBackground(new java.awt.Color(88, 129, 87));
        b_buscarVuelos2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_buscarVuelos2.setForeground(new java.awt.Color(255, 255, 255));
        b_buscarVuelos2.setText("Buscar vuelos");
        b_buscarVuelos2.setBorder(null);
        b_buscarVuelos2.setFocusable(false);
        b_buscarVuelos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarVuelos2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(b_buscarVuelos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 30));

        l_Origen.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Origen.setForeground(new java.awt.Color(52, 78, 65));
        l_Origen.setText("Origen");
        DosTrayectos.add(l_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 20));

        CB_Origen2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Origen2.setForeground(new java.awt.Color(153, 153, 153));
        CB_Origen2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Medellín", "Bogotá", "San Andrés" }));
        CB_Origen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_Origen2MouseClicked(evt);
            }
        });
        CB_Origen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Origen2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(CB_Origen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 30));

        l_Destino.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Destino.setForeground(new java.awt.Color(52, 78, 65));
        l_Destino.setText("Destino");
        DosTrayectos.add(l_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 20));

        CB_Destino.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Destino.setForeground(new java.awt.Color(153, 153, 153));
        CB_Destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona origen" }));
        CB_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DestinoActionPerformed(evt);
            }
        });
        DosTrayectos.add(CB_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 30));

        l_Clase1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Clase1.setForeground(new java.awt.Color(52, 78, 65));
        l_Clase1.setText("Clase");
        DosTrayectos.add(l_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 20));

        CB_Clase2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Clase2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Ejecutiva" }));
        CB_Clase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Clase2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(CB_Clase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, 30));

        TabsTrayecto.addTab("Ida y vuela", DosTrayectos);

        UnTrayecto.setBackground(new java.awt.Color(218, 215, 205));
        UnTrayecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_FechaIda2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda2.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaIda2.setText("Fecha de salida");
        UnTrayecto.add(l_FechaIda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 20));

        jdcFechaIda1.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaIda1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        UnTrayecto.add(jdcFechaIda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 30));

        b_buscarVuelos1.setBackground(new java.awt.Color(88, 129, 87));
        b_buscarVuelos1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_buscarVuelos1.setForeground(new java.awt.Color(255, 255, 255));
        b_buscarVuelos1.setText("Buscar vuelos");
        b_buscarVuelos1.setBorder(null);
        b_buscarVuelos1.setFocusable(false);
        b_buscarVuelos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarVuelos1ActionPerformed(evt);
            }
        });
        UnTrayecto.add(b_buscarVuelos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 30));

        l_Origen1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Origen1.setForeground(new java.awt.Color(52, 78, 65));
        l_Origen1.setText("Origen");
        UnTrayecto.add(l_Origen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 20));

        CB_Origen1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Origen1.setForeground(new java.awt.Color(153, 153, 153));
        CB_Origen1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Medellín", "Bogotá", "San Andrés" }));
        CB_Origen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_Origen1MouseClicked(evt);
            }
        });
        CB_Origen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Origen1ActionPerformed(evt);
            }
        });
        UnTrayecto.add(CB_Origen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 30));

        l_Clase2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Clase2.setForeground(new java.awt.Color(52, 78, 65));
        l_Clase2.setText("Clase");
        UnTrayecto.add(l_Clase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 20));

        CB_Clase1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Clase1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Ejecutiva" }));
        CB_Clase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Clase1ActionPerformed(evt);
            }
        });
        UnTrayecto.add(CB_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, 30));

        TabsTrayecto.addTab("Solo Ida", UnTrayecto);

        tab_reservas.add(TabsTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 450));

        l_FechaIda.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaIda.setText("Trayecto");
        tab_reservas.add(l_FechaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 20));

        TabsOpciones.addTab("Reservas", tab_reservas);

        tab_vuelos.setBackground(new java.awt.Color(218, 215, 205));

        javax.swing.GroupLayout tab_vuelosLayout = new javax.swing.GroupLayout(tab_vuelos);
        tab_vuelos.setLayout(tab_vuelosLayout);
        tab_vuelosLayout.setHorizontalGroup(
            tab_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        tab_vuelosLayout.setVerticalGroup(
            tab_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        TabsOpciones.addTab("Vuelos", tab_vuelos);

        backG.add(TabsOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 650, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        bExit.setBackground(new java.awt.Color(52,78,65));
    }//GEN-LAST:event_bExitMouseExited

    private void b_buscarVuelos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarVuelos2ActionPerformed
        fechaIda2 = jdcFechaIda2.getDate();
        fechaVuelta = jdcFechaVuelta.getDate();
        String[] datosVueloButtonF=new String[5];

        if (fechaVuelta != null &&  fechaIda2 != null) {
            LocalDate fechaIdaLD = fechaIda2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaVueltaLD = fechaVuelta.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ProgressBar.setValue(10);
            if(fechaIdaLD.isBefore(fechaVueltaLD) || fechaIdaLD.equals(fechaVueltaLD)){

                if ((fechaIdaLD.isAfter(fechaActual) && fechaVueltaLD.isAfter(fechaActual)) ||
                    (fechaIdaLD.equals(fechaActual) && fechaVueltaLD.equals(fechaActual)) ||
                    (fechaIdaLD.equals(fechaActual) && fechaVueltaLD.isAfter(fechaIdaLD)) ) {
                    
                    ProgressBar.setValue(20);
                    
                    if (!(CB_Destino.getItemAt(0).equals("Selecciona origen")) && !(CB_Origen2.getItemAt(0).equals("Seleccionar"))) {
                        ProgressBar.setValue(30);
                        datosVueloButtonF[0]=fechaIdaLD.toString();
                        datosVueloButtonF[1]=fechaVueltaLD.toString();
                        datosVueloButtonF[2]=CB_Origen2.getSelectedItem().toString();
                        datosVueloButtonF[3]=CB_Destino.getSelectedItem().toString();
                        datosVueloButtonF[4]=CB_Clase2.getSelectedItem().toString();
                        datosVueloForm=datosVueloButtonF;
                        JOptionPane.showMessageDialog(null, "Estos son los vuelos para: " + datosVueloButtonF[0]+ " y "+datosVueloButtonF[1]+"\n Trayecto: " + datosVueloButtonF[2]+"-"+datosVueloButtonF[3]+"\n Clase: "+datosVueloButtonF[4]);

                    }else {
                        JOptionPane.showMessageDialog(null, "Seleccione su origen y destino");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione fechas validas");
                }

            }else{
                JOptionPane.showMessageDialog(null, "La fecha de regreso debe ser despues de la de salida");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione las dos fechas");
        }
    }//GEN-LAST:event_b_buscarVuelos2ActionPerformed

    private void CB_Origen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_Origen2MouseClicked
        CB_Origen2.setForeground(Color.BLACK);
        CB_Origen2.removeAllItems();
        CB_Origen2.addItem("Medellín");
        CB_Origen2.addItem("Bogotá");
        CB_Origen2.addItem("San Andrés");
        
    }//GEN-LAST:event_CB_Origen2MouseClicked

    private void CB_Origen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Origen2ActionPerformed
        int selectOrigen = CB_Origen2.getSelectedIndex();
        if(selectOrigen==0){
            CB_Destino.removeAllItems();
            CB_Destino.setForeground(Color.BLACK);
            CB_Destino.addItem("Bogotá");
            CB_Destino.addItem("San Andrés");
        } else {
            CB_Destino.removeAllItems();
            CB_Destino.addItem("Medellín");
        }
    }//GEN-LAST:event_CB_Origen2ActionPerformed

    private void CB_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DestinoActionPerformed

    private void CB_Clase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Clase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Clase2ActionPerformed

    
    
    private void b_buscarVuelos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarVuelos1ActionPerformed
        fechaIda1 = jdcFechaIda1.getDate();
        String[] datosVueloButtonF=new String[5];
        if (fechaIda1 != null) {
            ProgressBar.setValue(10);
            if (!(CB_Origen1.getItemAt(0).equals("Seleccionar"))) {
                LocalDate fechaIdaLD = fechaIda1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                ProgressBar.setValue(20);
                
                if (fechaIdaLD.isAfter(fechaActual) || fechaIdaLD.equals(fechaActual) ) {
                    ProgressBar.setValue(30);
                    datosVueloButtonF[0]=fechaIdaLD.toString();
                    datosVueloButtonF[1]="";
                    datosVueloButtonF[2]=CB_Origen1.getSelectedItem().toString();
                    datosVueloButtonF[3]="";
                    datosVueloButtonF[4]=CB_Clase1.getSelectedItem().toString();
                    datosVueloForm=datosVueloButtonF;
                    JOptionPane.showMessageDialog(null, "Estos son los vuelos para: " + datosVueloButtonF[0]+"\n Origen: " + datosVueloButtonF[2]+"\n Clase: "+datosVueloButtonF[4]);
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione una fecha valida");
                    }
            }else {
                JOptionPane.showMessageDialog(null, "Seleccione su origen");
            }

        }else {
            JOptionPane.showMessageDialog(null, "Seleccione alguna fecha");
        } 
    }//GEN-LAST:event_b_buscarVuelos1ActionPerformed

    private void CB_Origen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_Origen1MouseClicked
        CB_Origen1.setForeground(Color.BLACK);
        CB_Origen1.removeAllItems();
        CB_Origen1.addItem("Medellín");
        CB_Origen1.addItem("Bogotá");
        CB_Origen1.addItem("San Andrés");
    }//GEN-LAST:event_CB_Origen1MouseClicked
 
    private void CB_Origen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Origen1ActionPerformed
        
    }//GEN-LAST:event_CB_Origen1ActionPerformed

    private void CB_Clase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Clase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Clase1ActionPerformed

    private void TabsTrayectoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabsTrayectoStateChanged
        ProgressBar.setValue(0);
    }//GEN-LAST:event_TabsTrayectoStateChanged

    
    //Funciones
    
    public String[] GetDatosVuelo(){
            return datosVueloForm;
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
    public javax.swing.JComboBox<String> CB_Clase1;
    public javax.swing.JComboBox<String> CB_Clase2;
    public javax.swing.JComboBox<String> CB_Destino;
    public javax.swing.JComboBox<String> CB_Origen1;
    public javax.swing.JComboBox<String> CB_Origen2;
    private javax.swing.JPanel DosTrayectos;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JTabbedPane TabsOpciones;
    private javax.swing.JTabbedPane TabsTrayecto;
    private javax.swing.JPanel UnTrayecto;
    private javax.swing.JLabel avionIMG;
    private javax.swing.JButton bExit;
    public javax.swing.JButton b_buscarVuelos1;
    public javax.swing.JButton b_buscarVuelos2;
    private javax.swing.JPanel backG;
    private javax.swing.ButtonGroup bg_trayecto;
    private javax.swing.JPanel header;
    private javax.swing.JPanel info;
    public com.toedter.calendar.JDateChooser jdcFechaIda1;
    public com.toedter.calendar.JDateChooser jdcFechaIda2;
    public com.toedter.calendar.JDateChooser jdcFechaVuelta;
    private javax.swing.JLabel l_Clase1;
    private javax.swing.JLabel l_Clase2;
    private javax.swing.JLabel l_Destino;
    private javax.swing.JLabel l_FechaIda;
    private javax.swing.JLabel l_FechaIda1;
    private javax.swing.JLabel l_FechaIda2;
    private javax.swing.JLabel l_FechaVuelta;
    private javax.swing.JLabel l_Origen;
    private javax.swing.JLabel l_Origen1;
    private javax.swing.JLabel l_TReserva;
    private javax.swing.JLabel l_hoy;
    private javax.swing.JPanel tab_reservas;
    private javax.swing.JPanel tab_vuelos;
    // End of variables declaration//GEN-END:variables
}