package bookingair;

import java.awt.event.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class BookingAir {
    
    //Abrir el Formulario
    static f_Reservas form_Reservas = new f_Reservas();
    static JButton b_enviarDatos1,b_enviarDatos2;
    static String[] datosVuelo; 

    public static void main(String[] args) {

        try {
            form_Reservas.setVisible(true);
            
            b_enviarDatos1 = form_Reservas.b_enviarDatos1;
            b_enviarDatos2 = form_Reservas.b_enviarDatos2;
            
            b_enviarDatos1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    datosVuelo = form_Reservas.GetDatosForm1();
                    printVectorDatos(datosVuelo);
                }
            });
            
            b_enviarDatos2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    datosVuelo = form_Reservas.GetDatosForm2();
                    printVectorDatos(datosVuelo);
                }
            });
            
            
            //Vuelos
            HashMap<String, String[][]>vuelos = new HashMap<>();
            
            //Tarifas
            HashMap<String, String>economica = new HashMap<>();
            HashMap<String, String>ejecutiva = new HashMap<>();

            economica.put("Medellín-Bogotá", "$225.000");
            economica.put("Bogotá-Medellín", "$225.000");
            economica.put("Medellín", "$150.000");
            economica.put("Bogotá", "$150.000");
            economica.put("Medellín-SanAndrés", "$380.000");
            economica.put("SanAndrés-Medellín", "$380.000");
            economica.put("SanAndrés", "$220.000");

            ejecutiva.put("Medellín-Bogotá", "$400.000");
            ejecutiva.put("Bogotá-Medellín", "$400.000");
            ejecutiva.put("Medellín", "$290.000");
            ejecutiva.put("Bogotá", "$290.000");
            ejecutiva.put("Medellín-SanAndrés", "$800.000");
            ejecutiva.put("SanAndrés-Medellín", "$800.000");
            ejecutiva.put("SanAndrés", "$ 450.000");
            

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "  + e);
        }
    }
    
    //Funciones
    public static void printVectorDatos(String[] vector) {
        for (int i = 0; i < datosVuelo.length; i++) {
            System.out.print(datosVuelo[i]+"\t");
        }
        System.out.print("\n");
    }
    /*
    public static String CalcularPrecio(String[]) throws Exception {
        try {
            if (clase.equalsIgnoreCase("Economica")) {
            return economica.getOrDefault(ruta, "Ruta no encontrada");
            } else if (clase.equalsIgnoreCase("Ejecutiva")) {
                return ejecutiva.getOrDefault(ruta, "Ruta no encontrada");
            } else {
            return "Clase no reconocida";
            }
            
        } catch (Exception e) {
        }
    }*/
    
    
}
