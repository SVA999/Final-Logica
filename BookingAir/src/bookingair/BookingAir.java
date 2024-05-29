package bookingair;

import java.awt.event.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BookingAir {
    
    //Abrir el Formulario
    static f_Reservas form_Reservas = new f_Reservas();
    static String[] datosVuelo; 
    
    //Objetos Formulario
    static JButton b_enviarDatos1,b_enviarDatos2;
    static JLabel l_PrecioVuelo1;
    
    //Datos
    static String valorVuelo="";
    
    
    //HashMap Vuelos
    static HashMap<String, String[][]>vuelos = new HashMap<>();
    
    //HashMap Tarifas
    static HashMap<String, String>economica = new HashMap<String, String>();
    static HashMap<String, String>ejecutiva = new HashMap<String, String>();

    public static void main(String[] args) {

        try {
            //Mostrar Formulario
            form_Reservas.setVisible(true);
            
            //Definir Objetos Formulario
            b_enviarDatos1 = form_Reservas.b_enviarDatos1;
            b_enviarDatos2 = form_Reservas.b_enviarDatos2;
            
            
            b_enviarDatos1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        datosVuelo = form_Reservas.GetDatosForm();
                        printVectorDatos(datosVuelo);
                        CalcularPrecio();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error:" + e);
                    }
                }
            });
            
            b_enviarDatos2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        datosVuelo = form_Reservas.GetDatosForm();
                        printVectorDatos(datosVuelo);
                        CalcularPrecio();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error:" + e);
                    }
                }
            });
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "  + e);
        }
    }
    
    //Funciones
    
    public String SendValor(){
        return valorVuelo;
    }
    
    
    public static void printVectorDatos(String[] vector) {
        for (int i = 0; i < datosVuelo.length; i++) {
            System.out.print("Dato"+ i+": "+datosVuelo[i]+"\t");
        }
        System.out.print("\n");
    }
    
    public static void CalcularPrecio() throws Exception {
        try {
            economica.put("Medellín-Bogotá", "$225.000");
            economica.put("Bogotá-Medellín", "$225.000");
            economica.put("Medellín", "$150.000");
            economica.put("Bogotá", "$150.000");
            economica.put("Medellín-San Andrés", "$380.000");
            economica.put("San Andrés-Medellín", "$380.000");
            economica.put("San Andrés", "$220.000");

            ejecutiva.put("Medellín-Bogotá", "$400.000");
            ejecutiva.put("Bogotá-Medellín", "$400.000");
            ejecutiva.put("Medellín", "$290.000");
            ejecutiva.put("Bogotá", "$290.000");
            ejecutiva.put("Medellín-San Andrés", "$800.000");
            ejecutiva.put("San Andrés-Medellín", "$800.000");
            ejecutiva.put("San Andrés", "$ 450.000");
            
            if (datosVuelo[3].equalsIgnoreCase("Económica")) {
                for (String key : economica.keySet()) {
                    if (datosVuelo[2].equalsIgnoreCase(key)) {
                        valorVuelo=economica.get(key);
                    } 
                }
                System.out.println(valorVuelo);
                form_Reservas.l_PrecioVuelo1.setText(valorVuelo);
  
            } else if (datosVuelo[3].equalsIgnoreCase("Ejecutiva")) {
                for (String key : ejecutiva.keySet()) {
                    if (datosVuelo[2].equalsIgnoreCase(key)) {
                        valorVuelo=ejecutiva.get(key);
                    } 
                }
                System.out.println(valorVuelo);
                form_Reservas.l_PrecioVuelo1.setText(valorVuelo);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Calcular el valor del vuelo: "+e);
            throw new Exception(e);
        }
    }
    
    
}
