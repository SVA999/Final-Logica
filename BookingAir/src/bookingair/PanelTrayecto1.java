package bookingair;


import java.awt.BorderLayout;
import java.awt.Color;
import java.time.*;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author santi
 */
public class PanelTrayecto1 extends javax.swing.JPanel {

    LocalDate fechaActual= LocalDate.now();
    public Date fechaIda, fechaVuelta;
    JPanel panelVuelos = new JPanel(new BorderLayout());
    JPanel selectVuelos = panelVuelos;
    
    public PanelTrayecto1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        l_FechaIda1 = new javax.swing.JLabel();
        jdcFechaIda = new com.toedter.calendar.JDateChooser();
        l_FechaVuelta = new javax.swing.JLabel();
        jdcFechaVuelta = new com.toedter.calendar.JDateChooser();
        b_buscarVuelos = new javax.swing.JButton();
        l_Origen = new javax.swing.JLabel();
        CB_Origen = new javax.swing.JComboBox<>();
        l_Destino = new javax.swing.JLabel();
        CB_Destino = new javax.swing.JComboBox<>();
        l_Clase1 = new javax.swing.JLabel();
        CB_Clase1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(240, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backGround.setBackground(new java.awt.Color(11, 9, 10));
        backGround.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 26, 29), 2, true));
        backGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_FechaIda1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda1.setForeground(new java.awt.Color(255, 255, 255));
        l_FechaIda1.setText("Fecha de salida");
        backGround.add(l_FechaIda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 20));

        jdcFechaIda.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaIda.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        backGround.add(jdcFechaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 30));

        l_FechaVuelta.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaVuelta.setForeground(new java.awt.Color(255, 255, 255));
        l_FechaVuelta.setText("Fecha de regreso");
        backGround.add(l_FechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 20));

        jdcFechaVuelta.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaVuelta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        backGround.add(jdcFechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 30));

        b_buscarVuelos.setBackground(new java.awt.Color(229, 56, 59));
        b_buscarVuelos.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_buscarVuelos.setForeground(new java.awt.Color(255, 255, 255));
        b_buscarVuelos.setText("Buscar vuelos");
        b_buscarVuelos.setBorder(null);
        b_buscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarVuelosActionPerformed(evt);
            }
        });
        backGround.add(b_buscarVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 30));

        l_Origen.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Origen.setForeground(new java.awt.Color(255, 255, 255));
        l_Origen.setText("Origen");
        backGround.add(l_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 20));

        CB_Origen.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Origen.setForeground(new java.awt.Color(153, 153, 153));
        CB_Origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Medellín", "Bogotá", "San Andrés" }));
        CB_Origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_OrigenMouseClicked(evt);
            }
        });
        CB_Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_OrigenActionPerformed(evt);
            }
        });
        backGround.add(CB_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 30));

        l_Destino.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Destino.setForeground(new java.awt.Color(255, 255, 255));
        l_Destino.setText("Destino");
        backGround.add(l_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 20));

        CB_Destino.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Destino.setForeground(new java.awt.Color(153, 153, 153));
        CB_Destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona origen" }));
        CB_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DestinoActionPerformed(evt);
            }
        });
        backGround.add(CB_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 30));

        l_Clase1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Clase1.setForeground(new java.awt.Color(255, 255, 255));
        l_Clase1.setText("Clase");
        backGround.add(l_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 20));

        CB_Clase1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Clase1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Ejecutiva" }));
        CB_Clase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Clase1ActionPerformed(evt);
            }
        });
        backGround.add(CB_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, 30));

        add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void b_buscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarVuelosActionPerformed
        fechaIda = jdcFechaIda.getDate();
        fechaVuelta = jdcFechaVuelta.getDate();

        if (fechaVuelta != null &&  fechaIda != null) {

            LocalDate fechaIdaLD = fechaIda.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaVueltaLD = fechaVuelta.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if(fechaIdaLD.isBefore(fechaVueltaLD) || fechaIdaLD.equals(fechaVueltaLD)){
                
                if ((fechaIdaLD.isAfter(fechaActual) && fechaVueltaLD.isAfter(fechaActual)) || 
                    (fechaIdaLD.equals(fechaActual) && fechaVueltaLD.equals(fechaActual)) || 
                    (fechaIdaLD.equals(fechaActual) && fechaVueltaLD.isAfter(fechaIdaLD)) ) {
                    
                        JOptionPane.showMessageDialog(null, "Estos son los vuelos para: " + fechaIdaLD + " y " + fechaVueltaLD);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione fechas validas");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "La fecha de regreso debe ser despues de la de salida");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione las dos fechas");
        }
    }//GEN-LAST:event_b_buscarVuelosActionPerformed

    private void CB_Clase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Clase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Clase1ActionPerformed

    private void CB_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_OrigenActionPerformed
        int selectOrigen = CB_Origen.getSelectedIndex();
        if(selectOrigen==0){
            CB_Destino.removeAllItems();
            CB_Destino.setForeground(Color.BLACK);
            CB_Destino.addItem("Bogotá");
            CB_Destino.addItem("San Andrés");
        } else {
            CB_Destino.removeAllItems();
            CB_Destino.addItem("Medellín");
        }
    }//GEN-LAST:event_CB_OrigenActionPerformed

    private void CB_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DestinoActionPerformed

    private void CB_OrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_OrigenMouseClicked
            CB_Origen.setForeground(Color.BLACK);
            CB_Origen.removeAllItems();
            CB_Origen.addItem("Medellín");
            CB_Origen.addItem("Bogotá");
            CB_Origen.addItem("San Andrés");
    }//GEN-LAST:event_CB_OrigenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CB_Clase1;
    public javax.swing.JComboBox<String> CB_Destino;
    public javax.swing.JComboBox<String> CB_Origen;
    public javax.swing.JButton b_buscarVuelos;
    private javax.swing.JPanel backGround;
    public com.toedter.calendar.JDateChooser jdcFechaIda;
    public com.toedter.calendar.JDateChooser jdcFechaVuelta;
    private javax.swing.JLabel l_Clase1;
    private javax.swing.JLabel l_Destino;
    private javax.swing.JLabel l_FechaIda1;
    private javax.swing.JLabel l_FechaVuelta;
    private javax.swing.JLabel l_Origen;
    // End of variables declaration//GEN-END:variables
}
