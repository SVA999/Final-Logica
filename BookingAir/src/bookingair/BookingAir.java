package bookingair;

import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class BookingAir {
    
    //Abrir el Formulario
    static f_Reservas form_Reservas = new f_Reservas();
    static JButton b_buscarVuelos1,b_buscarVuelos2;
    static String[] datosVuelo; 

    public static void main(String[] args) {

        try {
            form_Reservas.setVisible(true);
            
            b_buscarVuelos1 = form_Reservas.b_buscarVuelos1;
            b_buscarVuelos2 = form_Reservas.b_buscarVuelos2;
            
            b_buscarVuelos1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    datosVuelo = form_Reservas.GetDatosVuelo();
                    printVectorDatos(datosVuelo);
                }
            });
            
            b_buscarVuelos2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    datosVuelo = form_Reservas.GetDatosVuelo();
                    printVectorDatos(datosVuelo);
                }
            });

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "  + e);
        }
    }
    
    //Funciones
    public static void printVectorDatos(String[] vector) {
        for (int i = 0; i < datosVuelo.length; i++) {
            System.out.print("\tv_ventas[" + i + "] = " + datosVuelo[i]);
            
        }
        System.out.print("\n");
    }
}
