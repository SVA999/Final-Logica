package bookingair;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.*;
import java.time.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;


public class f_Reservas extends javax.swing.JFrame {

    int xMouse, yMouse;
    public static LocalDate fechaActual= LocalDate.now();
    public LocalDate fechaIdaLD,fechaVueltaLD;
    public Date fechaIda1, fechaIda2, fechaVuelta;
    public String horaVuelo="";
    public  String[] datosVueloForm = new String[4];
    public  String[] datosVueloEnviar = new String[4];
    public String ClaseMain = "";
    public String Clase = "";
    public static DefaultCategoryDataset datosForm = new DefaultCategoryDataset();;
    
    public f_Reservas() {
        setUndecorated(true);
        initComponents();
        l_hoy.setText(fechaActual.toString()); 
        fechaIdaLD=LocalDate.now();
        fechaVueltaLD=LocalDate.now();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_trayecto = new javax.swing.ButtonGroup();
        backG = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        bExit = new javax.swing.JButton();
        info = new javax.swing.JPanel();
        b_verGraficas = new javax.swing.JButton();
        l_TReserva = new javax.swing.JLabel();
        l_hoy = new javax.swing.JLabel();
        avionIMG = new javax.swing.JLabel();
        b_VaciarDatos = new javax.swing.JButton();
        tf_WallBorrar = new javax.swing.JTextField();
        TabsOpciones = new javax.swing.JTabbedPane();
        l_Hora1 = new javax.swing.JPanel();
        ProgressBar1 = new javax.swing.JProgressBar();
        TabsTrayecto = new javax.swing.JTabbedPane();
        DosTrayectos = new javax.swing.JPanel();
        l_FechaIda1 = new javax.swing.JLabel();
        jdcFechaIda2 = new com.toedter.calendar.JDateChooser();
        l_FechaVuelta = new javax.swing.JLabel();
        jdcFechaVuelta = new com.toedter.calendar.JDateChooser();
        b_comfirDatos2 = new javax.swing.JButton();
        l_Origen = new javax.swing.JLabel();
        CB_Origen2 = new javax.swing.JComboBox<>();
        l_Destino2 = new javax.swing.JLabel();
        CB_Destino2 = new javax.swing.JComboBox<>();
        l_Clase1 = new javax.swing.JLabel();
        CB_Clase2 = new javax.swing.JComboBox<>();
        b_enviarDatos2 = new javax.swing.JButton();
        l_Hora2 = new javax.swing.JLabel();
        CB_Hora2 = new javax.swing.JComboBox<>();
        l_confirmDatos2 = new javax.swing.JLabel();
        TabSection = new javax.swing.JPanel();
        l_FechaIda2 = new javax.swing.JLabel();
        jdcFechaIda1 = new com.toedter.calendar.JDateChooser();
        b_comfirDatos1 = new javax.swing.JButton();
        l_Origen1 = new javax.swing.JLabel();
        CB_Origen1 = new javax.swing.JComboBox<>();
        l_Clase2 = new javax.swing.JLabel();
        CB_Clase1 = new javax.swing.JComboBox<>();
        b_enviarDatos1 = new javax.swing.JButton();
        l_Destino1 = new javax.swing.JLabel();
        CB_Destino1 = new javax.swing.JComboBox<>();
        CB_Hora1 = new javax.swing.JComboBox<>();
        l_Hora = new javax.swing.JLabel();
        l_confirmDatos1 = new javax.swing.JLabel();
        l_FechaIda = new javax.swing.JLabel();
        tab_vuelos = new javax.swing.JPanel();
        ProgressBar2 = new javax.swing.JProgressBar();
        panelTiquete = new javax.swing.JPanel();
        l_PrecioText = new javax.swing.JPanel();
        l_Precio = new javax.swing.JLabel();
        l_PrecioVuelo1 = new javax.swing.JLabel();
        l_HoraV = new javax.swing.JLabel();
        l_FechasV = new javax.swing.JLabel();
        l_TrayectoV = new javax.swing.JLabel();
        l_ClaseV = new javax.swing.JLabel();
        l_datoIdaV = new javax.swing.JLabel();
        l_datoHoraV = new javax.swing.JLabel();
        l_datoVueltaV = new javax.swing.JLabel();
        l_datoTrayectoV = new javax.swing.JLabel();
        l_datoClaseV = new javax.swing.JLabel();
        l_SillaV = new javax.swing.JLabel();
        l_datoSillaV = new javax.swing.JLabel();
        l_Disfruta1 = new javax.swing.JLabel();
        b_imprimirT = new javax.swing.JButton();
        b_volver1 = new javax.swing.JButton();
        l_DisponibleV = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b_volver2 = new javax.swing.JButton();
        panel_Grafica = new javax.swing.JPanel();

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

        b_verGraficas.setBackground(new java.awt.Color(58, 90, 64));
        b_verGraficas.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        b_verGraficas.setForeground(new java.awt.Color(255, 255, 255));
        b_verGraficas.setText("Ver graficas ventas");
        b_verGraficas.setBorder(null);
        b_verGraficas.setFocusable(false);
        b_verGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_verGraficasActionPerformed(evt);
            }
        });
        info.add(b_verGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 30));

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

        b_VaciarDatos.setBackground(new java.awt.Color(88, 129, 87));
        b_VaciarDatos.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        b_VaciarDatos.setForeground(new java.awt.Color(255, 255, 255));
        b_VaciarDatos.setText("Borrar datos");
        b_VaciarDatos.setBorder(null);
        b_VaciarDatos.setEnabled(false);
        b_VaciarDatos.setFocusable(false);
        b_VaciarDatos.setOpaque(true);
        b_VaciarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_VaciarDatosActionPerformed(evt);
            }
        });
        info.add(b_VaciarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 160, 20));

        tf_WallBorrar.setBackground(new java.awt.Color(88, 129, 87));
        tf_WallBorrar.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        tf_WallBorrar.setForeground(new java.awt.Color(58, 90, 64));
        tf_WallBorrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_WallBorrar.setText("Acceso: admin");
        tf_WallBorrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        tf_WallBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_WallBorrarActionPerformed(evt);
            }
        });
        info.add(tf_WallBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 20));

        backG.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 570));

        TabsOpciones.setBackground(new java.awt.Color(218, 215, 205));
        TabsOpciones.setForeground(new java.awt.Color(52, 78, 65));
        TabsOpciones.setToolTipText("");
        TabsOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabsOpciones.setEnabled(false);
        TabsOpciones.setFocusable(false);
        TabsOpciones.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        l_Hora1.setBackground(new java.awt.Color(218, 215, 205));
        l_Hora1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar1.setBackground(new java.awt.Color(245, 243, 244));
        ProgressBar1.setForeground(new java.awt.Color(88, 129, 87));
        l_Hora1.add(ProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 620, 10));

        TabsTrayecto.setBackground(new java.awt.Color(218, 215, 205));
        TabsTrayecto.setForeground(new java.awt.Color(52, 78, 65));
        TabsTrayecto.setToolTipText("");
        TabsTrayecto.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TabsTrayecto.setFocusable(false);
        TabsTrayecto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        TabsTrayecto.setVerifyInputWhenFocusTarget(false);
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
        DosTrayectos.add(l_FechaIda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, 20));

        jdcFechaIda2.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaIda2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        DosTrayectos.add(jdcFechaIda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 30));

        l_FechaVuelta.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaVuelta.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaVuelta.setText("Fecha de regreso");
        DosTrayectos.add(l_FechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 20));

        jdcFechaVuelta.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaVuelta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        DosTrayectos.add(jdcFechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 220, 30));

        b_comfirDatos2.setBackground(new java.awt.Color(88, 129, 87));
        b_comfirDatos2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_comfirDatos2.setForeground(new java.awt.Color(255, 255, 255));
        b_comfirDatos2.setText("Comfirmar Datos");
        b_comfirDatos2.setBorder(null);
        b_comfirDatos2.setFocusable(false);
        b_comfirDatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comfirDatos2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(b_comfirDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 220, 30));

        l_Origen.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Origen.setForeground(new java.awt.Color(52, 78, 65));
        l_Origen.setText("Origen");
        DosTrayectos.add(l_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 180, 20));

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
        DosTrayectos.add(CB_Origen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 220, 30));

        l_Destino2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Destino2.setForeground(new java.awt.Color(52, 78, 65));
        l_Destino2.setText("Destino");
        DosTrayectos.add(l_Destino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 180, 20));

        CB_Destino2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Destino2.setForeground(new java.awt.Color(153, 153, 153));
        CB_Destino2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona origen" }));
        CB_Destino2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Destino2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(CB_Destino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 220, 30));

        l_Clase1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Clase1.setForeground(new java.awt.Color(52, 78, 65));
        l_Clase1.setText("Clase");
        DosTrayectos.add(l_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, 20));

        CB_Clase2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Clase2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Ejecutiva" }));
        CB_Clase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Clase2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(CB_Clase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 220, 30));

        b_enviarDatos2.setBackground(new java.awt.Color(88, 129, 87));
        b_enviarDatos2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_enviarDatos2.setForeground(new java.awt.Color(255, 255, 255));
        b_enviarDatos2.setText("Reservar");
        b_enviarDatos2.setBorder(null);
        b_enviarDatos2.setEnabled(false);
        b_enviarDatos2.setFocusable(false);
        b_enviarDatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enviarDatos2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(b_enviarDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 220, 30));

        l_Hora2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Hora2.setForeground(new java.awt.Color(52, 78, 65));
        l_Hora2.setText("Hora");
        DosTrayectos.add(l_Hora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 20));

        CB_Hora2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Hora2.setForeground(new java.awt.Color(153, 153, 153));
        CB_Hora2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selccionar hora", "7AM", "12AM", "5PM" }));
        CB_Hora2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_Hora2MouseClicked(evt);
            }
        });
        CB_Hora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Hora2ActionPerformed(evt);
            }
        });
        DosTrayectos.add(CB_Hora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 30));

        l_confirmDatos2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        l_confirmDatos2.setForeground(new java.awt.Color(153, 153, 153));
        l_confirmDatos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_confirmDatos2.setText("Requiere confirmar los datos");
        DosTrayectos.add(l_confirmDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 220, 20));

        TabsTrayecto.addTab("Ida y vuela", DosTrayectos);

        TabSection.setBackground(new java.awt.Color(218, 215, 205));
        TabSection.setFocusable(false);
        TabSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_FechaIda2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda2.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaIda2.setText("Fecha de salida");
        TabSection.add(l_FechaIda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, 20));

        jdcFechaIda1.setBackground(new java.awt.Color(177, 167, 166));
        jdcFechaIda1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        TabSection.add(jdcFechaIda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 30));

        b_comfirDatos1.setBackground(new java.awt.Color(88, 129, 87));
        b_comfirDatos1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_comfirDatos1.setForeground(new java.awt.Color(255, 255, 255));
        b_comfirDatos1.setText("Comfirmar Datos");
        b_comfirDatos1.setBorder(null);
        b_comfirDatos1.setFocusable(false);
        b_comfirDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comfirDatos1ActionPerformed(evt);
            }
        });
        TabSection.add(b_comfirDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 220, 30));

        l_Origen1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Origen1.setForeground(new java.awt.Color(52, 78, 65));
        l_Origen1.setText("Origen");
        TabSection.add(l_Origen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 180, 20));

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
        TabSection.add(CB_Origen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 220, 30));

        l_Clase2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Clase2.setForeground(new java.awt.Color(52, 78, 65));
        l_Clase2.setText("Clase");
        TabSection.add(l_Clase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, 20));

        CB_Clase1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Clase1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Ejecutiva" }));
        CB_Clase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Clase1ActionPerformed(evt);
            }
        });
        TabSection.add(CB_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 220, 30));

        b_enviarDatos1.setBackground(new java.awt.Color(88, 129, 87));
        b_enviarDatos1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_enviarDatos1.setForeground(new java.awt.Color(255, 255, 255));
        b_enviarDatos1.setText("Reservar");
        b_enviarDatos1.setBorder(null);
        b_enviarDatos1.setEnabled(false);
        b_enviarDatos1.setFocusable(false);
        b_enviarDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enviarDatos1ActionPerformed(evt);
            }
        });
        TabSection.add(b_enviarDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 220, 30));

        l_Destino1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Destino1.setForeground(new java.awt.Color(52, 78, 65));
        l_Destino1.setText("Destino");
        TabSection.add(l_Destino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 180, 20));

        CB_Destino1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Destino1.setForeground(new java.awt.Color(153, 153, 153));
        CB_Destino1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona origen" }));
        CB_Destino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Destino1ActionPerformed(evt);
            }
        });
        TabSection.add(CB_Destino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 220, 30));

        CB_Hora1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CB_Hora1.setForeground(new java.awt.Color(153, 153, 153));
        CB_Hora1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selccionar hora", "7AM", "12AM", "5PM" }));
        CB_Hora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_Hora1MouseClicked(evt);
            }
        });
        CB_Hora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Hora1ActionPerformed(evt);
            }
        });
        TabSection.add(CB_Hora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 30));

        l_Hora.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Hora.setForeground(new java.awt.Color(52, 78, 65));
        l_Hora.setText("Hora");
        TabSection.add(l_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 20));

        l_confirmDatos1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        l_confirmDatos1.setForeground(new java.awt.Color(153, 153, 153));
        l_confirmDatos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_confirmDatos1.setText("Requiere confirmar los datos");
        TabSection.add(l_confirmDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 220, 20));

        TabsTrayecto.addTab("Solo Ida", TabSection);

        l_Hora1.add(TabsTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 610, 470));

        l_FechaIda.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_FechaIda.setForeground(new java.awt.Color(52, 78, 65));
        l_FechaIda.setText("Trayecto");
        l_Hora1.add(l_FechaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 20));

        TabsOpciones.addTab("Reservas", l_Hora1);

        tab_vuelos.setBackground(new java.awt.Color(218, 215, 205));
        tab_vuelos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar2.setBackground(new java.awt.Color(245, 243, 244));
        ProgressBar2.setForeground(new java.awt.Color(88, 129, 87));
        tab_vuelos.add(ProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 620, 10));

        panelTiquete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_PrecioText.setBackground(new java.awt.Color(58, 90, 64));
        l_PrecioText.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_Precio.setBackground(new java.awt.Color(52, 78, 65));
        l_Precio.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_Precio.setForeground(new java.awt.Color(255, 255, 255));
        l_Precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_Precio.setText("Valor del vuelo");
        l_Precio.setToolTipText("");
        l_PrecioText.add(l_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 330, 20));

        l_PrecioVuelo1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        l_PrecioVuelo1.setForeground(new java.awt.Color(182, 206, 181));
        l_PrecioVuelo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_PrecioVuelo1.setText("$ ------");
        l_PrecioText.add(l_PrecioVuelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 330, 20));

        panelTiquete.add(l_PrecioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 330, 70));

        l_HoraV.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        l_HoraV.setForeground(new java.awt.Color(88, 129, 87));
        l_HoraV.setText("Hora");
        panelTiquete.add(l_HoraV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        l_FechasV.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        l_FechasV.setForeground(new java.awt.Color(88, 129, 87));
        l_FechasV.setText("Fechas:");
        panelTiquete.add(l_FechasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        l_TrayectoV.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        l_TrayectoV.setForeground(new java.awt.Color(88, 129, 87));
        l_TrayectoV.setText("Trayecto");
        panelTiquete.add(l_TrayectoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        l_ClaseV.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        l_ClaseV.setForeground(new java.awt.Color(88, 129, 87));
        l_ClaseV.setText("Clase");
        panelTiquete.add(l_ClaseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        l_datoIdaV.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_datoIdaV.setText("Ida:");
        panelTiquete.add(l_datoIdaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 260, 20));

        l_datoHoraV.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_datoHoraV.setText("hora");
        panelTiquete.add(l_datoHoraV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 20));

        l_datoVueltaV.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_datoVueltaV.setText("Vuelta:");
        panelTiquete.add(l_datoVueltaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 20));

        l_datoTrayectoV.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_datoTrayectoV.setText("Trayecto");
        panelTiquete.add(l_datoTrayectoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 260, 20));

        l_datoClaseV.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_datoClaseV.setText("Clase");
        panelTiquete.add(l_datoClaseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 20));

        l_SillaV.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        l_SillaV.setForeground(new java.awt.Color(88, 129, 87));
        l_SillaV.setText("Silla");
        panelTiquete.add(l_SillaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        l_datoSillaV.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        l_datoSillaV.setText("Silla");
        panelTiquete.add(l_datoSillaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, 20));

        l_Disfruta1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        l_Disfruta1.setForeground(new java.awt.Color(88, 129, 87));
        l_Disfruta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_Disfruta1.setText("Disfruta tu vuelo");
        panelTiquete.add(l_Disfruta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 330, 20));

        tab_vuelos.add(panelTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 330, 400));

        b_imprimirT.setBackground(new java.awt.Color(88, 129, 87));
        b_imprimirT.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_imprimirT.setForeground(new java.awt.Color(255, 255, 255));
        b_imprimirT.setText("Imprimir Tiquete");
        b_imprimirT.setBorder(null);
        b_imprimirT.setFocusable(false);
        b_imprimirT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_imprimirTActionPerformed(evt);
            }
        });
        tab_vuelos.add(b_imprimirT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 220, 30));

        b_volver1.setBackground(new java.awt.Color(88, 129, 87));
        b_volver1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_volver1.setForeground(new java.awt.Color(255, 255, 255));
        b_volver1.setText("Volver");
        b_volver1.setBorder(null);
        b_volver1.setEnabled(false);
        b_volver1.setFocusable(false);
        b_volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volver1ActionPerformed(evt);
            }
        });
        tab_vuelos.add(b_volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 220, 30));

        l_DisponibleV.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        l_DisponibleV.setForeground(new java.awt.Color(88, 129, 87));
        l_DisponibleV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_DisponibleV.setText("Disponible");
        tab_vuelos.add(l_DisponibleV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 20));

        TabsOpciones.addTab("Vuelos", tab_vuelos);

        jPanel1.setBackground(new java.awt.Color(218, 215, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_volver2.setBackground(new java.awt.Color(88, 129, 87));
        b_volver2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        b_volver2.setForeground(new java.awt.Color(255, 255, 255));
        b_volver2.setText("Volver a reservas");
        b_volver2.setBorder(null);
        b_volver2.setFocusable(false);
        b_volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volver2ActionPerformed(evt);
            }
        });
        jPanel1.add(b_volver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 220, 30));

        javax.swing.GroupLayout panel_GraficaLayout = new javax.swing.GroupLayout(panel_Grafica);
        panel_Grafica.setLayout(panel_GraficaLayout);
        panel_GraficaLayout.setHorizontalGroup(
            panel_GraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panel_GraficaLayout.setVerticalGroup(
            panel_GraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(panel_Grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 550, 400));

        TabsOpciones.addTab("Graficas Vuelos", jPanel1);

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

    private void b_comfirDatos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comfirDatos2ActionPerformed
        fechaIda2 = jdcFechaIda2.getDate();
        fechaVuelta = jdcFechaVuelta.getDate();
        datosVueloForm=new String[4];
        Clase = "";

        if (fechaVuelta != null &&  fechaIda2 != null) {
            fechaIdaLD = fechaIda2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fechaVueltaLD = fechaVuelta.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ProgressBar1.setValue(20);
            if(fechaIdaLD.isBefore(fechaVueltaLD) || fechaIdaLD.equals(fechaVueltaLD)){

                if ((fechaIdaLD.isAfter(fechaActual) && fechaVueltaLD.isAfter(fechaActual)) ||
                    (fechaIdaLD.equals(fechaActual) && fechaVueltaLD.isAfter(fechaIdaLD)) ) {
                    
                    ProgressBar1.setValue(40);
                    
                    if (!(CB_Destino2.getItemAt(0).equals("Selecciona origen")) && !(CB_Origen2.getItemAt(0).equals("Seleccionar"))) {
                        ProgressBar1.setValue(60);
                        
                        if (!(CB_Hora2.getItemAt(0).equals("Selccionar hora"))) {
                            ProgressBar1.setValue(80);
                            datosVueloForm[0]=fechaIdaLD.toString();
                            datosVueloForm[1]=fechaVueltaLD.toString();
                            datosVueloForm[2]=CB_Origen2.getSelectedItem().toString()+"-"+CB_Destino2.getSelectedItem().toString();
                            datosVueloForm[3]=CB_Hora2.getSelectedItem().toString();
                            Clase=CB_Clase2.getSelectedItem().toString();
                            b_enviarDatos2.setEnabled(true);
                            l_confirmDatos2.setText("Ahora pudes reservar sin problemas");
                            //JOptionPane.showMessageDialog(null, "Estos son los vuelos para: " + datosVueloForm[0]+ " y "+datosVueloForm[1]+"\n Trayecto: " + datosVueloForm[2]+"\n Clase: "+datosVueloForm[3]+"\n Hora: "+datosVueloForm[4]);
                        } else {
                            JOptionPane.showMessageDialog(null, "Seleccione una hora");
                        }
                    }else {
                        JOptionPane.showMessageDialog(null, "Seleccione su origen y destino");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione fechas validas\n -No fechas anteriores a hoy\n -La fecha de regreso debe ser despues de la de ida");
                }

            }else{
                JOptionPane.showMessageDialog(null, "La fecha de regreso debe ser despues de la de salida");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione las dos fechas");
        }
    }//GEN-LAST:event_b_comfirDatos2ActionPerformed

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
            CB_Destino2.removeAllItems();
            CB_Destino2.setForeground(Color.BLACK);
            CB_Destino2.addItem("Bogotá");
            CB_Destino2.addItem("San Andrés");
        } else {
            CB_Destino2.removeAllItems();
            CB_Destino2.addItem("Medellín");
        }
    }//GEN-LAST:event_CB_Origen2ActionPerformed

    private void CB_Destino2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Destino2ActionPerformed
        int selectOrigen = CB_Origen2.getSelectedIndex();
        int selectDestino = CB_Origen2.getSelectedIndex();
        CB_Hora2.setForeground(Color.BLACK);
        if((selectOrigen==0 && selectDestino==1)||(selectOrigen==2)){
            CB_Hora2.removeAllItems();
            CB_Hora2.addItem("7AM");
        } else {
            CB_Hora2.removeAllItems();
            CB_Hora2.addItem("7AM");
            CB_Hora2.addItem("12AM");
            CB_Hora2.addItem("5PM");
        }
    }//GEN-LAST:event_CB_Destino2ActionPerformed

    private void CB_Clase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Clase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Clase2ActionPerformed

    
    
    private void b_comfirDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comfirDatos1ActionPerformed
        fechaIda1 = jdcFechaIda1.getDate();
        datosVueloForm=new String[4];
        Clase = "";
        
        if (fechaIda1 != null) {
            ProgressBar1.setValue(20);
            if (!(CB_Origen1.getItemAt(0).equals("Seleccionar"))) {
                fechaIdaLD = fechaIda1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                ProgressBar1.setValue(40);
                
                if (fechaIdaLD.isAfter(fechaActual) || fechaIdaLD.equals(fechaActual) ) {
                    ProgressBar1.setValue(60);
                    if (!(CB_Hora1.getItemAt(0).equals("Selccionar hora"))) {
                            
                        ProgressBar1.setValue(80);
                        datosVueloForm[0]=fechaIdaLD.toString();
                        datosVueloForm[1]="";
                        if (CB_Destino1.getSelectedItem()=="San Andrés") {
                            datosVueloForm[2]=CB_Origen1.getSelectedItem().toString()+"ToS";
                        } else if (CB_Destino1.getSelectedItem()=="Bogotá"){
                            datosVueloForm[2]=CB_Origen1.getSelectedItem().toString()+"ToB";
                        } else{
                            datosVueloForm[2]=CB_Origen1.getSelectedItem().toString();
                        }
                        datosVueloForm[3]=CB_Hora1.getSelectedItem().toString();
                        Clase=CB_Clase1.getSelectedItem().toString();
                        b_enviarDatos1.setEnabled(true);
                        l_confirmDatos1.setText("Ahora pudes reservar sin problemas");
                        //JOptionPane.showMessageDialog(null, "Estos son los vuelos para: " + datosVueloForm[0]+"\n Origen: " + datosVueloForm[2]+"\n Clase: "+datosVueloForm[3]+"\n Hora: "+datosVueloForm[4]);
                        
                        } else {
                            JOptionPane.showMessageDialog(null, "Seleccione una hora");
                        }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una fecha valida\n -No fecha anterior a hoy");
                }
            }else {
                JOptionPane.showMessageDialog(null, "Seleccione su origen");
            }

        }else {
            JOptionPane.showMessageDialog(null, "Seleccione alguna fecha");
        } 
    }//GEN-LAST:event_b_comfirDatos1ActionPerformed

    private void CB_Origen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_Origen1MouseClicked
        CB_Origen1.setForeground(Color.BLACK);
        CB_Origen1.removeAllItems();
        CB_Origen1.addItem("Medellín");
        CB_Origen1.addItem("Bogotá");
        CB_Origen1.addItem("San Andrés");
    }//GEN-LAST:event_CB_Origen1MouseClicked
 
    private void CB_Origen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Origen1ActionPerformed
        int selectOrigen = CB_Origen1.getSelectedIndex();
        if(selectOrigen==0){
            CB_Destino1.removeAllItems();
            CB_Destino1.setForeground(Color.BLACK);
            CB_Destino1.addItem("Bogotá");
            CB_Destino1.addItem("San Andrés");
        } else {
            CB_Destino1.removeAllItems();
            CB_Destino1.addItem("Medellín");
        }
    }//GEN-LAST:event_CB_Origen1ActionPerformed

    private void CB_Clase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Clase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Clase1ActionPerformed

    private void TabsTrayectoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabsTrayectoStateChanged
        ProgressBar1.setValue(0);
        l_PrecioVuelo1.setText("$------");
    }//GEN-LAST:event_TabsTrayectoStateChanged

    private void b_enviarDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enviarDatos1ActionPerformed
        b_enviarDatos1.setEnabled(false);
        b_imprimirT.setEnabled(true);
        ProgressBar2.setValue(100);
        l_confirmDatos1.setText("Requiere confirmar los datos");
        //TabsOpciones.setEnabled(true);
        l_datoIdaV.setText("Ida: "+datosVueloForm[0]);
        l_datoVueltaV.setText("Vuelta: "+datosVueloForm[1]);
        l_TrayectoV.setText("Trayecto - Solo ida");
        l_datoTrayectoV.setText(datosVueloForm[2]+ " destino " + CB_Destino1.getSelectedItem().toString());
        l_datoClaseV.setText(Clase);
        l_datoHoraV.setText(datosVueloForm[3]);
        if ("No Disponible".equals(l_DisponibleV.getText())) {
            TabsOpciones.setSelectedIndex(0);
            l_DisponibleV.setText("Disponible");
        } else {
            TabsOpciones.setSelectedIndex(1);
        }
        //JOptionPane.showMessageDialog(null, "Reservando e imprimiendo Ticket");
    }//GEN-LAST:event_b_enviarDatos1ActionPerformed

    private void b_enviarDatos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enviarDatos2ActionPerformed
        b_enviarDatos2.setEnabled(false);
        b_imprimirT.setEnabled(true);
        ProgressBar2.setValue(100);
        l_confirmDatos2.setText("Requiere confirmar los datos");
        //TabsOpciones.setEnabled(true);
        l_datoIdaV.setText("Ida: "+datosVueloForm[0]);
        l_datoVueltaV.setText("Vuelta: "+datosVueloForm[1]);
        l_TrayectoV.setText("Trayecto - Ida y Vuelta");
        l_datoTrayectoV.setText(datosVueloForm[2]);
        l_datoClaseV.setText(Clase);
        l_datoHoraV.setText(datosVueloForm[3]);
        if ("No Disponible".equals(l_DisponibleV.getText())) {
            TabsOpciones.setSelectedIndex(0);
            l_DisponibleV.setText("Disponible");
        } else {
            TabsOpciones.setSelectedIndex(1);
        }
        //JOptionPane.showMessageDialog(null, "Reservando e imprimiendo Ticket");
    }//GEN-LAST:event_b_enviarDatos2ActionPerformed

    private void CB_Destino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Destino1ActionPerformed
        int selectOrigen = CB_Origen1.getSelectedIndex();
        int selectDestino = CB_Destino1.getSelectedIndex();
        CB_Hora1.setForeground(Color.BLACK);
        if((selectOrigen==0 && selectDestino==1)||(selectOrigen==2)){
            CB_Hora1.removeAllItems();
            CB_Hora1.addItem("7AM");
        } else {
            CB_Hora1.removeAllItems();
            CB_Hora1.addItem("7AM");
            CB_Hora1.addItem("12AM");
            CB_Hora1.addItem("5PM");
        }
    }//GEN-LAST:event_CB_Destino1ActionPerformed

    private void CB_Hora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Hora1ActionPerformed

    }//GEN-LAST:event_CB_Hora1ActionPerformed

    private void CB_Hora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_Hora1MouseClicked
        int selectOrigen = CB_Origen1.getSelectedIndex();
        int selectDestino = CB_Destino1.getSelectedIndex();
        CB_Hora1.setForeground(Color.BLACK);
        if((selectOrigen==0 && selectDestino==1)||(selectOrigen==2)){
            CB_Hora1.removeAllItems();
            CB_Hora1.addItem("7AM");
        } else {
            CB_Hora1.removeAllItems();
            CB_Hora1.addItem("7AM");
            CB_Hora1.addItem("12AM");
            CB_Hora1.addItem("5PM");
        }
    }//GEN-LAST:event_CB_Hora1MouseClicked

    private void CB_Hora2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_Hora2MouseClicked
        int selectOrigen = CB_Origen2.getSelectedIndex();
        int selectDestino = CB_Destino2.getSelectedIndex();
        CB_Hora2.setForeground(Color.BLACK);
        if((selectOrigen==0 && selectDestino==1)||(selectOrigen==2)){
            CB_Hora2.removeAllItems();
            CB_Hora2.addItem("7AM");
        } else {
            CB_Hora2.removeAllItems();
            CB_Hora2.addItem("7AM");
            CB_Hora2.addItem("12AM");
            CB_Hora2.addItem("5PM");
        }
    }//GEN-LAST:event_CB_Hora2MouseClicked

    private void CB_Hora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Hora2ActionPerformed

    }//GEN-LAST:event_CB_Hora2ActionPerformed

    private void b_imprimirTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_imprimirTActionPerformed
        JOptionPane.showMessageDialog(null,"Imprimiendo");
        b_volver1.setEnabled(true);
        b_imprimirT.setEnabled(false);
    }//GEN-LAST:event_b_imprimirTActionPerformed

    private void b_volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver1ActionPerformed
        TabsOpciones.setSelectedIndex(0);
        ProgressBar1.setValue(0);
        b_volver1.setEnabled(false);
    }//GEN-LAST:event_b_volver1ActionPerformed

    private void b_VaciarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_VaciarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_VaciarDatosActionPerformed

    private void tf_WallBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_WallBorrarActionPerformed
        if (tf_WallBorrar.getText().equals("admin")) {
            b_VaciarDatos.setEnabled(true);
        } else{
            b_VaciarDatos.setEnabled(false);
        }
    }//GEN-LAST:event_tf_WallBorrarActionPerformed

    private void b_volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver2ActionPerformed
        TabsOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_b_volver2ActionPerformed

    private void b_verGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_verGraficasActionPerformed
        TabsOpciones.setSelectedIndex(2);
        
        JFreeChart graficoVuelos2D = ChartFactory.createBarChart(
                "Cantidad venta de tiquetes", 
                "Trayecto", 
                "Cantidad", 
                datosForm, 
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                false
        );
        
        JFreeChart graficoVuelos3D = ChartFactory.createBarChart3D(
                "Cantidad venta de tiquetes",
                "Trayecto",
                "Cantidad",
                datosForm, 
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                false
        );
        
        ChartPanel panelGraficas = new ChartPanel(graficoVuelos2D);
        panelGraficas.setMouseWheelEnabled(true);
        panelGraficas.setPreferredSize(new Dimension(550,400));
        
        panel_Grafica.setLayout(new BorderLayout());
        panel_Grafica.add(panelGraficas,BorderLayout.NORTH);
        pack();
        repaint();
     
    }//GEN-LAST:event_b_verGraficasActionPerformed

    
    //Funciones
    
    public String[] GetDatosForm(){
        datosVueloEnviar=datosVueloForm;
        return datosVueloEnviar;
    }
    
    public String GetClase(){
        ClaseMain=Clase;
        return ClaseMain;
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
    public javax.swing.JComboBox<String> CB_Destino1;
    public javax.swing.JComboBox<String> CB_Destino2;
    public javax.swing.JComboBox<String> CB_Hora1;
    public javax.swing.JComboBox<String> CB_Hora2;
    public javax.swing.JComboBox<String> CB_Origen1;
    public javax.swing.JComboBox<String> CB_Origen2;
    private javax.swing.JPanel DosTrayectos;
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JProgressBar ProgressBar2;
    private javax.swing.JPanel TabSection;
    public static javax.swing.JTabbedPane TabsOpciones;
    private javax.swing.JTabbedPane TabsTrayecto;
    private javax.swing.JLabel avionIMG;
    private javax.swing.JButton bExit;
    public javax.swing.JButton b_VaciarDatos;
    public javax.swing.JButton b_comfirDatos1;
    public javax.swing.JButton b_comfirDatos2;
    public javax.swing.JButton b_enviarDatos1;
    public javax.swing.JButton b_enviarDatos2;
    public javax.swing.JButton b_imprimirT;
    public javax.swing.JButton b_verGraficas;
    public javax.swing.JButton b_volver1;
    public javax.swing.JButton b_volver2;
    private javax.swing.JPanel backG;
    private javax.swing.ButtonGroup bg_trayecto;
    private javax.swing.JPanel header;
    public javax.swing.JPanel info;
    private javax.swing.JPanel jPanel1;
    public com.toedter.calendar.JDateChooser jdcFechaIda1;
    public com.toedter.calendar.JDateChooser jdcFechaIda2;
    public com.toedter.calendar.JDateChooser jdcFechaVuelta;
    private javax.swing.JLabel l_Clase1;
    private javax.swing.JLabel l_Clase2;
    private javax.swing.JLabel l_ClaseV;
    private javax.swing.JLabel l_Destino1;
    private javax.swing.JLabel l_Destino2;
    private javax.swing.JLabel l_Disfruta1;
    public javax.swing.JLabel l_DisponibleV;
    private javax.swing.JLabel l_FechaIda;
    private javax.swing.JLabel l_FechaIda1;
    private javax.swing.JLabel l_FechaIda2;
    private javax.swing.JLabel l_FechaVuelta;
    private javax.swing.JLabel l_FechasV;
    private javax.swing.JLabel l_Hora;
    private javax.swing.JPanel l_Hora1;
    private javax.swing.JLabel l_Hora2;
    private javax.swing.JLabel l_HoraV;
    private javax.swing.JLabel l_Origen;
    private javax.swing.JLabel l_Origen1;
    private javax.swing.JLabel l_Precio;
    public static javax.swing.JPanel l_PrecioText;
    public javax.swing.JLabel l_PrecioVuelo1;
    private javax.swing.JLabel l_SillaV;
    private javax.swing.JLabel l_TReserva;
    private javax.swing.JLabel l_TrayectoV;
    private javax.swing.JLabel l_confirmDatos1;
    private javax.swing.JLabel l_confirmDatos2;
    private javax.swing.JLabel l_datoClaseV;
    private javax.swing.JLabel l_datoHoraV;
    private javax.swing.JLabel l_datoIdaV;
    public javax.swing.JLabel l_datoSillaV;
    private javax.swing.JLabel l_datoTrayectoV;
    private javax.swing.JLabel l_datoVueltaV;
    private javax.swing.JLabel l_hoy;
    private javax.swing.JPanel panelTiquete;
    private javax.swing.JPanel panel_Grafica;
    private javax.swing.JPanel tab_vuelos;
    private javax.swing.JTextField tf_WallBorrar;
    // End of variables declaration//GEN-END:variables
}