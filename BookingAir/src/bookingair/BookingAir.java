package bookingair;

import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;
import java.io.*;

public class BookingAir {
    
    //Abrir el Formulario
    static f_Reservas form_Reservas = new f_Reservas();
    
    //Objetos Formulario
    //static JButton b_enviarDatos1,b_enviarDatos2, b_imprimirT,b_VaciarDatos;
    
    
    //Archivos
        //Lectura
    public static FileReader file_vuelos;
    public static BufferedReader dato_vuelos;
        //Escritura
    public static FileWriter fileW_Vuelos;
    public static PrintWriter printer_Ticket;
    
    //Datos
        //Del Formulario
    static String[] datosVuelo; 

        //Otros
    static String valorVuelo="";
    static int numeroTicket=0;
    
    
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
            /*b_enviarDatos1 = form_Reservas.b_enviarDatos1;
            b_enviarDatos2 = form_Reservas.b_enviarDatos2;
            b_imprimirT = form_Reservas.b_imprimirT;
            b_VaciarDatos = form_Reservas.b_VaciarDatos;*/
            
            //Definir arcivos
                //Lectura
            //file_vuelos = new FileReader("E:\\Santiago\\Programacion\\UPB\\Proyectos\\Final-Logica\\BookingAir\\src\\bookingair\\files\\vuelos.txt");
            //dato_vuelos= new BufferedReader(file_vuelos);
                //Escritura
            
                
        //Listeners de botones del formulario
                //Boton Reservar en Solo ida
            form_Reservas.b_enviarDatos1.addActionListener(new ActionListener() {
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
                //Boton Reservar en Ida y Vuelta
            form_Reservas.b_enviarDatos2.addActionListener(new ActionListener() {
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
                //Boton Imprimir Tiquete en pestaña Vuelos
            form_Reservas.b_imprimirT.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        PrintTicket();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error:" + e);
                    }
                }
            });
                //Boton Borrar datos pasados
            form_Reservas.b_VaciarDatos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        VaciarCarpeta();
                        numeroTicket=0;
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

    public static void printVectorDatos(String[] vector) {
        for (int i = 0; i < datosVuelo.length; i++) {
            System.out.print("Dato"+ i+": "+datosVuelo[i]+"\t");
        }
        System.out.print("\n");
    }
    
    public static void CalcularPrecio() throws Exception {
        try {
            economica.clear();
            ejecutiva.clear();
            
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

    //Funciones para Imprimir el tiquete
    public static void VaciarCarpeta() throws Exception{
        try {
            File folder = new File("E:/Santiago/Programacion/UPB/Proyectos/Final-Logica/BookingAir/src/bookingair/files/Tickets"); // Reemplaza con la ruta de tu carpeta
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        boolean result = file.delete();
                        if (result) {
                            System.out.println("Archivo eliminado: " + file.getName());
                        } else {
                            System.out.println("No se pudo eliminar el archivo: " + file.getName());
                        }
                    }
                }
            } else {
                System.out.println("No se encontraron archivos en la carpeta.");
            }
        } catch (Exception e) {
            throw new Exception("Error al vaciar carpeta " + e);
        }
    }



    public static String EnumerarTicket() throws Exception{
        try {
            String numeroTicketS="";
            numeroTicket+=1;
            numeroTicketS=""+numeroTicket;
            return numeroTicketS;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Imprimir el ticket: "+e);
            throw new Exception(e);
        }
    }
    
    public static void PrintTicket() throws Exception {
        try {
            String numTicket=EnumerarTicket();
            fileW_Vuelos = new FileWriter("E:/Santiago/Programacion/UPB/Proyectos/Final-Logica/BookingAir/src/bookingair/files/Tickets/ticket"+numTicket+".txt");
            printer_Ticket = new PrintWriter(fileW_Vuelos);

            //Contenido del Ticket
            printer_Ticket.println("Ticket #"+numeroTicket +" |");
            printer_Ticket.println("Código de vuelo "+vuelos.keySet());
            printer_Ticket.println("Silla #"+"NUMERO DE SILLA");
            

            printer_Ticket.println("Clase: "+datosVuelo[3]);
            printer_Ticket.println("Valor: "+valorVuelo);
            
            /*l_datoIdaV.setText("Ida: "+datosVueloForm[0]);
            l_datoVueltaV.setText("Vuelta: "+datosVueloForm[1]);
            l_TrayectoV.setText("Trayecto - Solo ida");
            l_datoTrayectoV.setText(datosVueloForm[2]+ " destino " + CB_Destino1.getSelectedItem().toString());
            l_datoClaseV.setText(datosVueloForm[3]);
            l_datoHoraV.setText(datosVueloForm[4]);*/
            
            

            fileW_Vuelos.close();
            printer_Ticket.close();
            System.out.println("Se ha impreso correctamente ticket"+numTicket+".txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Imprimir el ticket: "+e);
        }
    }
    
}
